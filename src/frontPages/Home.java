package frontPages;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
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
		
		JLabel lblNewLabel = new JLabel("ADMIN PAGE");
		lblNewLabel.setForeground(new Color(255, 218, 185));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(189, 11, 474, 45);
		main.add(lblNewLabel);
		
		
		  JButton btnTotal = new JButton("");
		  btnTotal.setForeground(new Color(255,218, 185));
		  btnTotal.setBackground(new Color(255, 218, 185));
		  btnTotal.addActionListener(new ActionListener()
		  { 
			  public void actionPerformed(ActionEvent e)
			  { 
				    TotalMember h = new TotalMember();
					h.setVisible(true);
					h.setExtendedState(JFrame.MAXIMIZED_BOTH);
					dispose();
			  }
		  });
		  btnTotal.setBounds(120, 80, 125, 85);
		  ImageIcon i1=new
		  ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\totalmember.png");
		  Image image1=i1.getImage(); Image
		  imgScale1=image1.getScaledInstance(btnTotal.getWidth(),btnTotal.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon1=new ImageIcon(imgScale1);
		  btnTotal.setIcon(scaledIcon1);
		  main.add(btnTotal);
		 
		  JButton btnNew = new JButton("");
		  btnNew.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		NewMember h = new NewMember();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  btnNew.setForeground(new Color(255, 218,185));
		  btnNew.setBackground(new Color(255, 218, 185));
		  btnNew.setBounds(375,80, 125, 85);
		  ImageIcon i2=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\newmember.png");
		  Image image2=i2.getImage();
		  Image imgScale2=image2.getScaledInstance(btnNew.getWidth(),btnNew.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon2=new ImageIcon(imgScale2);
		  btnNew.setIcon(scaledIcon2);
		  main.add(btnNew);
		  
		  JButton btnsearch = new JButton("");
		  btnsearch.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		SearchMember h = new SearchMember();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  btnsearch.setForeground(new Color(255,218, 185));
		  btnsearch.setBackground(new Color(255, 218, 185));
		  btnsearch.setBounds(613, 80,125, 85);
		  ImageIcon i3=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\searchmember.png");
		  Image image3=i3.getImage();
		  Image imgScale3=image3.getScaledInstance(btnsearch.getWidth(),btnsearch.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon3=new ImageIcon(imgScale3);
		  btnsearch.setIcon(scaledIcon3);
		  main.add(btnsearch);
		  
		  JLabel lblNewLabel_1 = new JLabel("Total Member");
		  lblNewLabel_1.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1.setBounds(120, 176, 125, 21);
		  main.add(lblNewLabel_1);
		  
		  JLabel lblNewLabel_1_1 = new JLabel("New Member");
		  lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1_1.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1_1.setBounds(375, 176, 125, 21);
		  main.add(lblNewLabel_1_1);
		  
		  JLabel lblNewLabel_1_2 = new JLabel("Search Member");
		  lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1_2.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1_2.setBounds(603, 176, 150, 21);
		  main.add(lblNewLabel_1_2);
		  
		  JButton btnFeePay = new JButton("");
		  btnFeePay.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		FeePayment h = new FeePayment();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  btnFeePay.setForeground(new Color(255, 218, 185));
		  btnFeePay.setBackground(new Color(255, 218, 185));
		  btnFeePay.setBounds(120, 220, 125, 85);
		  ImageIcon i4=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\feepay.png");
		  Image image4=i4.getImage();
		  Image imgScale4=image4.getScaledInstance(btnFeePay.getWidth(),btnFeePay.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon4=new ImageIcon(imgScale4);
		  btnFeePay.setIcon(scaledIcon4);
		  main.add(btnFeePay);
		  
		  JLabel lblNewLabel_1_3 = new JLabel("Fee Pay");
		  lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1_3.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1_3.setBounds(120, 316, 125, 21);
		  main.add(lblNewLabel_1_3);
		  
		  JButton btnFeeDetail = new JButton("");
		  btnFeeDetail.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) 
		  	{
		  		FeeDetail h = new FeeDetail();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  btnFeeDetail.setForeground(new Color(255, 218, 185));
		  btnFeeDetail.setBackground(new Color(255, 218, 185));
		  btnFeeDetail.setBounds(375, 220, 125, 85);
		  ImageIcon i5=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\feeDetail.png");
		  Image image5=i5.getImage();
		  Image imgScale5=image5.getScaledInstance(btnFeeDetail.getWidth(),btnFeeDetail.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon5=new ImageIcon(imgScale5);
		  btnFeeDetail.setIcon(scaledIcon5);
		  main.add(btnFeeDetail);
		  
		  JLabel lblNewLabel_1_1_1 = new JLabel("Fee Detail");
		  lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1_1_1.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1_1_1.setBounds(375, 316, 125, 21);
		  main.add(lblNewLabel_1_1_1);
		  
		  JButton btnUpdateMember = new JButton("");
		  btnUpdateMember.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		UpdateMember h = new UpdateMember();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  btnUpdateMember.setForeground(new Color(255, 218, 185));
		  btnUpdateMember.setBackground(new Color(255, 218, 185));
		  btnUpdateMember.setBounds(613, 220, 125, 85);
		  ImageIcon i6=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\updateMember.png");
		  Image image6=i6.getImage();
		  Image imgScale6=image6.getScaledInstance(btnUpdateMember.getWidth(),btnUpdateMember.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon6=new ImageIcon(imgScale6);
		  btnUpdateMember.setIcon(scaledIcon6);
		  main.add(btnUpdateMember);
		  
		  JLabel lblNewLabel_1_2_1 = new JLabel("Update Member");
		  lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1_2_1.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1_2_1.setBounds(603, 316, 150, 21);
		  main.add(lblNewLabel_1_2_1);
		  
		  JButton btnDelete = new JButton("");
		  btnDelete.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		DeleteMember h = new DeleteMember();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  btnDelete.setForeground(new Color(255, 218, 185));
		  btnDelete.setBackground(new Color(255, 218, 185));
		  btnDelete.setBounds(120, 361, 125, 85);
		  ImageIcon i7=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\deleteMember.png");
		  Image image7=i7.getImage();
		  Image imgScale7=image7.getScaledInstance(btnDelete.getWidth(),btnDelete.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon7=new ImageIcon(imgScale7);
		  btnDelete.setIcon(scaledIcon7);
		  main.add(btnDelete);
		  
		  JButton btnChange = new JButton("");
		  btnChange.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
		  		ChangePassword h = new ChangePassword();
				h.setVisible(true);
				h.setExtendedState(JFrame.MAXIMIZED_BOTH);
				dispose();
		  	}
		  });
		  btnChange.setForeground(new Color(255, 218, 185));
		  btnChange.setBackground(new Color(255, 218, 185));
		  btnChange.setBounds(375, 361, 125, 85);
		  ImageIcon i8=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\chnage.png");
		  Image image8=i8.getImage();
		  Image imgScale8=image8.getScaledInstance(btnChange.getWidth(),btnChange.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon8=new ImageIcon(imgScale8);
		  btnChange.setIcon(scaledIcon8);
		  main.add(btnChange);
		  
		  JButton btnLogout = new JButton("");
		  btnLogout.addActionListener(new ActionListener() {
		  	public void actionPerformed(ActionEvent e) {
           try {
					
					int yesOrNo=JOptionPane.showConfirmDialog(null,"Do you want to Logout?");
					if(yesOrNo==0)
					{
						LoginPage l = new LoginPage();
						l.setVisible(true);
						l.setExtendedState(JFrame.MAXIMIZED_BOTH);
						dispose();
						JOptionPane.showMessageDialog(null,"Successfully Logged Out.");
					}
					
				    
				} catch (Exception e1) {
					e1.printStackTrace();
				}
		  	}
		  });
		  btnLogout.setForeground(new Color(255, 218, 185));
		  btnLogout.setBackground(new Color(255, 218, 185));
		  btnLogout.setBounds(613, 361, 125, 85);
		  ImageIcon i9=new ImageIcon("C:\\Users\\Admin Ism\\Desktop\\Gym Managment System\\src\\image\\logout.png");
		  Image image9=i9.getImage();
		  Image imgScale9=image9.getScaledInstance(btnChange.getWidth(),btnChange.getHeight(),Image.SCALE_SMOOTH);
		  ImageIcon scaledIcon9=new ImageIcon(imgScale9);
		  btnLogout.setIcon(scaledIcon9);
		  main.add(btnLogout);
		  
		  JLabel lblNewLabel_1_2_1_1 = new JLabel("Logout");
		  lblNewLabel_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1_2_1_1.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1_2_1_1.setBounds(603, 457, 150, 21);
		  main.add(lblNewLabel_1_2_1_1);
		  
		  JLabel lblNewLabel_1_1_1_1 = new JLabel("Change Password");
		  lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		  lblNewLabel_1_1_1_1.setForeground(new Color(255, 218, 185));
		  lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		  lblNewLabel_1_1_1_1.setBounds(360, 457, 161, 21);
		  main.add(lblNewLabel_1_1_1_1);
		  
		  JLabel deleteLabel = new JLabel("Delete Member");
		  deleteLabel.setHorizontalAlignment(SwingConstants.CENTER);
		  deleteLabel.setForeground(new Color(255, 218, 185));
		  deleteLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		  deleteLabel.setBounds(108, 457, 150, 21);
		  main.add(deleteLabel);
		 
		  
		  
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
