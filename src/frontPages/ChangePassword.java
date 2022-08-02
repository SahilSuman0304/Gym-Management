package frontPages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import login.Login;
import login.Signup;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ChangePassword extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
	private JPasswordField cpass;
	private JTextField textField;
	private static int id1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePassword frame = new ChangePassword();
					frame.setVisible(true);
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChangePassword() {
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
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new LineBorder(new Color(255, 218, 185), 4, true));
		panel_1.setBounds(0, 76, 1365, 670);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(139, 69, 19));
		panel_2.setBorder(new LineBorder(new Color(255, 218, 185), 4, true));
		panel_2.setBounds(513, 70, 412, 56);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Change Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setForeground(new Color(255, 218, 185));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 392, 34);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username:-");
		lblNewLabel.setForeground(new Color(255, 218, 185));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(546, 152, 133, 38);
		panel_1.add(lblNewLabel);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.ITALIC, 15));
		user.setBounds(689, 162, 206, 23);
		panel_1.add(user);
		user.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:-");
		lblPassword.setForeground(new Color(255, 218, 185));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(546, 214, 117, 27);
		panel_1.add(lblPassword);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.ITALIC, 15));
		pass.setBounds(689, 218, 206, 23);
		panel_1.add(pass);
		
		cpass = new JPasswordField();
		cpass.setFont(new Font("Tahoma", Font.ITALIC, 15));
		cpass.setBounds(689, 280, 206, 23);
		panel_1.add(cpass);
		
		JLabel cnpassword = new JLabel("Confirm Password:-");
		cnpassword.setForeground(new Color(255, 218, 185));
		cnpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		cnpassword.setBounds(473, 278, 206, 27);
		panel_1.add(cnpassword);
		
		
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(Color.RED);
		v2.setBounds(905, 164, 161, 23);
		panel_1.add(v2);
		
		JLabel v3 = new JLabel("*");
		v3.setForeground(Color.RED);
		v3.setBounds(905, 220, 161, 23);
		panel_1.add(v3);
		
		JLabel v4 = new JLabel("*");
		v4.setForeground(Color.RED);
		v4.setBounds(905, 282, 161, 23);
		panel_1.add(v4);
		
		
		JButton btnNewButton = new JButton("Change Password");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String username=user.getText();
					String password=pass.getText();
					String cpassword=cpass.getText();
					Login l=new Login();
			
						if(username.trim().isEmpty())
						{	
							v2.setText("This field is required.");
						}
						
						else if(password.trim().isEmpty())
						{
							v3.setText("This field is required.");
						}
						
						else if(cpassword.trim().isEmpty())
						{
							v4.setText("This field is required.");
						}
						
						else if(password.equals(cpassword))
						{
						
						    boolean flag=l.changePassword(username,password);
						
						if(flag==true)
						{
							   LoginPage l1 = new LoginPage();
								l1.setVisible(true);
								l1.setExtendedState(JFrame.MAXIMIZED_BOTH);
								dispose();
							   JOptionPane.showMessageDialog(null,"Password changed Successfully ");
						} 
						else
						{
							JOptionPane.showMessageDialog(null,"Failed to change password.");
						}
						
					 
				
			            }	
						
						else
						{
							JOptionPane.showMessageDialog(null,"Password mismatch. ");
						}
			}
		});
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(546, 349, 345, 36);
		panel_1.add(btnNewButton);
		
		JLabel newuser = new JLabel("new user? ");
		newuser.setForeground(new Color(255, 218, 185));
		newuser.setFont(new Font("Tahoma", Font.ITALIC, 20));
		newuser.setBounds(473, 419, 133, 38);
		panel_1.add(newuser);
		
		JLabel sign = new JLabel("Sign Up  ");
		sign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SignupPage l = new SignupPage();
				l.setVisible(true);
				l.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
			}
		});
		sign.setForeground(Color.BLUE);
		sign.setFont(new Font("Tahoma", Font.BOLD, 20));
		sign.setBounds(584, 420, 117, 36);
		panel_1.add(sign);
		 //(266, 412, 117, 36)
		
		JLabel a = new JLabel("Already User?");
		a.setForeground(new Color(255, 218, 185));
		a.setFont(new Font("Tahoma", Font.ITALIC, 20));
		a.setBounds(750, 420,141 , 36);
		panel_1.add(a);
		
		JLabel f = new JLabel("Login");
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage l = new LoginPage();
				l.setVisible(true);
				l.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
			}
		});
		f.setForeground(Color.BLUE);
		f.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		f.setBounds(886, 420, 83, 36);
		panel_1.add(f);
		
		
		JButton ebuttom = new JButton("Exit");
		ebuttom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
            try {
					
					int yesOrNo=JOptionPane.showConfirmDialog(null,"Do you want to EXIT the application?");
					if(yesOrNo==0)
					{
						System.exit(0);
					}
					
				    
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		ebuttom.setBackground(Color.RED);
		ebuttom.setFont(new Font("Tahoma", Font.BOLD, 15));
		ebuttom.setBounds(610, 482, 196, 36);
		panel_1.add(ebuttom);
		
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
		ImageIcon i1=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\gymBacg.jpg");
		Image image2=i1.getImage();
		Image imgScale2=image2.getScaledInstance(lblNewLabel1.getWidth(),lblNewLabel1.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2=new ImageIcon(imgScale2); 
		lblNewLabel1.setIcon(scaledIcon2);
		panel_1.add(lblNewLabel1);
		
		
	}
}
