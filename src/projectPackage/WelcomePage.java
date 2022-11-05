package projectPackage;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.border.BevelBorder;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class WelcomePage extends JFrame {

	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();
	JLabel lblNewLabel = new JLabel();
	private final JPanel panel_3 = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("");
	
	public WelcomePage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\project2-removebg-preview.png"));
		setTitle("My Citizen Vacination");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new LineBorder(new Color(0, 100, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		progressBar.setForeground(new Color(0, 128, 0));
		
		progressBar.setBounds(13, 347, 442, 14);
		progressBar.setVisible(true);
		contentPane.add(progressBar);
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(385, 320, 54, 22);
		contentPane.add(lblNewLabel);
		panel_3.setLayout(null);
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(57, 29, 354, 280);
		
		contentPane.add(panel_3);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\logoproject1-removebg-preview.png"));
		lblNewLabel_1.setBounds(10, 11, 334, 258);
		
		panel_3.add(lblNewLabel_1);
	}
}
