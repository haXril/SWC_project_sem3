package projectPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class certificatePage extends JFrame {

	private JPanel contentPane;
    private JLabel nameLabel;
    private JLabel icNumberLabel;
    private JLabel stateLabel;
    private JLabel ageLabel;
    private JLabel categoryLabel;
    private JLabel firstDoseLabel;
    private JLabel secondDoseLabel;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					certificatePage frame = new certificatePage();
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
	public certificatePage() {
		setType(Type.POPUP);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\project2-removebg-preview.png"));
		setTitle("My Citizen Vacination\r\n");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new LineBorder(new Color(0, 100, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(255, 250, 205));
		panel.setBounds(168, 125, 243, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(10, 257, 46, 14);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBackground(new Color(0, 255, 255));
		panel_1.setBounds(98, 34, 388, 52);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Certificate Citizen");
		lblNewLabel.setBounds(0, 11, 388, 40);
		panel_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\image-removebg-preview (6)2.png"));
		lblNewLabel_1.setBounds(0, 11, 245, 153);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Age :");
		lblNewLabel_2_1.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2_1.setBounds(10, 282, 46, 14);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("State :");
		lblNewLabel_2_2.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2_2.setBounds(10, 307, 46, 14);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Category :");
		lblNewLabel_2_3.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2_3.setBounds(10, 332, 65, 14);
		panel.add(lblNewLabel_2_3);
		
		nameLabel = new JLabel("");
		nameLabel.setFont(new Font("Sitka Small", Font.BOLD, 11));
		nameLabel.setBounds(66, 257, 156, 14);
		panel.add(nameLabel);
		
		ageLabel = new JLabel("");
		ageLabel.setFont(new Font("Sitka Small", Font.BOLD, 11));
		ageLabel.setBounds(66, 282, 156, 14);
		panel.add(ageLabel);
		
		stateLabel = new JLabel("");
		stateLabel.setFont(new Font("Sitka Small", Font.BOLD, 11));
		stateLabel.setBounds(66, 307, 156, 14);
		panel.add(stateLabel);
		
		categoryLabel = new JLabel("");
		categoryLabel.setFont(new Font("Sitka Small", Font.BOLD, 11));
		categoryLabel.setBounds(76, 332, 146, 14);
		panel.add(categoryLabel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Pictures\\image-removebg-preview (3).png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 445, 245, 51);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("COVID-19 Vacination");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_5.setBounds(10, 150, 222, 31);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2_4 = new JLabel("Digital Certificate");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2_4.setBounds(10, 177, 212, 14);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_6 = new JLabel("-------------------------------------------------------\r\n");
		lblNewLabel_6.setBounds(10, 192, 222, 14);
		panel.add(lblNewLabel_6);
		
		icNumberLabel = new JLabel("");
		icNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		icNumberLabel.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		icNumberLabel.setBounds(10, 216, 222, 14);
		panel.add(icNumberLabel);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("1st dose status :");
		lblNewLabel_2_3_1.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2_3_1.setBounds(10, 357, 123, 14);
		panel.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("2nd dose status :");
		lblNewLabel_2_3_1_1.setFont(new Font("Sitka Small", Font.PLAIN, 11));
		lblNewLabel_2_3_1_1.setBounds(10, 382, 123, 14);
		panel.add(lblNewLabel_2_3_1_1);
		
		firstDoseLabel = new JLabel("");
		firstDoseLabel.setFont(new Font("Sitka Small", Font.BOLD, 11));
		firstDoseLabel.setBounds(120, 355, 102, 14);
		panel.add(firstDoseLabel);
		
		secondDoseLabel = new JLabel("");
		secondDoseLabel.setFont(new Font("Sitka Small", Font.BOLD, 11));
		secondDoseLabel.setBounds(120, 380, 102, 14);
		panel.add(secondDoseLabel);
		
		JButton recipientButton = new JButton("Done");
		recipientButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				closedPage pg = new closedPage();
				pg.setVisible(true);
				pg.setLocationRelativeTo(null);
				dispose();
				
			}
		});
		recipientButton.setFont(new Font("Sitka Small", Font.BOLD, 13));
		recipientButton.setBounds(224, 610, 119, 25);
		recipientButton.setFocusable(false);
		contentPane.add(recipientButton);
	}
	
	public void info(String i,String n,int a,String s,String c,String f,String d,String cer) {
        
        nameLabel.setText(n);
        icNumberLabel.setText(i);
        stateLabel.setText(s);
        ageLabel.setText(""+a);;
        categoryLabel.setText(c);
		firstDoseLabel.setText(f);
		secondDoseLabel.setText(d);
		
		
	}
}
