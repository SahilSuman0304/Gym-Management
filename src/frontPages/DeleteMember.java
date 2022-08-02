package frontPages;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;

import memberDao.MemberDaoImp;
import memberPojo.Member;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;


public class DeleteMember extends JFrame {

	private JPanel contentPane;
	private JTextField mid;
	private JTextField contact;
	private JTextField date;
	private JTextField surname;
	private JTextField email;
	private JTextField age;
	private JTextField fee;
	private JTextField name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteMember frame = new DeleteMember();
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
	public DeleteMember() {
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
		main.setBounds(173, 51, 1044, 523);
		panel_1.add(main);
		main.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DELETE MEMBER");
		lblNewLabel.setForeground(new Color(255, 218, 185));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(299, 11, 474, 45);
		main.add(lblNewLabel);
		
		JLabel lblMemberId = new JLabel("Member Id:-");
		lblMemberId.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberId.setForeground(new Color(255, 218, 185));
		lblMemberId.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMemberId.setBounds(41, 89, 133, 27);
		main.add(lblMemberId);
		
		JLabel v = new JLabel("*");
		v.setForeground(Color.RED);
		v.setBounds(400, 95, 141, 23);
		main.add(v);
		
		mid = new JTextField();
		mid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{ 
					v.setText("Enter only number.");
					mid.setEditable(false);
				}
				else
				{
					mid.setEditable(true);
				}
			}
		});
		mid.setFont(new Font("Tahoma", Font.ITALIC, 15));
		mid.setColumns(10);
		mid.setBounds(184, 91, 206, 25);
		main.add(mid);
		
		
		
		JLabel lblFrom = new JLabel("Contact:-");
		lblFrom.setHorizontalAlignment(SwingConstants.CENTER);
		lblFrom.setForeground(new Color(255, 218, 185));
		lblFrom.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFrom.setBounds(41, 146, 133, 27);
		main.add(lblFrom);
		
		JLabel v3 = new JLabel("*");
		v3.setForeground(Color.RED);
		v3.setBounds(400, 152, 141, 23);
		main.add(v3);
		
		contact = new JTextField();
		contact.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
				char c=e.getKeyChar();
				if(Character.isLetter(c))
				{ 
					v3.setText("Enter only 10 digit number.");
					contact.setEditable(false);
				}
				else
				{
					contact.setEditable(true);
				}
			}
		});
		contact.setFont(new Font("Tahoma", Font.ITALIC, 15));
		contact.setColumns(10);
		contact.setBounds(184, 148, 206, 25);
		main.add(contact);
		
		
		
		JLabel lblTo = new JLabel("Gender:-");
		lblTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTo.setForeground(new Color(255, 218, 185));
		lblTo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTo.setBounds(41, 319, 133, 27);
		main.add(lblTo);
		
		JLabel v8 = new JLabel("*");
		v8.setForeground(Color.RED);
		v8.setBounds(400, 323, 141, 23);
		main.add(v8);
		
		JLabel lblDate = new JLabel("Date :-");
		lblDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblDate.setForeground(new Color(255, 218, 185));
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDate.setBounds(41, 386, 133, 27);
		main.add(lblDate);
		
		date = new JTextField();
		date.setFont(new Font("Tahoma", Font.ITALIC, 15));
		date.setColumns(10);
		date.setBounds(184, 388, 206, 25);
		main.add(date);
		
		
		JRadioButton male = new JRadioButton("Male");
		male.setBackground(new Color(255, 218, 185));
		male.setFont(new Font("Tahoma", Font.BOLD, 13));
		male.setForeground(new Color(139, 69, 19));
		male.setBounds(184, 325, 91, 23);
		main.add(male);
		
		JRadioButton female = new JRadioButton("Female");
		female.setBackground(new Color(255, 218, 185));
		female.setFont(new Font("Tahoma", Font.BOLD, 13));
		female.setForeground(new Color(139, 69, 19));
		female.setBounds(299, 325, 91, 23);
		main.add(female);
		
		JTextArea address = new JTextArea();
		address.setBounds(184, 209, 206, 82);
		main.add(address);
		
		JComboBox gymTime = new JComboBox();
		gymTime.setModel(new DefaultComboBoxModel(new String[] {"", "5:00 am - 1:00 pm", "5:00 pm - 10:00 pm"}));
		gymTime.setForeground(new Color(139, 69, 19));
		gymTime.setFont(new Font("Tahoma", Font.BOLD, 13));
		gymTime.setBackground(new Color(255, 218, 185));
		gymTime.setBounds(699, 386, 206, 27);
		main.add(gymTime);
		
		JLabel v2 = new JLabel("*");
		v2.setForeground(Color.RED);
		v2.setBounds(915, 157, 125, 23);
		main.add(v2);
		
		JLabel v4 = new JLabel("*");
		v4.setForeground(Color.RED);
		v4.setBounds(915, 214, 125, 23);
		main.add(v4);
		
		JLabel v5 = new JLabel("*");
		v5.setForeground(Color.RED);
		v5.setBounds(400, 214, 141, 23);
		main.add(v5);
		
		JLabel v6 = new JLabel("*");
		v6.setForeground(Color.RED);
		v6.setBounds(915, 272, 125, 23);
		main.add(v6);
		
		JLabel v7 = new JLabel("*");
		v7.setForeground(Color.RED);
		v7.setBounds(915, 332, 125, 23);
		main.add(v7);
		
		JLabel v9 = new JLabel("*");
		v9.setForeground(Color.RED);
		v9.setBounds(916, 387, 141, 23);
		main.add(v9);
		
		JLabel v10 = new JLabel("*");
		v10.setForeground(Color.RED);
		v10.setBounds(400, 390, 141, 23);
		main.add(v10);
		
		JLabel v1 = new JLabel("*");
		v1.setForeground(Color.RED);
		v1.setBounds(916, 95, 141, 23);
		main.add(v1);
		
		
		JButton btnNewButton = new JButton("DELETE MEMBER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String id=mid.getText();
				
				if(id.trim().isEmpty())
				{
					v.setText("This field is required.");
				}
				
				else
				{
					MemberDaoImp mdao=new MemberDaoImp();
					boolean flag=mdao.deleteMember(Integer.parseInt(id));
					
					if(flag==true)
					{
						mid.setText("");
						name.setText("");
						surname.setText("");
						contact.setText("");
						email.setText("");
						address.setText("");
						age.setText("");
						fee.setText("");
						gymTime.setSelectedItem("");
						date.setText("");
						JOptionPane.showMessageDialog(null,"Member deleted successfully.");
					}
					
					else
					{
						JOptionPane.showMessageDialog(null,"Failed to delete member.");
					}
				}
				
				
			}
		});
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(139, 69, 19));
		btnNewButton.setBounds(699, 435, 206, 37);
		main.add(btnNewButton);
		
		JLabel lblSurname = new JLabel("Surname:-");
		lblSurname.setHorizontalAlignment(SwingConstants.CENTER);
		lblSurname.setForeground(new Color(255, 218, 185));
		lblSurname.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSurname.setBounds(556, 153, 133, 27);
		main.add(lblSurname);
		
		surname = new JTextField();
		surname.setFont(new Font("Tahoma", Font.ITALIC, 15));
		surname.setColumns(10);
		surname.setBounds(699, 155, 206, 25);
		main.add(surname);
		
		
		JLabel lblEmail = new JLabel("Email Id:-");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setForeground(new Color(255, 218, 185));
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEmail.setBounds(556, 210, 133, 27);
		main.add(lblEmail);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.ITALIC, 15));
		email.setColumns(10);
		email.setBounds(699, 212, 206, 25);
		main.add(email);
		
		
		
		JLabel lblAge = new JLabel("Age :-");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setForeground(new Color(255, 218, 185));
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge.setBounds(556, 268, 133, 27);
		main.add(lblAge);
		
		age = new JTextField();
		age.setFont(new Font("Tahoma", Font.ITALIC, 15));
		age.setColumns(10);
		age.setBounds(699, 270, 206, 25);
		main.add(age);
		
		JLabel lblAdmissionFee = new JLabel("Admission Fee:-");
		lblAdmissionFee.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmissionFee.setForeground(new Color(255, 218, 185));
		lblAdmissionFee.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdmissionFee.setBounds(539, 328, 161, 27);
		main.add(lblAdmissionFee);
		
		fee = new JTextField();
		fee.setFont(new Font("Tahoma", Font.ITALIC, 15));
		fee.setColumns(10);
		fee.setBounds(699, 330, 206, 25);
		main.add(fee);
		
		
		JLabel lblFeePaid = new JLabel("Gym Time:-");
		lblFeePaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeePaid.setForeground(new Color(255, 218, 185));
		lblFeePaid.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFeePaid.setBounds(557, 383, 133, 27);
		main.add(lblFeePaid);
		
		JLabel lblAddress = new JLabel("Address:-");
		lblAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddress.setForeground(new Color(255, 218, 185));
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAddress.setBounds(41, 204, 133, 27);
		main.add(lblAddress);
		
		JLabel lblMemberId_1 = new JLabel("Name:-");
		lblMemberId_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberId_1.setForeground(new Color(255, 218, 185));
		lblMemberId_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblMemberId_1.setBounds(557, 89, 133, 27);
		main.add(lblMemberId_1);
		
		
		
		name = new JTextField();
		name.setFont(new Font("Tahoma", Font.ITALIC, 15));
		name.setColumns(10);
		name.setBounds(700, 91, 206, 25);
		main.add(name);
		
		
		
		JButton btnGetMember = new JButton("GET MEMBER");
		btnGetMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String id=mid.getText();
				if(id.trim().isEmpty())
				{
					v.setText("This field is required.");
				}
				
				else
				{
				    int i=Integer.parseInt(id);		
				    Member m=new MemberDaoImp().getMemberById(i);
				    String gender=m.getGender();
				    if(gender.equals("Male"))
				    {
				    	male.setSelected(true);
				    }
				    
				    else
				    {
				    	female.setSelected(true);
				    }
				    mid.setText(id);
					name.setText(m.getName());
					surname.setText(m.getSurname());
					contact.setText(m.getMobile());
					email.setText(m.getEmail());
					address.setText(m.getAddress());
					age.setText(m.getAge());
					fee.setText(m.getAdmissionFee());
					gymTime.setSelectedItem(m.getGymTime());
					date.setText(m.getDate());
					
				}
			}
		});
		btnGetMember.setForeground(new Color(139, 69, 19));
		btnGetMember.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGetMember.setBackground(new Color(255, 218, 185));
		btnGetMember.setBounds(184, 435, 206, 37);
		main.add(btnGetMember);
		
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
	