package frontPages;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LoginPage() {
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
		panel_2.setBounds(492, 71, 412, 56);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setForeground(new Color(255, 218, 185));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 11, 392, 34);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Username:-");
		lblNewLabel.setForeground(new Color(255, 218, 185));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(492, 176, 133, 27);
		panel_1.add(lblNewLabel);
		
		user = new JTextField();
		user.setFont(new Font("Tahoma", Font.ITALIC, 15));
		user.setBounds(635, 178, 206, 25);
		panel_1.add(user);
		user.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:-");
		lblPassword.setForeground(new Color(255, 218, 185));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPassword.setBounds(492, 232, 117, 27);
		panel_1.add(lblPassword);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.ITALIC, 15));
		pass.setBounds(635, 234, 206, 23);
		panel_1.add(pass);
		
		JLabel loginlogo = new JLabel("");
		loginlogo.setBounds(634, 296, 46, 36);
		ImageIcon i2=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\loginlogo.png");
		Image image3=i2.getImage();
		Image imgScale3=image3.getScaledInstance(loginlogo.getWidth(),loginlogo.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon3=new ImageIcon(imgScale3); 
		loginlogo.setIcon(scaledIcon3);
		panel_1.add(loginlogo);
		
		JLabel v1 = new JLabel("*");
		v1.setForeground(Color.RED);
		v1.setBounds(865, 182, 165, 23);
		panel_1.add(v1);
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(Color.RED);
		v2.setBounds(865, 238, 165, 23);
		panel_1.add(v2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username=user.getText();
				String password=pass.getText();
				Login l=new Login();
				
					if(username.trim().isEmpty())
					{
						v1.setText("This field is required.");
					}
					
					else if(!new Signup().alreadyUser(username))
					{
						JOptionPane.showMessageDialog(null,"This User is not registered");
					}
					
					else if(password.trim().isEmpty())
					{
						v2.setText("This field is required.");
					}
					
					else
					{
						boolean flag=l.adminlogin(username, password);
						if(flag==true)
						{
							
							Home h = new Home();
							h.setVisible(true);
							h.setExtendedState(JFrame.MAXIMIZED_BOTH);
							dispose();
							JOptionPane.showMessageDialog(null,"Successfully Logged in as "+username);
						}
						else
						{
							JOptionPane.showMessageDialog(null,"Failed to login.");
						}
					}
					
			
				
			  } //else 
			
		});
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(680, 294, 117, 38);
		panel_1.add(btnNewButton);
		
		JLabel newuser = new JLabel("new user? ");
		newuser.setForeground(new Color(255, 218, 185));
		newuser.setBackground(new Color(255, 255, 255));
		newuser.setFont(new Font("Tahoma", Font.ITALIC, 20));
		newuser.setBounds(466, 398, 133, 38);
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
		sign.setBounds(577, 399, 117, 36);
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
		f.setBounds(776, 397, 171, 36);
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
		ebuttom.setBounds(666, 463, 117, 36);
		panel_1.add(ebuttom);
		
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(5, 0, 1354, 624);
		ImageIcon i1=new ImageIcon("M:\\My Projects\\Gym Managment System\\src\\image\\gymBacg.jpg");
		Image image2=i1.getImage();
		Image imgScale2=image2.getScaledInstance(lblNewLabel1.getWidth(),lblNewLabel1.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaledIcon2=new ImageIcon(imgScale2); 
		lblNewLabel1.setIcon(scaledIcon2);
		panel_1.add(lblNewLabel1);
		
	
	}
}
