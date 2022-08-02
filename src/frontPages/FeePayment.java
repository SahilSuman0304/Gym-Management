package frontPages;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import memberDao.MemberFeeDaoImp;
import memberPojo.MemberFee;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


public class FeePayment extends JFrame {

	private JPanel contentPane;
	private JTextField id;
	private JTextField from;
	private JTextField to;
	private JTextField fee;
	private JTextField date;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeePayment frame = new FeePayment();
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
	public FeePayment() {
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
		
		JPanel main = new JPanel();
		main.setBorder(new LineBorder(new Color(255, 218, 185), 4));
		main.setForeground(new Color(255, 218, 185));
		main.setBackground(new Color(139, 69, 19));
		main.setBounds(283, 51, 827, 523);
		panel_1.add(main);
		main.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FEE PAYMENT");
		lblNewLabel.setForeground(new Color(255, 218, 185));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(189, 11, 474, 45);
		main.add(lblNewLabel);
		
		JLabel lblMemberId = new JLabel("Member Id:-");
		lblMemberId.setForeground(new Color(255, 218, 185));
		lblMemberId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMemberId.setBounds(189, 89, 133, 27);
		main.add(lblMemberId);
		
		JLabel v1 = new JLabel("*");
		v1.setForeground(Color.RED);
		v1.setBounds(562, 95, 148, 23);
		main.add(v1);
		
		id = new JTextField();
		id.setFont(new Font("Tahoma", Font.ITALIC, 15));
		id.setColumns(10);
		id.setBounds(332, 91, 206, 25);
		id.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{ 
					v1.setText("Enter only number.");
					id.setEditable(false);
				}
				else
				{
					id.setEditable(true);
				}
			}
		});
		main.add(id);
		
		
		
		JLabel lblFrom = new JLabel("From :-");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setForeground(new Color(255, 218, 185));
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(189, 146, 133, 27);
		main.add(lblFrom);
		
		from = new JTextField();
		from.setFont(new Font("Tahoma", Font.ITALIC, 15));
		from.setColumns(10);
		from.setBounds(332, 148, 206, 25);
		main.add(from);
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(Color.RED);
		v2.setBounds(562, 152, 148, 23);
		main.add(v2);
		
		JLabel lblTo = new JLabel("To :-");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setForeground(new Color(255, 218, 185));
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTo.setBounds(189, 204, 133, 27);
		main.add(lblTo);
		
		to = new JTextField();
		to.setFont(new Font("Tahoma", Font.ITALIC, 15));
		to.setColumns(10);
		to.setBounds(332, 206, 206, 25);
		main.add(to);
		
		JLabel v3 = new JLabel("*");
		v3.setForeground(Color.RED);
		v3.setBounds(562, 210, 148, 23);
		main.add(v3);
		
		JLabel lblFeePaid = new JLabel("Fee Paid:-");
		lblFeePaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeePaid.setForeground(new Color(255, 218, 185));
		lblFeePaid.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFeePaid.setBounds(189, 264, 133, 27);
		main.add(lblFeePaid);
		
		JLabel v4 = new JLabel("*");
		v4.setForeground(Color.RED);
		v4.setBounds(562, 270, 148, 23);
		main.add(v4);
		
		fee = new JTextField();
		fee.setFont(new Font("Tahoma", Font.ITALIC, 15));
		fee.setColumns(10);
		fee.setBounds(332, 266, 206, 25);
		fee.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{ 
					v4.setText("Enter only number.");
					fee.setEditable(false);
				}
				else
				{
					fee.setEditable(true);
				}
			}
		});
		main.add(fee);
		
		
		
		JLabel lblDate = new JLabel("Date :-");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(new Color(255, 218, 185));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(189, 325, 133, 27);
		main.add(lblDate);
		
		date = new JTextField();
		date.setFont(new Font("Tahoma", Font.ITALIC, 15));
		date.setColumns(10);
		date.setBounds(332, 327, 206, 25);
		main.add(date);
		
		JLabel v5 = new JLabel("*");
		v5.setForeground(Color.RED);
		v5.setBounds(562, 331, 148, 23);
		main.add(v5);
		
		JButton btnNewButton = new JButton("ADD MEMBER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String mid=id.getText();
				String dfrom=from.getText();
				String dto=to.getText();
				String mfee=fee.getText();
				String d=date.getText();
				
				if(mid.trim().isEmpty())
				{
					v1.setText("This field is required.");
				}
				
				else if(dfrom.trim().isEmpty())
				{
					v2.setText("This field is required.");
				}
				
				else if(dto.trim().isEmpty())
				{
					v3.setText("This field is required.");
				}
				
				else if(mfee.trim().isEmpty())
				{
					v4.setText("This field is required.");
				}
				
				else if(d.trim().isEmpty())
				{
					v5.setText("This field is required.");
				}
				
				else
				{
					MemberFee fees=new MemberFee(Integer.parseInt(mid),dfrom,dto,mfee,d);
					MemberFeeDaoImp mdao=new MemberFeeDaoImp();
					boolean flag=mdao.addFee(fees);
					
					if(flag==true)
					{
						JOptionPane.showMessageDialog(null,"Fee Payment added successfully.");
					}
					
					else
					{
						JOptionPane.showMessageDialog(null,"Failed to add Fees.");
					}
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setBounds(332, 397, 206, 37);
		main.add(btnNewButton);
		
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
	