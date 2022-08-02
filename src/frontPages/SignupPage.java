package frontPages;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

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
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SignupPage extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField cpass;
	private JPasswordField pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignupPage frame = new SignupPage();
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
	public SignupPage() {
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
		panel_2.setBackground(new Color(139, 69, 19));
		panel_2.setBorder(new LineBorder(new Color(255, 218, 185), 4, true));
		panel_2.setBounds(480, 69, 426, 56);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SIGN UP");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setForeground(new Color(255, 218, 185));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 406, 34);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username:-");
		lblNewLabel.setForeground(new Color(255, 218, 185));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(478, 168, 133, 38);
		panel_1.add(lblNewLabel);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.ITALIC, 15));
		user.setBounds(642, 174, 206, 27);
		panel_1.add(user);
		user.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:-");
		lblPassword.setForeground(new Color(255, 218, 185));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(478, 230, 117, 27);
		panel_1.add(lblPassword);
		
		cpass = new JPasswordField();
		cpass.setFont(new Font("Tahoma", Font.ITALIC, 15));
		cpass.setBounds(642, 285, 206, 27);
		panel_1.add(cpass);
		
		JLabel cnpassword = new JLabel("Confirm Password:-");
		cnpassword.setForeground(new Color(255, 218, 185));
		cnpassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		cnpassword.setBounds(426, 285, 206, 27);
		panel_1.add(cnpassword);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.ITALIC, 15));
		pass.setBounds(642, 230, 206, 27);
		panel_1.add(pass);
		
		JLabel loginlogo = new JLabel("");
		loginlogo.setBounds(613, 339, 46, 36);
		ImageIcon i2=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\loginlogo.png");
		Image image3=i2.getImage();
		Image imgScale3=image3.getScaledInstance(loginlogo.getWidth(),loginlogo.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon3=new ImageIcon(imgScale3); 
		loginlogo.setIcon(scaledIcon3);
		panel_1.add(loginlogo);
		
		JLabel v1 = new JLabel("*");
		v1.setForeground(Color.RED);
		v1.setBounds(869, 180, 141, 23);
		panel_1.add(v1);
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(Color.RED);
		v2.setBounds(869, 236, 141, 23);
		panel_1.add(v2);
		
		JLabel v3 = new JLabel("*");
		v3.setForeground(Color.RED);
		v3.setBounds(869, 291, 141, 23);
		panel_1.add(v3);
		
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username=user.getText();
				String password=pass.getText();
				String cpassword=cpass.getText();
				Signup s=new Signup();
				
						if(username.trim().isEmpty())
						{
							v1.setText("This field is required.");
						}
						
						else if (new Signup().alreadyUser(username))
						{
							JOptionPane.showMessageDialog(null, "User already added.");
						}
						
						else if(password.trim().isEmpty())
						{
							v2.setText("This field is required.");
						}
						
						else if(cpassword.trim().isEmpty())
						{
							v3.setText("This field is required.");
						}
						
						else if(password.equals(cpassword))
						{
							boolean flag=s.signup(username, password);
							if(flag==true)
							{
								    LoginPage l = new LoginPage();
									l.setVisible(true);
									l.setExtendedState(JFrame.MAXIMIZED_BOTH);
									dispose();
								JOptionPane.showMessageDialog(null,"Successfully signed up as "+username);
							}
							else
							{
								JOptionPane.showMessageDialog(null,"Failed to Sign up.");
							}
						}
						
		
			}
		});
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(660, 339, 117, 38);
		panel_1.add(btnNewButton);
		
		JLabel newuser = new JLabel("new user? ");
		newuser.setForeground(new Color(255, 218, 185));
		newuser.setFont(new Font("Tahoma", Font.ITALIC, 20));
		newuser.setBounds(460, 418, 133, 38);
		panel_1.add(newuser);
		
		JLabel sign = new JLabel("Login");
		sign.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
		    LoginPage l = new LoginPage();
			l.setVisible(true);
			l.setExtendedState(JFrame.MAXIMIZED_BOTH);
			dispose();
				
			}
		});
		sign.setForeground(Color.BLUE);
		sign.setFont(new Font("Tahoma", Font.BOLD, 20));
		sign.setBounds(571, 419, 117, 36);
		panel_1.add(sign);
		 //(266, 412, 117, 36)
		
		JLabel f = new JLabel("forgot password");
		f.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ForgetPage l = new ForgetPage();
				l.setVisible(true);
				l.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
			}
		});
		f.setForeground(Color.RED);
		f.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		f.setBounds(770, 417, 171, 36);
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
		ebuttom.setBounds(660, 483, 117, 36);
		panel_1.add(ebuttom);
		
	
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
