package projectPackage;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

@SuppressWarnings("serial")
public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameField;
	private JPasswordField confirmPasswordField;
	private JTextField lastNameField;
	private JTextField usernameField;
	private JPasswordField passwordField;

	public SignUpPage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\project2-removebg-preview.png"));
		setTitle("My Citizen Vacination");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 760);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new LineBorder(new Color(0, 100, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel signUpPanel = new JPanel();
		signUpPanel.setLayout(null);
		signUpPanel.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		signUpPanel.setBackground(new Color(144, 238, 144));
		signUpPanel.setBounds(24, 295, 437, 396);
		contentPane.add(signUpPanel);
		
		JLabel signUpLabel = new JLabel("Sign Up");
		signUpLabel.setHorizontalAlignment(SwingConstants.CENTER);
		signUpLabel.setFont(new Font("Stencil", Font.BOLD, 30));
		signUpLabel.setBounds(10, 11, 421, 57);
		signUpPanel.add(signUpLabel);
		
		JLabel lblNewLabel_2 = new JLabel("-------------------------------------------------------------------\r\n\r---\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 68, 421, 14);
		signUpPanel.add(lblNewLabel_2);
		
		firstNameField = new JTextField();
		firstNameField.setColumns(10);
		firstNameField.setBounds(137, 116, 290, 31);
		signUpPanel.add(firstNameField);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBounds(137, 282, 290, 31);
		signUpPanel.add(confirmPasswordField);
		
		JLabel lblNewLabel_3 = new JLabel("Username : ");
		lblNewLabel_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_3.setBounds(10, 203, 76, 23);
		signUpPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password : ");
		lblNewLabel_3_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(10, 245, 76, 23);
		signUpPanel.add(lblNewLabel_3_1);
		
		JButton logInButton = new JButton("Log In");
		logInButton.setForeground(Color.WHITE);
		logInButton.setFocusable(false);
		logInButton.setBackground(new Color(0, 0, 128));
		logInButton.setBounds(137, 350, 91, 23);
		signUpPanel.add(logInButton);
		
		JCheckBox showPassword = new JCheckBox("Show Password");
		showPassword.setForeground(Color.RED);
		showPassword.setFont(new Font("Tahoma", Font.PLAIN, 10));
		showPassword.setBackground(new Color(144, 238, 144));
		showPassword.setBounds(137, 320, 294, 23);
		signUpPanel.add(showPassword);
		
		lastNameField = new JTextField();
		lastNameField.setColumns(10);
		lastNameField.setBounds(137, 158, 290, 31);
		signUpPanel.add(lastNameField);
		
		usernameField = new JTextField();
		usernameField.setColumns(10);
		usernameField.setBounds(137, 200, 290, 31);
		signUpPanel.add(usernameField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 240, 290, 31);
		signUpPanel.add(passwordField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Confirm Password : ");
		lblNewLabel_3_1_1.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_3_1_1.setBounds(10, 290, 116, 23);
		signUpPanel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("First Name : ");
		lblNewLabel_3_2.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_3_2.setBounds(10, 119, 76, 23);
		signUpPanel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Last Name : ");
		lblNewLabel_3_3.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 16));
		lblNewLabel_3_3.setBounds(10, 161, 76, 23);
		signUpPanel.add(lblNewLabel_3_3);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(24, 22, 437, 262);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\logoproject1-removebg-preview.png"));
		lblNewLabel.setBounds(58, 11, 319, 251);
		panel_3.add(lblNewLabel);
		
		
		

		logInButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
                if(e.getSource()==logInButton) {
					
                	String firstName = firstNameField.getText();
                	String lastName = lastNameField.getText();
                	String username = usernameField.getText();
                	String pass1 = passwordField.getText();
                	String pass2 = confirmPasswordField.getText();
                	
					
					switch(firstName) {
					
					case "":
						JOptionPane.showMessageDialog(null, "You do not insert your first name", "" , JOptionPane.ERROR_MESSAGE);
						break;
						
					default:
						switch(lastName) {
						
						case "":
							JOptionPane.showMessageDialog(null, "You do not insert your last name", "" , JOptionPane.ERROR_MESSAGE);
							break;
						default:
							switch(username) {
							case "":
								JOptionPane.showMessageDialog(null, "You do not insert your Username", "" , JOptionPane.ERROR_MESSAGE);
								break;
							default:
								switch(pass1) {
								
								case "":
									JOptionPane.showMessageDialog(null, "You do not insert your password", "" , JOptionPane.ERROR_MESSAGE);
									break;
								default:
									switch(pass2) {
									
									case "":
										JOptionPane.showMessageDialog(null, "You do not insert your confirm password", "" , JOptionPane.ERROR_MESSAGE);
										break;
									default:
										if(passwordField.getText().equalsIgnoreCase(pass2)) {
											
											JOptionPane.showMessageDialog(null, "Your Register is successful!!!");
											page1 page = new page1();
											page.setVisible(true);
											page.setLocationRelativeTo(null);
											dispose();
											
											//String name = firstNameField.getText() + " " + lastNameField.getText();
											
										}
										else {
											JOptionPane.showMessageDialog(null, "You insert the wrong password at confirm password", "" , JOptionPane.ERROR_MESSAGE);
										}
									}
								}
							}
						}
					}
					
			    }
			}
		});
		
		showPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(showPassword.isSelected()) {
						passwordField.setEchoChar((char) 0);
						confirmPasswordField.setEchoChar((char) 0);
					}
					else {
						passwordField.setEchoChar('*');
						confirmPasswordField.setEchoChar('*');
					}
			
			}
		});
	}

}
