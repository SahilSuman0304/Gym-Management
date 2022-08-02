package frontPages;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;
import utility.DBUtility;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class SearchMember extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField sid;
	private JTextField sname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchMember frame = new SearchMember();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchMember() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setBounds(100, 100, 1263, 710);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(139, 69, 19));
		panel.setBorder(new LineBorder(new Color(255, 218, 185), 4, true));
		panel.setBounds(0, 0, 1365, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblStudentManagementSystem = new JLabel("GYM MANAGEMENT SYSTEM");
		lblStudentManagementSystem.setFont(new Font("Serif", Font.BOLD, 50));
		lblStudentManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblStudentManagementSystem.setForeground(new Color(255, 218, 185));
		lblStudentManagementSystem.setBounds(303, 11, 748, 53);
		panel.add(lblStudentManagementSystem);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 218, 185));
		panel_1.setBorder(new LineBorder(new Color(255, 218, 185), 4, true));
		panel_1.setBounds(0, 76, 1365, 670);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(255, 218, 185), 4, true));
		panel_2.setBackground(new Color(139, 69, 19));
		panel_2.setBounds(483, 21, 426, 56);
		panel_1.add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("SEARCH MEMBERS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 218, 185));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(10, 11, 406, 34);
		panel_2.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(35, 138, 1303, 414);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		Connection con=DBUtility.connection();
		String query="select * from tmember";
		try {
			PreparedStatement stmt=con.prepareStatement(query);
			ResultSet rs=stmt.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int yesOrNo=JOptionPane.showConfirmDialog(null,"Do you want to exit?");
				if(yesOrNo==0)
				{
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(645, 563, 152, 37);
		panel_1.add(btnExit);
		 
		  JButton back = new JButton("Back");
		  back.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		Home h = new Home();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  back.setBackground(new Color(255, 228, 181));
		  back.setFont(new Font("Tahoma", Font.BOLD, 15));
		  back.setForeground(new Color(139, 69, 19));
			back.setBounds(5, 0, 89, 23);
			panel_1.add(back);  
			
			JLabel lblNewLabel = new JLabel("Search By Id :-");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblNewLabel.setForeground(new Color(255, 228, 181));
			lblNewLabel.setBounds(206, 88, 197, 38);
			panel_1.add(lblNewLabel);
			
			sid = new JTextField();
			sid.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e)
				{
					char c=e.getKeyChar();
					if(Character.isLetter(c))
					{ 
						sid.setEditable(false);
						JOptionPane.showMessageDialog(null,"Enter only number.");
					}
					else
					{
						sid.setEditable(true);
					}
				}
			});
			sid.setBounds(353, 97, 181, 23);
			panel_1.add(sid);
			sid.setColumns(10);
			
			JButton btnNewButton = new JButton("Search");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					Connection con=DBUtility.connection();
					String i=sid.getText();
					
					if(i.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Enter Member Id to search.");
					}
					
					else
					{
						int id=Integer.parseInt(i);
						String query="select * from tmember where MemberId="+id;
						try {
							PreparedStatement stmt=con.prepareStatement(query);
							ResultSet rs=stmt.executeQuery();
							table.setModel(DbUtils.resultSetToTableModel(rs));
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
					
				}
			});
			btnNewButton.setForeground(new Color(139, 69, 19));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton.setBackground(new Color(255, 228, 181));
			btnNewButton.setBounds(554, 96, 89, 23);
			panel_1.add(btnNewButton);
			
			JLabel snamejabel = new JLabel("Search By Name :-");
			snamejabel.setForeground(new Color(255, 228, 181));
			snamejabel.setFont(new Font("Tahoma", Font.BOLD, 17));
			snamejabel.setBounds(765, 88, 197, 38);
			panel_1.add(snamejabel);
			
			sname = new JTextField();
			sname.setColumns(10);
			sname.setBounds(927, 98, 181, 23);
			panel_1.add(sname);
			
			JButton btnNewButton_1 = new JButton("Search");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					Connection con=DBUtility.connection();
					String name=sname.getText();
					
					if(name.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Enter Member Name to search.");
					}
					
					else
					{
						String query="select * from tmember where name like '%"+name+"%'";
						try {
							PreparedStatement stmt=con.prepareStatement(query);
							ResultSet rs=stmt.executeQuery();
							table.setModel(DbUtils.resultSetToTableModel(rs));
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}

				}
			});
			btnNewButton_1.setForeground(new Color(139, 69, 19));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton_1.setBackground(new Color(255, 228, 181));
			btnNewButton_1.setBounds(1128, 97, 89, 23);
			panel_1.add(btnNewButton_1);
		  
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(5, 0, 1354, 624);
		ImageIcon i=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\gymBacg.jpg");
		Image image=i.getImage();
		Image imgScale=image.getScaledInstance(lblNewLabel1.getWidth(),lblNewLabel1.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon=new ImageIcon(imgScale); 
		lblNewLabel1.setIcon(scaledIcon);
		panel_1.add(lblNewLabel1);
		
		
		
		
		
		
		
		
	}
}
