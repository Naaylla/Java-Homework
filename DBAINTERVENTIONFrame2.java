package DBAINTERVENTION;
import java.awt.EventQueue;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
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
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTable;
import java.awt.FlowLayout;

public class DBAINTERVENTIONFrame2 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JPanel panel_1;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JLabel lblNewLabel_9;
	private JPanel panel_4;
	private JLabel lblNewLabel_8;
	private JButton btnNewButton;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JPanel panel_5;
	private JPanel panel_6;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBAINTERVENTIONFrame2 frame = new DBAINTERVENTIONFrame2();
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
	public DBAINTERVENTIONFrame2() {
		setTitle("DBI/Tasks/task2");
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
		
		panel_3 = new JPanel();
		panel_3.setBounds(682, 11, 360, 440);
		panel_3.setBackground(SystemColor.controlHighlight);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
		DefaultTableModel model = new DefaultTableModel(
			    new Object[200][6],
			    new String[] {
			        "1", "2", "3", "4", "5", "6"
			    }
			);

		panel_4 = new JPanel();
		panel_4.setOpaque(false);
		panel_4.setBounds(30, 153, 306, 50);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setBounds(105, 0, 96, 50);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(124, 124, 124));
		panel_4.add(btnNewButton_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		lblNewLabel_9 = new JLabel("TABLE INTERVENTIONS");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setIconTextGap(1);
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setAlignmentX(0.5f);
		lblNewLabel_9.setBounds(30, 11, 271, 22);
		panel_3.add(lblNewLabel_9);
		
		panel_2 = new JPanel();
		panel_2.setBounds(16, 44, 328, 98);
		panel_3.add(panel_2);
		panel_2.setOpaque(false);
		panel_2.setBackground(SystemColor.activeCaptionBorder);
		panel_2.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(170, 0, 148, 109);
		panel_2.add(panel);
		panel.setOpaque(false);
		panel.setBorder(null);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(0, 44, 132, 20);
		panel.add(textField_1);
		textField_1.setAutoscrolls(false);
		textField_1.setAlignmentX(0.0f);
		textField_1.setAlignmentY(0.0f);
		textField_1.setMargin(new Insets(1, 1, 1, 0));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
	
		textField_2 = new JTextField();
		textField_2.setBounds(0, 75, 132, 20);
		panel.add(textField_2);
		textField_2.setAutoscrolls(false);
		textField_2.setAlignmentX(0.0f);
		textField_2.setAlignmentY(0.0f);
		textField_2.setMargin(new Insets(1, 0, 1, 0));
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);				
				
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(0, 11, 132, 22);
		panel.add(comboBox);
				
		panel_1 = new JPanel();
		panel_1.setBounds(0, 11, 160, 98);
		panel_2.add(panel_1);
		panel_1.setBorder(null);
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.setOpaque(false);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("NUMINTERVENTION");
		panel_1.add(lblNewLabel);
		lblNewLabel.setIconTextGap(1);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
		lblNewLabel_1 = new JLabel("DATEDEBINTERV");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIconTextGap(1);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
	    lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
		lblNewLabel_2 = new JLabel("DATEFININTERV");
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIconTextGap(1);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
	
		table = new JTable();

		// Définir les noms de colonnes
		String[] columnNames = {"NUMINTERVENTION", "DATEDEBINTERV", "DATEFININTERV"};

		// Créer un modèle de table par défaut avec les noms de colonnes
		DefaultTableModel model1 = new DefaultTableModel(columnNames, 0);

		// Définir le modèle de table
		table.setModel(model1);

		table.setBounds(10, 214, 340, 215);
		panel_3.add(table);
		panel_5 = new JPanel();
		panel_5.setBounds(10, 11, 662, 224);
		contentPane.add(panel_5);
		panel_5.setLayout(new GridLayout(0, 1, 0, 0));
		
		btnNewButton_9 = new JButton("Les Noms et prénoms des employes ayant fait plus de 3 interventions");
		panel_5.add(btnNewButton_9);
		btnNewButton_9.setForeground(SystemColor.desktop);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_9.setBackground(SystemColor.menu);
		btnNewButton_9.setAlignmentX(1.0f);
		
		btnNewButton_3 = new JButton("La liste des véhicules");
		panel_5.add(btnNewButton_3);
		btnNewButton_3.setForeground(SystemColor.desktop);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_3.setBackground(SystemColor.menu);
		btnNewButton_3.setAlignmentX(1.0f);
		
		btnNewButton_4 = new JButton("Les détails d’une intervention");
		panel_5.add(btnNewButton_4);
		btnNewButton_4.setForeground(SystemColor.desktop);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_4.setBackground(SystemColor.menu);
		btnNewButton_4.setAlignmentX(1.0f);
		
		btnNewButton_5 = new JButton("Les modèles et leur marque");
		panel_5.add(btnNewButton_5);
		btnNewButton_5.setForeground(SystemColor.desktop);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_5.setBackground(SystemColor.menu);
		btnNewButton_5.setAlignmentX(1.0f);
		
		btnNewButton_6 = new JButton("Les véhicules sur lesquels il y a au moins une intervention");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_5.add(btnNewButton_6);
		btnNewButton_6.setForeground(SystemColor.desktop);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_6.setBackground(SystemColor.menu);
		btnNewButton_6.setAlignmentX(1.0f);
		
		btnNewButton_7 = new JButton("Les employés dont le nom commence par un T");
		panel_5.add(btnNewButton_7);
		btnNewButton_7.setForeground(SystemColor.desktop);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_7.setBackground(SystemColor.menu);
		btnNewButton_7.setAlignmentX(1.0f);
		
		btnNewButton_8 = new JButton("La liste des interventions faites par l’employé dont le nom est saisie par l’utilisateur");
		panel_5.add(btnNewButton_8);
		btnNewButton_8.setForeground(SystemColor.desktop);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_8.setBackground(SystemColor.menu);
		btnNewButton_8.setAlignmentX(1.0f);
		
		btnNewButton = new JButton("La liste des interventions faites dans une période donnée");
		panel_5.add(btnNewButton);
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.setAlignmentX(1.0f);
		
		panel_6 = new JPanel();
		panel_6.setBounds(10, 11, 662, 440);
		panel_6.setBackground(SystemColor.activeCaptionBorder);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 235, 642, 194);
		panel_6.add(textField);

	}
}
