package projectPackage;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class loginPage extends JFrame {

	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
    private JButton loginButton = new JButton("Log In");
	
	public loginPage() {
		setFont(new Font("Serif", Font.BOLD, 17));
		setTitle("My Citizen Vacination");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\project2-removebg-preview.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 724);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new LineBorder(new Color(0, 100, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(144, 238, 144));
		panel.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		panel.setBounds(22, 312, 437, 346);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(165, 41, 91, 31);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("-----------------------------------------------------------------\r\n----");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 83, 417, 14);
		panel.add(lblNewLabel_2);
		
		usernameField = new JTextField();
		usernameField.setBounds(108, 124, 294, 31);
		panel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 175, 294, 31);
		panel.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Username : ");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_3.setBounds(22, 127, 76, 23);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password : ");
		lblNewLabel_3_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(22, 178, 76, 23);
		panel.add(lblNewLabel_3_1);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		
		loginButton.setForeground(Color.WHITE);
		loginButton.setBackground(new Color(0, 0, 128));
	    loginButton.setFocusable(false);
		loginButton.setBounds(110, 282, 91, 23);
		panel.add(loginButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(204, 51, 51));
	    btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBounds(313, 282, 89, 23);
		panel.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxNewCheckBox.setBackground(new Color(144, 238, 144));
		chckbxNewCheckBox.setForeground(Color.RED);
		chckbxNewCheckBox.setBounds(108, 224, 294, 23);
		panel.add(chckbxNewCheckBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(22, 28, 437, 273);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\logoproject1-removebg-preview.png"));
		lblNewLabel_1.setBounds(52, 11, 319, 251);
		panel_3.add(lblNewLabel_1);
		
		
		
	}
	
	public void confirmation(String n,String user,String pass) {
		

		loginButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				if(usernameField.getText().equalsIgnoreCase(user) && passwordField.getText().equalsIgnoreCase(pass)) {
					JOptionPane.showMessageDialog(null,"You have Login with our Systems");
					page1 page = new page1();
					page.setVisible(true);
					page.setLocationRelativeTo(null);
					dispose();
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Please insert the correct username and password", "" , JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
	}
}
