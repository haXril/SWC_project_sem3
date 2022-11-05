package projectPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class citizenInformation extends JFrame {

	private JPanel contentPane;
    private JTable table;
    
    Object[] row = new Object[7];
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					citizenInformation frame = new citizenInformation();
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
	public citizenInformation() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 815);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 250));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 205), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
	    Object[] columns = {"ID Patient","Name"/*,"Age","State","Category","1st Dose","2nd Dose"*/};
	    DefaultTableModel model = new DefaultTableModel();
		table.setBounds(515, 121, 497, 395);
		contentPane.add(table);
		
		model.setColumnIdentifiers(columns);
		//table.setModel(model);
		table.setModel(model);
		table.setRowHeight(20);
		table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setForeground(Color.red);
		pane.setBackground(Color.white);
		pane.setBounds(41, 116, 614, 582);
		contentPane.add(pane);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(135, 206, 250));
		panel.setBounds(41, 23, 614, 82);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("Citizen Information");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_2.setBounds(10, 5, 594, 66);
		panel.add(lblNewLabel_2);
		
		//Object[] row = new Object[7];
		
		

		/*
        row[0] = ic;
        row[1] = name;
        row[2] = age;
        row[3] = state;
        row[4] = Category;
        row[5] = firstDoseStatus;
        row[6] = secondDoseStatus;
                
        model.addRow(row);
        */     
                
               
            
	}
	
	
	public void citizen(String i,String n) {
		
		
		row[0] = i;
        row[1] = n;
       
        
	}
}
