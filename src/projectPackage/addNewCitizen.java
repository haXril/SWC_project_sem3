package projectPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addNewCitizen extends JFrame {

	private JPanel contentPane;
	private JTextField IcField;
	private JTextField nameField;
	private JTextField ageField;
	private JTextField stateField;
	private JTextField categoryField;
	private JTextField firstDoseField;
	private JTextField secondDoseField;
    private JButton addButton;
    
	/**
	 * Launch the application.
	 */


	

	/**
	 * Create the frame.
	 */
	public addNewCitizen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 768);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 205), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(new Color(176, 224, 230));
		panel_3.setBounds(10, 11, 437, 262);
		contentPane.add(panel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\logoproject1-removebg-preview.png"));
		lblNewLabel.setBounds(46, 11, 312, 251);
		panel_3.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 284, 437, 424);
		contentPane.add(panel);
		panel.setLayout(null);
		
		IcField = new JTextField();
		IcField.setBounds(150, 95, 253, 30);
		panel.add(IcField);
		IcField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 11, 417, 58);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Add New Citizen");
		lblNewLabel_1.setBounds(0, 0, 417, 58);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 24));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		nameField = new JTextField();
		nameField.setBounds(150, 136, 253, 30);
		panel.add(nameField);
		nameField.setColumns(10);
		
		ageField = new JTextField();
		ageField.setColumns(10);
		ageField.setBounds(150, 177, 253, 30);
		panel.add(ageField);
		
		stateField = new JTextField();
		stateField.setColumns(10);
		stateField.setBounds(150, 218, 253, 30);
		panel.add(stateField);
		
		categoryField = new JTextField();
		categoryField.setColumns(10);
		categoryField.setBounds(150, 259, 253, 30);
		panel.add(categoryField);
		
		JLabel lblNewLabel_2 = new JLabel("Ic Number :");
		lblNewLabel_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 104, 130, 17);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name :");
		lblNewLabel_2_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_1.setBounds(10, 136, 130, 30);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Age :");
		lblNewLabel_2_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_2.setBounds(10, 177, 130, 30);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("State :");
		lblNewLabel_2_3.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_3.setBounds(10, 218, 130, 30);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("Category :");
		lblNewLabel_2_4.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_4.setBounds(10, 259, 130, 30);
		panel.add(lblNewLabel_2_4);
		
		firstDoseField = new JTextField();
		firstDoseField.setColumns(10);
		firstDoseField.setBounds(150, 300, 253, 30);
		panel.add(firstDoseField);
		
		secondDoseField = new JTextField();
		secondDoseField.setColumns(10);
		secondDoseField.setBounds(150, 341, 253, 30);
		panel.add(secondDoseField);
		
		JLabel lblNewLabel_2_4_1 = new JLabel("1st Dose Status :");
		lblNewLabel_2_4_1.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_4_1.setBounds(10, 300, 130, 30);
		panel.add(lblNewLabel_2_4_1);
		
		JLabel lblNewLabel_2_4_2 = new JLabel("2nd Dose Status :");
		lblNewLabel_2_4_2.setFont(new Font("Sitka Text", Font.BOLD, 13));
		lblNewLabel_2_4_2.setBounds(10, 343, 130, 28);
		panel.add(lblNewLabel_2_4_2);
		
		addButton = new JButton("ADD");
		addButton.setBounds(174, 390, 89, 23);
		panel.add(addButton);
		

		addButton.addActionListener(new ActionListener() {
			 private String ic;
				private String name;
				private int age;
				private String state;
				private String Category;
				private String firstDoseStatus;
				private String secondDoseStatus;

			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==addButton) {
					
					page1 page = new page1();
					page.setVisible(true);
					page.setLocationRelativeTo(null);
					dispose();
					
					ic = IcField.getText();
					name = nameField.getText();
					age = Integer.parseInt(ageField.getText());
					state = stateField.getText();
					Category = categoryField.getText();
					firstDoseStatus = firstDoseField.getText();
					secondDoseStatus = secondDoseField.getText();

					
					page.information(ic, name, age, state, Category, firstDoseStatus, secondDoseStatus);
					
				}
			}
		});
		
		
	}
	
	public addNewCitizen(String ic,String name,int age,String state,String Category,String firstDoseStatus,String secondDoseStatus) {
		
		
	}
}
