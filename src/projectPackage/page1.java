package projectPackage;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings("serial")
public class page1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table1;
	private JTable table2;
	private JTable table3;
	private JTable table4;
	private JTable table5;
	private JTable table6;
	private JTable table7;
	private JTable table8;
	private JTable table9;
	private JLabel timeLabel;
	
    private JButton Add;
    
    private DefaultTableModel model;
    private DefaultTableModel model1;
    private DefaultTableModel model2;
    private DefaultTableModel model3;
    private DefaultTableModel model4;
    private DefaultTableModel model5;
    private DefaultTableModel model6;
    private DefaultTableModel model7;
    private DefaultTableModel model8;
    private DefaultTableModel model9;
    
    Citizen citizen;
    
    private LinkedList<Citizen> citizenlist = new LinkedList<Citizen>();
    private LinkedList<Citizen> dCitizenlist = new LinkedList<Citizen>();
    private LinkedList<Citizen> dCitizenlist1 = new LinkedList<Citizen>();
    private LinkedList<Citizen> completedList = new LinkedList<Citizen>();
    private LinkedList<Citizen> notCompletedList = new LinkedList<Citizen>();
    private LinkedList<Citizen> testFirstDoseStatus = new LinkedList<Citizen>();
    private LinkedList<Citizen> testSecondDoseStatus = new LinkedList<Citizen>();
    
    private Stack<Citizen> stCenter1 = new Stack<Citizen>();
    private Stack<Citizen> stCenter2 = new Stack<Citizen>();
    private Stack<Citizen> stCenter3 = new Stack<Citizen>();
    private Stack<Citizen> sStack1 = new Stack<Citizen>();
    private Stack<Citizen> sStack2 = new Stack<Citizen>();
    private Stack<Citizen> sStack3 = new Stack<Citizen>();
    private Stack<Citizen> dStack1 = new Stack<Citizen>();
    private Stack<Citizen> dStack2 = new Stack<Citizen>();
    private Stack<Citizen> dStack3 = new Stack<Citizen>();
    
    private Queue<Citizen> qCenter1 = new LinkedList<Citizen>();
    private Queue<Citizen> qCenter2 = new LinkedList<Citizen>();
    private Queue<Citizen> qCenter3 = new LinkedList<Citizen>();
    private Queue<Citizen> dQueue1 = new LinkedList<Citizen>();
    private Queue<Citizen> dQueue2 = new LinkedList<Citizen>();
    private Queue<Citizen> dQueue3 = new LinkedList<Citizen>();
    private Queue<Citizen> sQueue1 = new LinkedList<Citizen>();
    private Queue<Citizen> sQueue2 = new LinkedList<Citizen>();
    private Queue<Citizen> sQueue3 = new LinkedList<Citizen>();

    
    String ic ;
	String name ; 
	int age ;
	String state ;
	String Category ;
	String firstDoseStatus = null;
	String secondDoseStatus = null ;
	String certificate = null ;
	
	Calendar timer;
	SimpleDateFormat timeFormat ;
	SimpleDateFormat tTime ;
	SimpleDateFormat Tdate ;
	
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					page1 frame = new page1();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public page1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Downloads\\project2-removebg-preview.png"));
		setTitle("My Citizen Vacination");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1610, 1008);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 224, 208));
		contentPane.setBorder(new LineBorder(new Color(0, 100, 0), 4));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 100, 0), 2));
		panel_1.setBackground(new Color(144, 238, 144));
		panel_1.setBounds(30, 456, 437, 355);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 255, 255));
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(10, 21, 417, 63);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Please select what you want :");
		lblNewLabel_1.setBounds(10, 5, 397, 47);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Others", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_4.setBackground(new Color(144, 238, 144));
		panel_4.setBounds(10, 231, 417, 113);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton DisplayCompleteDose = new JButton("Display Complete Dose");
		DisplayCompleteDose.setBounds(132, 68, 141, 23);
		panel_4.add(DisplayCompleteDose);
		DisplayCompleteDose.setFocusable(false);
		
		JButton DisplayFirstDose = new JButton("Display 1st Dose");
		DisplayFirstDose.setBounds(132, 34, 141, 23);
		panel_4.add(DisplayFirstDose);
		DisplayFirstDose.setFocusable(false);
		
		Add = new JButton("Add");
		Add.setFocusable(false);
		Add.setBounds(105, 95, 216, 23);
		panel_1.add(Add);
		
		JButton Delete = new JButton("Delete");
		Delete.setFocusable(false);
		Delete.setBounds(105, 129, 216, 23);
		panel_1.add(Delete);
		
		JButton updateFirstDose = new JButton("Update 1st Dose status");
		updateFirstDose.setBounds(105, 163, 216, 23);
		panel_1.add(updateFirstDose);
		updateFirstDose.setFocusable(false);
		
		JButton updateSecondDose = new JButton("Update 2nd Dose status");
		updateSecondDose.setBounds(105, 197, 216, 23);
		panel_1.add(updateSecondDose);
		updateSecondDose.setFocusable(false);
		
		JButton finishButton = new JButton("Finish");
		finishButton.setFocusable(false);
		finishButton.setBounds(153, 822, 181, 36);
		contentPane.add(finishButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBackground(new Color(0, 255, 255));
		panel_3.setBounds(30, 179, 437, 247);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(518, 11, 1052, 935);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		Object[] columns = {"Ic Number","Name","Age","State","Category","1st Dose","2nd Dose","Certificate"};
	    
	    model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		table = new JTable();
		table.setBounds(515, 121, 497, 395);
		contentPane.add(table);
		table.setModel(model);
		table.setRowHeight(20);
		table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(table);
		pane.setBounds(10, 120, 1032, 792);
	    panel.add(pane);
		pane.setForeground(Color.red);
		pane.setBackground(Color.white);
		pane.setVisible(true);
		
		//------------------------------------------------------------------------------
		Object[] columns1 = {"Ic Number","Name","Age","State","Category","1st Dose","2nd Dose","Certificate"};
		
		model1 = new DefaultTableModel();
		model1.setColumnIdentifiers(columns1);
		
		table1 = new JTable();
		table1.setBounds(515, 121, 497, 395);
		//contentPane.add(table1);
		table1.setModel(model1);
		table1.setRowHeight(20);
		table1.setAutoCreateRowSorter(true);
		
		JScrollPane pane1 = new JScrollPane(table1);
		pane1.setBounds(10, 168, 1032, 213);
		//panel.add(pane1);
		pane1.setForeground(Color.red);
		pane1.setBackground(Color.white);
		pane1.setVisible(true);
		
		//-------------------------------1st Dose----------------------------------------------
		Object[] columns2 = {"Ic Number","Name","Age","State","Category","1st Dose","2nd Dose","Certificate"};
		
		model2 = new DefaultTableModel();
		model2.setColumnIdentifiers(columns2);
		
		table2 = new JTable();
		table2.setBounds(515, 121, 497, 395);
		contentPane.add(table2);
		table2.setModel(model2);
		table2.setRowHeight(20);
		table2.setAutoCreateRowSorter(true);
		
		JScrollPane pane2 = new JScrollPane(table2);
		pane2.setBounds(10, 167, 1032, 213);
		panel.add(pane2);
		pane2.setForeground(Color.red);
		pane2.setBackground(Color.white);
		pane2.setVisible(false);
		
		Object[] columns3 = {"Ic Number","Name","Age","State","Category","1st Dose","2nd Dose","Certificate"};
		
		model3 = new DefaultTableModel();
		model3.setColumnIdentifiers(columns3);
		
		table3 = new JTable();
		table3.setBounds(515, 121, 497, 395);
		contentPane.add(table3);
		table3.setModel(model3);
		table3.setRowHeight(20);
		table3.setAutoCreateRowSorter(true);
		
		JScrollPane pane3 = new JScrollPane(table3);
		pane3.setBounds(10, 440, 1032, 213);
		panel.add(pane3);
		pane3.setForeground(Color.red);
		pane3.setBackground(Color.white);
		pane3.setVisible(false);
		
		Object[] columns4 = {"Ic Number","Name","Age","State","Category","1st Dose","2nd Dose","Certificate"};
		
		model4 = new DefaultTableModel();
		model4.setColumnIdentifiers(columns4);
		
		table4 = new JTable();
		table4.setBounds(515, 121, 497, 395);
		contentPane.add(table4);
		table4.setModel(model4);
		table4.setRowHeight(20);
		table4.setAutoCreateRowSorter(true);
		
		JScrollPane pane4 = new JScrollPane(table4);
		pane4.setBounds(10, 699, 1032, 213);
		panel.add(pane4);
		pane4.setForeground(Color.red);
		pane4.setBackground(Color.white);
		pane4.setVisible(false);
		
		//-----------------------------------Completed---------------------------------------------
		Object[] columns5 = {"Ic Number","Name","Age","State","Category","1st Dose","2nd Dose","Certificate"};
		
		model5 = new DefaultTableModel();
		model5.setColumnIdentifiers(columns5);
		
		table5 = new JTable();
		table5.setBounds(515, 121, 497, 395);
		contentPane.add(table5);
		table5.setModel(model5);
		table5.setRowHeight(20);
		table5.setAutoCreateRowSorter(true);
		
		
		JScrollPane pane5 = new JScrollPane(table5);
		pane5.setBounds(10, 195, 1032, 708);
		panel.add(pane5);
		pane5.setForeground(Color.red);
		pane5.setBackground(Color.white);
		pane5.setVisible(false);
		
		//---------------------------------------------------------------------------------
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_5.setBackground(new Color(0, 255, 255));
		panel_5.setBounds(10, 11, 1032, 86);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		//----------------------------------Details----------------------------------------------------------
		JLabel citizenDetails = new JLabel("Citizen Details");
		citizenDetails.setHorizontalAlignment(SwingConstants.CENTER);
		citizenDetails.setFont(new Font("Tahoma", Font.BOLD, 37));
		citizenDetails.setBounds(10, 11, 1012, 66);
		panel_5.add(citizenDetails);
		
		//----------------------------------1st Dose----------------------------------------------------
		JLabel citizenDetails1 = new JLabel("Citizen Details (1st Dose Completed)");
		citizenDetails1.setHorizontalAlignment(SwingConstants.CENTER);
		citizenDetails1.setFont(new Font("Tahoma", Font.BOLD, 37));
		citizenDetails1.setBounds(10, 11, 1012, 66);
		citizenDetails1.setVisible(false);
		panel_5.add(citizenDetails1);
		
		JLabel yearsOld18 = new JLabel("18 - 30 years old : ");
		yearsOld18.setFont(new Font("Sitka Small", Font.BOLD, 15));
		yearsOld18.setHorizontalAlignment(SwingConstants.CENTER);
		yearsOld18.setBounds(10, 133, 1032, 34);
		yearsOld18.setVisible(false);
		panel.add(yearsOld18);
		
		JLabel yearsOld31 = new JLabel("31 - 49 years old : ");
		yearsOld31.setHorizontalAlignment(SwingConstants.CENTER);
		yearsOld31.setFont(new Font("Sitka Small", Font.BOLD, 15));
		yearsOld31.setBounds(10, 402, 1032, 34);
		yearsOld31.setVisible(false);
	    panel.add(yearsOld31);
		
		JLabel yearsOld50 = new JLabel("50 years old and above : ");
		yearsOld50.setHorizontalAlignment(SwingConstants.CENTER);
		yearsOld50.setFont(new Font("Sitka Small", Font.BOLD, 15));
		yearsOld50.setBounds(10, 664, 1032, 34);
		yearsOld50.setVisible(false);
		panel.add(yearsOld50);
		
		//------------------------------------Completed---------------------------------------------------
		JLabel citizenDetails2 = new JLabel("Citizen Details (1st and 2nd Dose completed)");
		citizenDetails2.setHorizontalAlignment(SwingConstants.CENTER);
		citizenDetails2.setFont(new Font("Tahoma", Font.BOLD, 37));
		citizenDetails2.setBounds(10, 11, 1012, 66);
		citizenDetails2.setVisible(false);
		panel_5.add(citizenDetails2);
		citizenDetails2.setVisible(false);
		
		JLabel CompletedLabel = new JLabel("Complete :");
		CompletedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		CompletedLabel.setFont(new Font("Sitka Small", Font.BOLD, 20));
		CompletedLabel.setBounds(10, 149, 1032, 45);
		panel.add(CompletedLabel);
		CompletedLabel.setVisible(false);
		
		//----------------------------------------------------------------------------------------
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ADMIN\\Downloads\\logoproject4-removebg-preview.png"));
		lblNewLabel.setBounds(-12, 11, 439, 225);
		panel_3.add(lblNewLabel);
		
		JLabel dateLabel = new JLabel("");
		dateLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		dateLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dateLabel.setBounds(30, 146, 437, 36);
		contentPane.add(dateLabel);
		
        Object[] row = new Object[8];
        Object[] row1 = new Object[8];
        Object[] row2 = new Object[8];
        Object[] row3 = new Object[8];
        Object[] row4 = new Object[8];
        
        timer = Calendar.getInstance();
		timer.getTime();
		tTime = new SimpleDateFormat("hh:mm a");
		//================================================================================== Date =================================================================================================================
		Tdate = new SimpleDateFormat("E,dd-MM-yyyy");
		dateLabel.setText(Tdate.format(timer.getTime()));

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        
		timeLabel = new JLabel(tTime.format(timer.getTime()));
		timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		timeLabel.setFont(new Font("Snap ITC", Font.PLAIN, 50));
		timeLabel.setBounds(30, 72, 437, 96);
		
		//setTime();
		
		contentPane.add(timeLabel);
		
		JLabel lblNewLabel_3 = new JLabel("TIME");
		lblNewLabel_3.setFont(new Font("Sitka Small", Font.BOLD, 13));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(30, 72, 437, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\eclipse-workspace\\Project_Sem3\\src\\projectPackage\\citizenList.txt"));
			
            String indata = null;
            int index = 0;
            while((indata= br.readLine())!= null)
            {
                StringTokenizer st = new StringTokenizer(indata,",");
                 ic = st.nextToken();
                 name = st.nextToken();
                 age = Integer.parseInt(st.nextToken());
                 state = st.nextToken();
                 Category = st.nextToken();
                 
                row[0] = ic;
	            row[1] = name;
	            row[2] = age;
	            row[3] = state;
	            row[4] = Category;
	            row[5] = firstDoseStatus;
	            row[6] = secondDoseStatus;
	            row[7] = certificate;
	                    
	            model.addRow(row);
	            table.enable(false);
	            
	            citizen = new Citizen(ic, name, age, state, Category, firstDoseStatus, secondDoseStatus, certificate);
                citizen.setInformationPatient(ic, name, age, state, Category, firstDoseStatus, secondDoseStatus, certificate);
                citizenlist.add(citizen);
                dCitizenlist.add(citizen);
                dCitizenlist1.add(citizen);
                index++;
            }
            
            Add.addActionListener( new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				 ic = JOptionPane.showInputDialog("Citizen IC number :");
    				 name = JOptionPane.showInputDialog("Citizen Name :"); 
    				 age = Integer.parseInt(JOptionPane.showInputDialog("Citizen age :"));
    				 state = JOptionPane.showInputDialog("Citizen State :");
    				 Category = JOptionPane.showInputDialog("Citizen Category :");
    				 firstDoseStatus = JOptionPane.showInputDialog("Citizen 1st dose status :");
    				 secondDoseStatus = JOptionPane.showInputDialog("Citizen 2nd dose status :");
    				
    				 row[0] = ic;
    		         row[1] = name;
    		         row[2] = age;
    		         row[3] = state;
    		         row[4] = Category;
    		         row[5] = firstDoseStatus;
    		         row[6] = secondDoseStatus;
    		         
    		         if(firstDoseStatus.equalsIgnoreCase("Completed") && secondDoseStatus.equalsIgnoreCase("Completed")) {
    		        	 row[7] = "Done";
    		         }
    		         else {
    		        	 row[7] = "-";
    		         }
    		               
    	            model.addRow(row);
    	            table.enable(false);
    				
    	            citizen = new Citizen(ic, name, age, state, Category, firstDoseStatus, secondDoseStatus, certificate);
    	            citizen.setInformationPatient(ic, name, age, state, Category, firstDoseStatus, secondDoseStatus, certificate);
    	            citizenlist.add(citizen);
    	            dCitizenlist.add(citizen);
    	            dCitizenlist1.add(citizen);
    	            
    	            
    	            for(int x=0; x<citizenlist.size(); x++) {
                		citizen = citizenlist.get(x);
                    	if(citizen.getAge(x) >=18 && 30 >= citizen.getAge(x)) {
                        		stCenter1.push(citizen);
                        		sStack1.push(citizen);
                        		dCitizenlist.addLast(citizen);
                        		dCitizenlist1.addLast(citizen);
                    	}
                    	else if(citizen.getAge(x) >=31 && 49 >= citizen.getAge(x)) {
                    		stCenter2.push(citizen);
                    		sStack2.push(citizen);
                    		dCitizenlist.addLast(citizen);
                    		dCitizenlist1.addLast(citizen);
                	    }
                    	else if(citizen.getAge(x) >=50) {
                    		stCenter3.push(citizen);
                    		sStack3.push(citizen);
                    		dCitizenlist.addLast(citizen);
                    		dCitizenlist1.addLast(citizen);
                	    }
                    //citizenlist.remove(citizen);
                }
    			}
    		});
			
          //___________________________________________________________________________________________Stack____________________________________________________________________________________________________
            for(int x=0; x<citizenlist.size(); x++) {
            		citizen = citizenlist.get(x);
                	if(citizen.getAge(x) >=18 && 30 >= citizen.getAge(x)) {
                    		stCenter1.push(citizen);
                    		sStack1.push(citizen);
                    		dCitizenlist.addLast(citizen);
                    		dCitizenlist1.addLast(citizen);
                	}
                	else if(citizen.getAge(x) >=31 && 49 >= citizen.getAge(x)) {
                		stCenter2.push(citizen);
                		sStack2.push(citizen);
                		dCitizenlist.addLast(citizen);
                		dCitizenlist1.addLast(citizen);
            	    }
                	else if(citizen.getAge(x) >=50) {
                		stCenter3.push(citizen);
                		sStack3.push(citizen);
                		dCitizenlist.addLast(citizen);
                		dCitizenlist1.addLast(citizen);
            	    }
            }
            
            citizenlist.clear();
            
            Delete.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    					String icNumber = JOptionPane.showInputDialog("Please enter the ic number citizen that you want to delete");
    					
    					//remove from LinkedList
    					for(int x=0; x<dCitizenlist.size(); x++) {
    						citizen = dCitizenlist.get(x);
    						if(citizen.getIc(icNumber).equalsIgnoreCase(icNumber)) {
    							model.removeRow(x);
    						}
    					}
    					
    					//remove from stack
    					for(int x=0; x<stCenter1.size(); x++) {
        					citizen = stCenter1.get(x);
        					
    						if(citizen.getIc(icNumber).equalsIgnoreCase(icNumber)) {
    							stCenter1.remove(citizen);
    							sStack1.remove(citizen);
    							dStack1.remove(citizen);
    						}
        					
        				}
                        for(int x=0; x<stCenter2.size(); x++) {
                        	citizen = stCenter2.get(x);
        					
    						if(citizen.getIc(icNumber).equalsIgnoreCase(icNumber)) {
    							stCenter2.remove(citizen);
    							sStack2.remove(citizen);
    							dStack2.remove(citizen);
    						}
        					
        				}
                        for(int x=0; x<stCenter3.size(); x++) {
                        	citizen = stCenter3.get(x);
        					
    						if(citizen.getIc(icNumber).equalsIgnoreCase(icNumber)) {
    							stCenter3.remove(citizen);
    							sStack3.remove(citizen);
    							dStack3.remove(citizen);
    						}
        					
        				}
                        
                        
    				System.out.println("\n\nLinkedList : " +citizenlist.toString());
    				System.out.println("\n\nStack 1 : " +stCenter1);
    				System.out.println("\n\nStack 2 : " +stCenter2);
    				System.out.println("\n\nStack 3 : " +stCenter3);
    				
    			}
    		});
            
            updateFirstDose.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    			
    				int respond = JOptionPane.showConfirmDialog(null,"Do you want to update 1st dose status for all citizen to completed?","",JOptionPane.YES_NO_OPTION);
    				
    				if(respond==0) {
    					
    					
    					if(testFirstDoseStatus.isEmpty()==false) {
    						
    						Citizen test;
    						
    						test = testFirstDoseStatus.getFirst();
    						
    						if(test.getFirstDoseStatus("").equals("")) {
    							firstDoseStatus = "Done";
		    				
							for(int x=0; x<sStack1.size(); x++) {
		    					citizen = stCenter1.get(x);
		    					
		    			        citizen.setFirstDoseStatus(firstDoseStatus);
		    					stCenter1.set(x, citizen);
		    					
		    					dStack1.add(citizen);
		    					qCenter1.add(citizen);
		    					sQueue1.add(citizen);
		    					
		    					if(x<1) {
		    						testFirstDoseStatus.add(citizen);
		    					}
		    					
		    				}
		    				
		                    for(int x=0; x<sStack2.size(); x++) {
		                    	citizen = stCenter2.get(x);
		    					
		    					citizen.setFirstDoseStatus(firstDoseStatus);
		    					stCenter2.set(x, citizen);
		    					
		    					dStack2.add(citizen);
		    					qCenter2.add(citizen);
		    					sQueue2.add(citizen);
		    					
		    				}
		                    
		                    for(int x=0; x<sStack3.size(); x++) {
		                    	citizen = stCenter3.get(x);
		    					
		    					citizen.setFirstDoseStatus(firstDoseStatus);
		    					stCenter3.set(x, citizen);
		    					
		    					dStack3.add(citizen);
		    					qCenter3.add(citizen);
		    					sQueue3.add(citizen);
		    					
		    				}
		                    
		                    stCenter1.clear();
		                    stCenter2.clear();
		                    stCenter3.clear();
		                    
		    				System.out.println("\n\nStack 1 : " +dStack1);
		    				System.out.println("\n\nStack 2 : " +dStack2);
		    				System.out.println("\n\nStack 3 : " +dStack3);
		    				
		    				for(int x=0; x<sStack1.size(); x++) {
		    					
		    	            	citizen = dStack1.get(x);
		    	            	
		    					row2[0] = citizen.getIc(ic);
		    					row2[1] = citizen.getName(name);
		    					row2[2] = citizen.getAge(age);
		    					row2[3] = citizen.getState(state);
		    					row2[4] = citizen.getCategory(Category);
		    					row2[5] = citizen.getFirstDoseStatus(firstDoseStatus);
		    					
		    					model2.addRow(row2);
		    					
		    				}
		    				
		    	            System.out.print(dQueue1);
		    	            
		    	            for(int x=0; x<sStack2.size(); x++) {
		    					
		    	            	citizen = dStack2.get(x);
		    	            	
		    	            	row3[0] = citizen.getIc(ic);
		    	            	row3[1] = citizen.getName(name);
		    	            	row3[2] = citizen.getAge(age);
		    	            	row3[3] = citizen.getState(state);
		    	            	row3[4] = citizen.getCategory(Category);
		    	            	row3[5] = citizen.getFirstDoseStatus(firstDoseStatus);
		    					
		    					model3.addRow(row3);
		    					
		    				}
		    				
		    	            System.out.print(dQueue2);
		    	            
		    	            for(int x=0; x<sStack3.size(); x++) {
		    					
		    	            	citizen = dStack3.get(x);
		    	            	
		    	            	row4[0] = citizen.getIc(ic);
		    	            	row4[1] = citizen.getName(name);
		    	            	row4[2] = citizen.getAge(age);
		    	            	row4[3] = citizen.getState(state);
		    	            	row4[4] = citizen.getCategory(Category);
		    	            	row4[5] = citizen.getFirstDoseStatus(firstDoseStatus);
		    					
		    					model4.addRow(row4);
		    					
		    				}
		    				
		    	            System.out.print(dQueue3);
    						}
    						else {
    							JOptionPane.showMessageDialog(null, "You already update the citizen First Dose Status!!!", "" , JOptionPane.ERROR_MESSAGE);
    						}
        					
        				}
        				else if(testFirstDoseStatus.isEmpty()==true) {
        						
		    				firstDoseStatus = "Done";
		    				
		    					for(int x=0; x<sStack1.size(); x++) {
		        					citizen = stCenter1.get(x);
		        					
		        			        citizen.setFirstDoseStatus(firstDoseStatus);
		        					stCenter1.set(x, citizen);
		        					
		        					dStack1.add(citizen);
		        					qCenter1.add(citizen);
		        					sQueue1.add(citizen);
		        					
		        					if(x<1) {
		        						testFirstDoseStatus.add(citizen);
		        					}
		        					
		        				}
		        				
		                        for(int x=0; x<sStack2.size(); x++) {
		                        	citizen = stCenter2.get(x);
		        					
		        					citizen.setFirstDoseStatus(firstDoseStatus);
		        					stCenter2.set(x, citizen);
		        					
		        					dStack2.add(citizen);
		        					qCenter2.add(citizen);
		        					sQueue2.add(citizen);
		        					
		        				}
		                        
		                        for(int x=0; x<sStack3.size(); x++) {
		                        	citizen = stCenter3.get(x);
		        					
		        					citizen.setFirstDoseStatus(firstDoseStatus);
		        					stCenter3.set(x, citizen);
		        					
		        					dStack3.add(citizen);
		        					qCenter3.add(citizen);
		        					sQueue3.add(citizen);
		        					
		        				}
		                        
		                        stCenter1.clear();
		                        stCenter2.clear();
		                        stCenter3.clear();
		                        
		        				System.out.println("\n\nStack 1 : " +dStack1);
		        				System.out.println("\n\nStack 2 : " +dStack2);
		        				System.out.println("\n\nStack 3 : " +dStack3);
		        				
		        				for(int x=0; x<sStack1.size(); x++) {
		        					
		        	            	citizen = dStack1.get(x);
		        	            	
		        					row2[0] = citizen.getIc(ic);
		        					row2[1] = citizen.getName(name);
		        					row2[2] = citizen.getAge(age);
		        					row2[3] = citizen.getState(state);
		        					row2[4] = citizen.getCategory(Category);
		        					row2[5] = citizen.getFirstDoseStatus(firstDoseStatus);
		        					
		        					model2.addRow(row2);
		        					
		        				}
		        				
		        	            System.out.print(dQueue1);
		        	            
		        	            for(int x=0; x<sStack2.size(); x++) {
		        					
		        	            	citizen = dStack2.get(x);
		        	            	
		        	            	row3[0] = citizen.getIc(ic);
		        	            	row3[1] = citizen.getName(name);
		        	            	row3[2] = citizen.getAge(age);
		        	            	row3[3] = citizen.getState(state);
		        	            	row3[4] = citizen.getCategory(Category);
		        	            	row3[5] = citizen.getFirstDoseStatus(firstDoseStatus);
		        					
		        					model3.addRow(row3);
		        					
		        				}
		        				
		        	            System.out.print(dQueue2);
		        	            
		        	            for(int x=0; x<sStack3.size(); x++) {
		        					
		        	            	citizen = dStack3.get(x);
		        	            	
		        	            	row4[0] = citizen.getIc(ic);
		        	            	row4[1] = citizen.getName(name);
		        	            	row4[2] = citizen.getAge(age);
		        	            	row4[3] = citizen.getState(state);
		        	            	row4[4] = citizen.getCategory(Category);
		        	            	row4[5] = citizen.getFirstDoseStatus(firstDoseStatus);
		        					
		        					model4.addRow(row4);
		        					
		        				}
		        				
		        	            System.out.print(dQueue3);
		    					
		    				
        					}
    					
    				}
    				else if(respond==1) {
    					
    					if(testFirstDoseStatus.isEmpty()==false) {
        					JOptionPane.showMessageDialog(null, "You already update the citizen 1st Dose Status!!!", "" , JOptionPane.ERROR_MESSAGE);
        				}
        				else if(testFirstDoseStatus.isEmpty()==true) {
    					for(int x=0; x<stCenter1.size(); x++) {
        					citizen = stCenter1.get(x);
        					
        			        citizen.setFirstDoseStatus("");
        					stCenter1.set(x, citizen);
        					
        					if(x<1) {
        						testFirstDoseStatus.add(citizen);
        					}
        					
        				}
        				
		            for(int x=0; x<stCenter2.size(); x++) {
		            	citizen = stCenter2.get(x);
        					
        					citizen.setFirstDoseStatus("");
        					stCenter2.set(x, citizen);
        					
        				}
		            
		            for(int x=0; x<stCenter3.size(); x++) {
		            	citizen = stCenter3.get(x);
        					
        					citizen.setFirstDoseStatus("");
        					stCenter3.set(x, citizen);	
        				}
		            
		            //stCenter1.clear();
		            //stCenter2.clear();
		            //stCenter3.clear();
		            
        				System.out.println("\n\nStack 1 : " +dStack1);
        				System.out.println("\n\nStack 2 : " +dStack2);
        				System.out.println("\n\nStack 3 : " +dStack3);
    				}
    			}
    				
    			}
    		});
            
            updateSecondDose.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				int respond = JOptionPane.showConfirmDialog(null,"Enter ic number citizen that you want too update citizen 2nd dose status","",JOptionPane.YES_NO_OPTION);
    				
    				if(respond == 0) {
    					
    				if(testSecondDoseStatus.isEmpty()==false) {
                        
    					Citizen test;
    					
    					test = testSecondDoseStatus.getFirst();
    					
    					if(test.getSecondDoseStatus("").equalsIgnoreCase("")) {
    						
    					}
    					JOptionPane.showMessageDialog(null, "You already update the citizen 2nd Dose Status!!!", "" , JOptionPane.ERROR_MESSAGE);
    				}
    				
    				else if(testSecondDoseStatus.isEmpty()==true) {
    						if(qCenter1.isEmpty()==true) {
            					if(qCenter2.isEmpty()==true) {
            						if(qCenter3.isEmpty()==true) {
            							JOptionPane.showMessageDialog(null, "Cannot update 2nd dose cause you does not update the citizen 1st dose status!!!", "" , JOptionPane.ERROR_MESSAGE);
            						}
            					}
            				  }
    						
    						else {
    							
    							if(qCenter1.isEmpty()==false) {
    	        					if(qCenter2.isEmpty()==false) {
    	        						if(qCenter3.isEmpty()==false) {
    	        							
    	        		    				secondDoseStatus = "Done";
    	        							
    	        		    					dQueue1.clear();
    	        		    					dQueue2.clear();
    	        		    					dQueue3.clear();
    	        		    					
    	        		    					for(int x=0; x<sQueue1.size(); x++) {
    	        		        					citizen = qCenter1.element();
    	        		        					
    	        		        			        citizen.setSecondDoseStatus(secondDoseStatus);
    	        		        					citizen.setCertificate("Completed");
    	        		        			        dQueue1.add(citizen);
    	        		        			        
    	        		        			        if(x<1) {
    	        		        			        	testSecondDoseStatus.add(citizen);
    	        		        			        }
    	        		        			        completedList.add(citizen);
    	        		        					qCenter1.remove(citizen);
    	        		        				}
    	        		        				
    	        		    					
    	        		                        for(int x=0; x<sQueue2.size(); x++) {
    	        		                        	citizen = qCenter2.element();
    	        		        					
    	        		        					citizen.setSecondDoseStatus(secondDoseStatus);
    	        		        					citizen.setCertificate("Completed");
    	        		        					
    	        		        					dQueue2.add(citizen);
    	        		        					completedList.add(citizen);
    	        		        					qCenter2.remove(citizen);
    	        		        					
    	        		        				}
    	        		                        
    	        		                        for(int x=0; x<sQueue3.size(); x++) {
    	        		                        	citizen = qCenter3.element();
    	        		        					
    	        		        					citizen.setSecondDoseStatus(secondDoseStatus);
    	        		        					citizen.setCertificate("Completed");
    	        		        					
    	        		        					dQueue3.add(citizen);
    	        		        					completedList.add(citizen);
    	        		        					qCenter3.remove(citizen);
    	        		        				}
    	        		        				System.out.println("\n\nStack 1 : " +dQueue1);
    	        		        				System.out.println("\n\nStack 2 : " +dQueue2);
    	        		        				System.out.println("\n\nStack 3 : " +dQueue3);
    	        		        				
    	        		        				for(int x=0; x<completedList.size(); x++) {
    	        		        					
    	        		        					row1[0] = completedList.get(x).getIc(ic);
    	        		        					row1[1] = completedList.get(x).getName(name);
    	        		        					row1[2] = completedList.get(x).getAge(age);
    	        		        					row1[3] = completedList.get(x).getState(state);
    	        		        					row1[4] = completedList.get(x).getCategory(Category);
    	        		        					row1[5] = completedList.get(x).getFirstDoseStatus(firstDoseStatus);
    	        		        					row1[6] = completedList.get(x).getSecondDoseStatus(secondDoseStatus);
    	        		        					row1[7] = completedList.get(x).getCertificate(certificate);
    	        		        					
    	        		        					model5.addRow(row1);
    	        		        				}
    	        		        				
    	        						}
    	        					}
    	        				}
    						}
        				 
    					}
    				}
    				
    				
    			}
    		});
	
            DisplayFirstDose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                    
				    
					if(dStack1.isEmpty()==true) {
						if(dStack2.isEmpty()==true) {
							if(dStack3.isEmpty()==true) {
								JOptionPane.showMessageDialog(null, "Cannot display 1st dose status cause you dont update 1st dose status for all citizen!!!", "" , JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					else {
						
	                    pane2.setVisible(true);
	    				pane3.setVisible(true);
	    				pane4.setVisible(true);
	    				pane.setVisible(false);
	    				pane5.setVisible(false);
	    				citizenDetails1.setVisible(true);
	    				yearsOld18.setVisible(true);
	    				yearsOld31.setVisible(true);
	    				yearsOld50.setVisible(true);
	    				citizenDetails.setVisible(false);
	    				CompletedLabel.setVisible(false);
	    				citizenDetails2.setVisible(false);
	    				
					}
                    
			}
		});
		
    		DisplayCompleteDose.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				if(completedList.isEmpty()==true) {
    					JOptionPane.showMessageDialog(null, "Cannot display complete dose status for all citizen because you not update 2nd dose status for all citizen!!!", "" , JOptionPane.ERROR_MESSAGE);
    				}
    				else if(completedList.isEmpty()==false) {
    					
		            pane5.setVisible(true);
        				pane2.setVisible(false);
        				pane3.setVisible(false);
        				pane4.setVisible(false);
		            citizenDetails.setVisible(false);
        				pane.setVisible(false);
        				CompletedLabel.setVisible(true);
        				citizenDetails2.setVisible(true);
        				citizenDetails1.setVisible(false);
        				yearsOld18.setVisible(false);
        				yearsOld31.setVisible(false);
        				yearsOld50.setVisible(false);
    				}
    				

		        
    				
    			}
    		});
    		
    		finishButton.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				closedPage page = new closedPage();
    				page.setVisible(true);
    				page.setLocationRelativeTo(null);
    				dispose();
    				
    			}
    		});
    		
    		
        }
        catch (Exception p) {
            System.out.println(p.getMessage());
        }
		
		
	}
}