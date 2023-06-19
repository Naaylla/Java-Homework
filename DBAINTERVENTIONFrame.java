package DBAINTERVENTION;
import java.awt.EventQueue;


import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBAINTERVENTIONFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_4;
	private JTextField textField_5;
	private JLabel lblNewLabel_5;
	private JTextField textField_6;
	private JLabel lblNewLabel_6;
	private JTextField textField_7;
	private JLabel lblNewLabel_7;
	private JPanel panel_1;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_9;
	private JPanel panel_4;
	private JLabel lblNewLabel_8;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBAINTERVENTIONFrame frame = new DBAINTERVENTIONFrame();
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
	public DBAINTERVENTIONFrame() {
		
		setTitle("DBI/Tasks/task1");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lenovo\\Desktop\\1077114.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setAlignmentX(0.0f);
		contentPane.setAlignmentY(0.0f);
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(1068, 502);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBackground(SystemColor.activeCaptionBorder);
		panel_2.setBounds(40, 60, 328, 268);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(170, 0, 148, 260);
		panel_2.add(panel);
		panel.setOpaque(false);
		panel.setBorder(null);
		panel.setLayout(null);
		
		textField_7 = new JTextField();
		textField_7.setBounds(0, 210, 132, 20);
		panel.add(textField_7);
		textField_7.setAutoscrolls(false);
		textField_7.setAlignmentX(0.0f);
		textField_7.setAlignmentY(0.0f);
		textField_7.setMargin(new Insets(1, 0, 1, 0));
		textField_7.setHorizontalAlignment(SwingConstants.LEFT);
		textField_7.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 30, 132, 20);
		panel.add(textField_1);
		textField_1.setAutoscrolls(false);
		textField_1.setAlignmentX(0.0f);
		textField_1.setAlignmentY(0.0f);
		textField_1.setMargin(new Insets(1, 1, 1, 0));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(0, 60, 132, 20);
		panel.add(textField_2);
		textField_2.setAutoscrolls(false);
		textField_2.setAlignmentX(0.0f);
		textField_2.setAlignmentY(0.0f);
		textField_2.setMargin(new Insets(1, 0, 1, 0));
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(0, 150, 132, 20);
		panel.add(textField_5);
		textField_5.setAutoscrolls(false);
		textField_5.setAlignmentX(0.0f);
		textField_5.setAlignmentY(0.0f);
		textField_5.setMargin(new Insets(1, 0, 1, 0));
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(0, 90, 132, 20);
		panel.add(textField_3);
		textField_3.setAutoscrolls(false);
		textField_3.setAlignmentX(0.0f);
		textField_3.setAlignmentY(0.0f);
		textField_3.setMargin(new Insets(1, 0, 1, 0));
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(0, 120, 132, 20);
		panel.add(textField_4);
		textField_4.setAutoscrolls(false);
		textField_4.setAlignmentX(0.0f);
		textField_4.setAlignmentY(0.0f);
		textField_4.setMargin(new Insets(1, 0, 1, 0));
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(0, 180, 132, 20);
		panel.add(textField_6);
		textField_6.setAutoscrolls(false);
		textField_6.setAlignmentX(0.0f);
		textField_6.setAlignmentY(0.0f);
		textField_6.setMargin(new Insets(1, 0, 1, 0));
		textField_6.setHorizontalAlignment(SwingConstants.LEFT);
		textField_6.setColumns(10);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.inactiveCaption);
		textField.setBounds(0, 0, 132, 20);
		panel.add(textField);
		textField.setAutoscrolls(false);
		textField.setAlignmentX(0.0f);
		textField.setAlignmentY(0.0f);
		textField.setMargin(new Insets(1, 0, 1, 0));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setMargin(new Insets(1, 0, 1, 0));
		textField_8.setHorizontalAlignment(SwingConstants.LEFT);
		textField_8.setColumns(10);
		textField_8.setAutoscrolls(false);
		textField_8.setAlignmentY(0.0f);
		textField_8.setAlignmentX(0.0f);
		textField_8.setBounds(0, 240, 132, 20);
		panel.add(textField_8);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 160, 270);
		panel_2.add(panel_1);
		panel_1.setBorder(null);
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.setOpaque(false);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		
		JLabel lblNewLabel = new JLabel("NUMCLIENT");
		panel_1.add(lblNewLabel);
		lblNewLabel.setIconTextGap(1);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_1 = new JLabel("CIV");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIconTextGap(1);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_2 = new JLabel("PRENOMCLIENT");
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIconTextGap(1);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_3 = new JLabel("NOMCLIENT");
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIconTextGap(1);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_4 = new JLabel("DATENAISSANCE");
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setIconTextGap(1);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_5 = new JLabel("ADRESSE");
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setIconTextGap(1);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_6 = new JLabel("TELPROF");
		panel_1.add(lblNewLabel_6);
		lblNewLabel_6.setIconTextGap(1);
		lblNewLabel_6.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_6.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_7 = new JLabel("TELPRIV");
		panel_1.add(lblNewLabel_7);
		lblNewLabel_7.setIconTextGap(1);
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblNewLabel_7.setAlignmentY(Component.TOP_ALIGNMENT);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_8 = new JLabel("FAX");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_8.setIconTextGap(1);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_8.setAlignmentY(0.0f);
		lblNewLabel_8.setAlignmentX(1.0f);
		panel_1.add(lblNewLabel_8);
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setBounds(10, 11, 360, 440);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(180, 11, 132, 22);
		panel_3.add(comboBox);
		
		String[] values = {"CLIENT", "EMPLOYE", "MARQUE", "MODELE", "VEHICULE", "INTERVENTIONS", "INTERVENANTS"};
		for (String value : values) {
		    comboBox.addItem(value);
		}
		
		DefaultTableModel model = new DefaultTableModel(
			    new Object[300][9],
			    new String[] {
			        "1", "2", "3", "4", "5", "6", "7", "8", "9"
			    }
			);

		panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBounds(30, 330, 306, 50);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("AJOUTER");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(124, 124, 124));
		btnNewButton.setBounds(88, 0, 130, 50);
		panel_4.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
	
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		lblNewLabel_9 = new JLabel("TABLE");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setIconTextGap(1);
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setAlignmentX(0.5f);
		lblNewLabel_9.setBounds(114, 11, 56, 22);
		panel_3.add(lblNewLabel_9);
		
		 
    	JTable table = new JTable(model);
		table.setRowSelectionAllowed(false);
		table.setBounds(378, 11, 664, 440);
		contentPane.add(table);

		model.setValueAt("NUMCLIENT", 0, 0); // NUMCLIENT
		model.setValueAt("CIV", 0, 1); // CIV
		model.setValueAt("PRENOMCLIENT", 0, 2); // PRENOMCLIENT
		model.setValueAt("DATENAISSANCE", 0, 3); // NOMCLIENT
		model.setValueAt("NOMCLIENT", 0, 4); // NOMCLIENT
		model.setValueAt("ADRESSE", 0, 5); // NUMCLIENT
		model.setValueAt("TELPROF", 0, 6); // CIV
		model.setValueAt("TELPRIV", 0, 7); // PRENOMCLIENT
		model.setValueAt("FAX", 0, 8); // NOMCLIENT
			
		table.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer());
	    table.getColumnModel().getColumn(0).setPreferredWidth(80); 
	    table.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer());
	    table.getColumnModel().getColumn(1).setPreferredWidth(30); 
		table.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer());
	    table.getColumnModel().getColumn(2).setPreferredWidth(100);
	    table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer());
        table.getColumnModel().getColumn(3).setPreferredWidth(180);
        table.getColumnModel().getColumn(4).setCellRenderer(new DefaultTableCellRenderer());
        table.getColumnModel().getColumn(4).setPreferredWidth(80);
        table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer());
        table.getColumnModel().getColumn(3).setPreferredWidth(80);
        table.getColumnModel().getColumn(8).setCellRenderer(new DefaultTableCellRenderer());
        table.getColumnModel().getColumn(8).setPreferredWidth(30);	        
        
        int numColumns = 9; 
    	String[] columnNames = new String[numColumns];
    	
		comboBox.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String selectedValue = (String) comboBox.getSelectedItem();
		        
		        switch (selectedValue) {
	            case "CLIENT":
	            	for (int i = 0; i < numColumns; i++) {
	            	    columnNames[i] = String.valueOf(i + 1);
	            	}
	            	model.setColumnIdentifiers(columnNames);
	        		model.setValueAt("NUMCLIENT", 0, 0);  
	        		model.setValueAt("CIV", 0, 1); 
	        		model.setValueAt("PRENOMCLIENT", 0, 2);
	        		model.setValueAt("DATENAISSANCE", 0, 3); 
	        		model.setValueAt("NOMCLIENT", 0, 4);
	        		model.setValueAt("ADRESSE", 0, 5); 
	        		model.setValueAt("TELPROF", 0, 6); 
	        		model.setValueAt("TELPRIV", 0, 7); 
	        		model.setValueAt("FAX", 0, 8); 
	        			
	        		table.getColumnModel().getColumn(0).setCellRenderer(new DefaultTableCellRenderer());
	        	    table.getColumnModel().getColumn(0).setPreferredWidth(80); 
	        	    table.getColumnModel().getColumn(1).setCellRenderer(new DefaultTableCellRenderer());
	        	    table.getColumnModel().getColumn(1).setPreferredWidth(30); 
	        		table.getColumnModel().getColumn(2).setCellRenderer(new DefaultTableCellRenderer());
	        	    table.getColumnModel().getColumn(2).setPreferredWidth(100);
	        	    table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer());
	                table.getColumnModel().getColumn(3).setPreferredWidth(180);
	                table.getColumnModel().getColumn(4).setCellRenderer(new DefaultTableCellRenderer());
	                table.getColumnModel().getColumn(4).setPreferredWidth(80);
	                table.getColumnModel().getColumn(3).setCellRenderer(new DefaultTableCellRenderer());
	                table.getColumnModel().getColumn(3).setPreferredWidth(80);
	                table.getColumnModel().getColumn(8).setCellRenderer(new DefaultTableCellRenderer());
	                table.getColumnModel().getColumn(8).setPreferredWidth(30);	               
	                
	                
	            	lblNewLabel.setText("NUMCLIENT");
	            	lblNewLabel_1.setText("CIV");
	            	lblNewLabel_2.setText("PRENOMCLIENT");
	            	lblNewLabel_3.setText("NOMCLIENT");
	            	lblNewLabel_4.setText("DATENAISSANCE");
	            	lblNewLabel_5.setText("ADRESSE");
	            	lblNewLabel_6.setText("TELPROF");
	            	lblNewLabel_7.setText("TELPRIV");
	            	lblNewLabel_8.setText("FAX");
	            		
	            	lblNewLabel.setVisible(true);
	             	lblNewLabel_1.setVisible(true);
	             	lblNewLabel_2.setVisible(true);
	             	lblNewLabel_3.setVisible(true);
	             	lblNewLabel_4.setVisible(true);
	             	lblNewLabel_5.setVisible(true);
	             	lblNewLabel_6.setVisible(true);
	             	lblNewLabel_7.setVisible(true);
	             	lblNewLabel_8.setVisible(true);
	            	
	            	textField.setVisible(true);
	            	textField_1.setVisible(true);
	            	textField_2.setVisible(true);
	            	textField_3.setVisible(true);
	            	textField_4.setVisible(true);
	            	textField_5.setVisible(true);
	            	textField_6.setVisible(true);
	            	textField_7.setVisible(true);
	            	textField_8.setVisible(true);
	            	
	            	/*// Connect to the database
					Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
					Statement statement = connection.createStatement();
					
					// Retrieve data from the database for the selected option
					String query = "SELECT * FROM your_table WHERE your_condition";
					ResultSet resultSet = statement.executeQuery(query);
					
					// Populate the table with the retrieved data
					while (resultSet.next()) {
					    Object[] rowData = new Object[model.getColumnCount()];
					    for (int i = 0; i < rowData.length; i++) {
					        rowData[i] = resultSet.getObject(i + 1);
					    }
					    model.addRow(rowData);
					}
					
					// Close the database connection and resources
					resultSet.close();
					statement.close();
					connection.close();*/
						    
	                break;
	            case "EMPLOYE":  
	            	
	            	int numColumns = 5;
	                String[] columnNames = new String[numColumns];
	                 
	                for (int i = 0; i < numColumns; i++) {
	                     columnNames[i] = String.valueOf(i + 1);
	                }
	                 
	                model.setColumnIdentifiers(columnNames);
	                 
	                model.setValueAt("NUMEMPLOYE", 0, 0); 
		        	model.setValueAt("NOMEMP", 0, 1);
		        	model.setValueAt("PRENOMEMP", 0, 2); 
		        	model.setValueAt("CATEGORIE", 0, 3); 
		        	model.setValueAt("SALAIRE", 0, 4); 
               
	            	lblNewLabel.setText("NUMEMPLOYE");
	            	lblNewLabel_1.setText("NOMEMP");
	            	lblNewLabel_2.setText("PRENOMEMP");   
	            	lblNewLabel_3.setText("CATEGORIE");   
	            	lblNewLabel_4.setText("SALAIRE");   
	            	
	            	lblNewLabel.setVisible(true);
	             	lblNewLabel_1.setVisible(true);
	             	lblNewLabel_2.setVisible(true);
	             	lblNewLabel_3.setVisible(true);
	             	lblNewLabel_4.setVisible(true);
	             	lblNewLabel_5.setVisible(false);
	             	lblNewLabel_6.setVisible(false);
	             	lblNewLabel_7.setVisible(false);
	             	lblNewLabel_8.setVisible(false);
	             	
	             	lblNewLabel.setBounds(10, 0, 98, 22);
	             	
	             	textField.setVisible(true);
	            	textField_1.setVisible(true);
	            	textField_2.setVisible(true);
	            	textField_3.setVisible(true);
	            	textField_4.setVisible(true);
	            	textField_5.setVisible(false);
	            	textField_6.setVisible(false);
	            	textField_7.setVisible(false);
	            	textField_8.setVisible(false);
	

	                break;
	            case "MARQUE":
	            	
	            	 int numColumns1 = 3; 
	                 String[] columnNames1 = new String[numColumns1];
	                 
	                 for (int i = 0; i < numColumns1; i++) {
	                     columnNames1[i] = String.valueOf(i + 1);
	                 }
	                 
	                model.setColumnIdentifiers(columnNames1);

	                model.setValueAt("NUMMARQUE", 0, 0); 
		        	model.setValueAt("MARQUE", 0, 1);
		        	model.setValueAt("PAYS", 0, 2); 
		        	
	             	lblNewLabel.setText("NUMMARQUE");
	            	lblNewLabel_1.setText("MARQUE");
	            	lblNewLabel_2.setText("PAYS");   

	            	lblNewLabel.setVisible(true);
	             	lblNewLabel_1.setVisible(true);
	             	lblNewLabel_2.setVisible(true);
	             	lblNewLabel_3.setVisible(false);
	             	lblNewLabel_4.setVisible(false);
	             	lblNewLabel_5.setVisible(false);
	             	lblNewLabel_6.setVisible(false);
	             	lblNewLabel_7.setVisible(false);
	             	lblNewLabel_8.setVisible(false);
	            	
	             	textField.setVisible(true);
	            	textField_1.setVisible(true);
	            	textField_2.setVisible(true);
	            	textField_3.setVisible(false);
	            	textField_4.setVisible(false);
	            	textField_5.setVisible(false);
	            	textField_6.setVisible(false);
	            	textField_7.setVisible(false);
	            	textField_8.setVisible(false);
	            	
	                break;
	            case "MODELE":
	            	
	            	 int numColumns2 = 3; 
	                 String[] columnNames2 = new String[numColumns2];
	                 
	                 for (int i = 0; i < numColumns2; i++) {
	                     columnNames2[i] = String.valueOf(i + 1);
	                 }
	                 
	                model.setColumnIdentifiers(columnNames2);
	                 
		            model.setValueAt("NUMMARQUE", 0, 0); 
			        model.setValueAt("NUMMARQUE", 0, 1);
			        model.setValueAt("MODELE", 0, 2); 
			        	
		            lblNewLabel.setText("NUMMODELE");
		            lblNewLabel_1.setText("NUMMARQUE");
		            lblNewLabel_2.setText("MODELE");   
	                 
	                 
	             	lblNewLabel.setText("NUMMODELE");
	            	lblNewLabel_1.setText("NUMMARQUE");
	            	lblNewLabel_2.setText("MODELE");
	  
	            	lblNewLabel.setVisible(true);
	             	lblNewLabel_1.setVisible(true);
	             	lblNewLabel_2.setVisible(true);
	             	lblNewLabel_3.setVisible(false);
	             	lblNewLabel_4.setVisible(false);
	             	lblNewLabel_5.setVisible(false);
	             	lblNewLabel_6.setVisible(false);
	             	lblNewLabel_7.setVisible(false);
	             	lblNewLabel_8.setVisible(false);
	              	
	             	textField.setVisible(true);
	            	textField_1.setVisible(true);
	            	textField_2.setVisible(true);
	            	textField_3.setVisible(false);
	            	textField_4.setVisible(false);
	            	textField_5.setVisible(false);
	            	textField_6.setVisible(false);
	            	textField_7.setVisible(false);
	            	textField_8.setVisible(false);
	            	
	                break;
	            case "VEHICULE":
	            	
	            	 int numColumns3 = 5; 
	                 String[] columnNames3 = new String[numColumns3];
	                 
	                 for (int i = 0; i < numColumns3; i++) {
	                     columnNames3[i] = String.valueOf(i + 1);
	                 }
	                 
	                model.setColumnIdentifiers(columnNames3);
	                
			        model.setValueAt("NUMVEHICULE", 0, 0); 
				    model.setValueAt("NUMCLIENT", 0, 1);
				    model.setValueAt("NUMMODELE", 0, 2); 
				    model.setValueAt("NUMIMMAT", 0, 3); 
				    model.setValueAt("ANNEE", 0, 4); 
				        	
	             	lblNewLabel.setText("NUMVEHICULE");
	            	lblNewLabel_1.setText("NUMCLIENT");
	            	lblNewLabel_2.setText("NUMMODELE");
	            	lblNewLabel_3.setText("NUMIMMAT");
	            	lblNewLabel_4.setText("ANNEE");
	            	  	
	            	lblNewLabel.setVisible(true);
	             	lblNewLabel_1.setVisible(true);
	             	lblNewLabel_2.setVisible(true);
	             	lblNewLabel_3.setVisible(true);
	             	lblNewLabel_4.setVisible(true);
	             	lblNewLabel_5.setVisible(false);
	             	lblNewLabel_6.setVisible(false);
	             	lblNewLabel_7.setVisible(false);
	             	lblNewLabel_8.setVisible(false);
	              	
	             	textField.setVisible(true);
	            	textField_1.setVisible(true);
	            	textField_2.setVisible(true);
	            	textField_3.setVisible(true);
	            	textField_4.setVisible(true);
	            	textField_5.setVisible(false);
	            	textField_6.setVisible(false);
	            	textField_7.setVisible(false);
	            	textField_8.setVisible(false);
	            	
	                break;
	            case "INTERVENTIONS":   
	            	
	            	 int numColumns4 = 6; 
	                 String[] columnNames4 = new String[numColumns4];
	                 
	                 for (int i = 0; i < numColumns4; i++) {
	                     columnNames4[i] = String.valueOf(i + 1);
	                 }
	                 
	                model.setColumnIdentifiers(columnNames4);
	                 
				    model.setValueAt("NUMINTERVENTION", 0, 0); 
					model.setValueAt("NUMVEHICULE", 0, 1);
					model.setValueAt("TYPEINTERVENTION", 0, 2); 
					model.setValueAt("DATEDEBINTERV", 0, 3); 
					model.setValueAt("DATEFININTERV", 0, 4); 
					model.setValueAt("COUTINTERV", 0, 5); 
	                 
	            	lblNewLabel.setText("NUMINTERVENTION");
	            	lblNewLabel_1.setText("NUMVEHICULE");
	            	lblNewLabel_2.setText("TYPEINTERVENTION");
	            	lblNewLabel_3.setText("DATEDEBINTERV");
	            	lblNewLabel_4.setText("DATEFININTERV");
	            	lblNewLabel_5.setText("COUTINTERV");

	            	lblNewLabel.setVisible(true);
	             	lblNewLabel_1.setVisible(true);
	             	lblNewLabel_2.setVisible(true);
	             	lblNewLabel_3.setVisible(true);
	             	lblNewLabel_4.setVisible(true);
	             	lblNewLabel_5.setVisible(true);
	             	lblNewLabel_6.setVisible(false);
	             	lblNewLabel_7.setVisible(false);
	             	lblNewLabel_8.setVisible(false);
	              	
	             	textField.setVisible(true);
	            	textField_1.setVisible(true);
	            	textField_2.setVisible(true);
	            	textField_3.setVisible(true);
	            	textField_4.setVisible(true);
	            	textField_5.setVisible(true);
	            	textField_6.setVisible(false);
	            	textField_7.setVisible(false);
	            	textField_8.setVisible(false);
	            	
	                break;
	            case "INTERVENANTS":    
	            	
	            	 int numColumns5 = 4; 
	                 String[] columnNames5 = new String[numColumns5];
	                 
	                 for (int i = 0; i < numColumns5; i++) {
	                     columnNames5[i] = String.valueOf(i + 1);
	                 }
	                 
	                 model.setColumnIdentifiers(columnNames5);
	                 
	            	lblNewLabel.setText("NUMINTERVENTION");
	            	lblNewLabel_1.setText("NUMEMPLOYE");
	            	lblNewLabel_2.setText("DATEDEBUT");
	            	lblNewLabel_3.setText("DATEFIN");
	            	
	            	lblNewLabel.setVisible(true);
	             	lblNewLabel_1.setVisible(true);
	             	lblNewLabel_2.setVisible(true);
	             	lblNewLabel_3.setVisible(false);
	             	lblNewLabel_4.setVisible(false);
	             	lblNewLabel_5.setVisible(false);
	             	lblNewLabel_6.setVisible(false);
	             	lblNewLabel_7.setVisible(false);
	             	lblNewLabel_8.setVisible(false);
	              	
	             	textField.setVisible(true);
	            	textField_1.setVisible(true);
	            	textField_2.setVisible(true);
	            	textField_3.setVisible(false);
	            	textField_4.setVisible(false);
	            	textField_5.setVisible(false);
	            	textField_6.setVisible(false);
	            	textField_7.setVisible(false);
	            	textField_8.setVisible(false);
	            	
	                break;
	        }
	    }
	}); 

	}
}
