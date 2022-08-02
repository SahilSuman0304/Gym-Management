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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;


public class TotalMember extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TotalMember frame = new TotalMember();
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
	public TotalMember() {
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
		
		JLabel lblNewLabel_1 = new JLabel("TOTAL MEMBERS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 218, 185));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(10, 11, 406, 34);
		panel_2.add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 106, 1303, 414);
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
		btnExit.setBounds(646, 549, 152, 37);
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
