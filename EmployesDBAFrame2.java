package EMPLOYESDBA;
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

public class EmployesDBAFrame2 extends JFrame {

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
	private JPanel panel_1;
	private JPanel panel;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel lblNewLabel_9;
	private JPanel panel_4;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployesDBAFrame2 frame = new EmployesDBAFrame2();
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
	public EmployesDBAFrame2() {
		setTitle("EmployesDBA/tasks/task2");
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
		panel_2.setBounds(40, 60, 328, 158);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(170, 0, 148, 150);
		panel_2.add(panel);
		panel.setOpaque(false);
		panel.setBorder(null);
		panel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.inactiveCaption);
		textField_1.setBounds(0, 30, 132, 20);
		panel.add(textField_1);
		textField_1.setAutoscrolls(false);
		textField_1.setAlignmentX(0.0f);
		textField_1.setAlignmentY(0.0f);
		textField_1.setMargin(new Insets(1, 1, 1, 0));
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaption);
		textField_2.setBounds(0, 60, 132, 20);
		panel.add(textField_2);
		textField_2.setAutoscrolls(false);
		textField_2.setAlignmentX(0.0f);
		textField_2.setAlignmentY(0.0f);
		textField_2.setMargin(new Insets(1, 0, 1, 0));
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaption);
		textField_3.setBounds(0, 90, 132, 20);
		panel.add(textField_3);
		textField_3.setAutoscrolls(false);
		textField_3.setAlignmentX(0.0f);
		textField_3.setAlignmentY(0.0f);
		textField_3.setMargin(new Insets(1, 0, 1, 0));
		textField_3.setHorizontalAlignment(SwingConstants.LEFT);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.inactiveCaption);
		textField_4.setBounds(0, 120, 132, 20);
		panel.add(textField_4);
		textField_4.setAutoscrolls(false);
		textField_4.setAlignmentX(0.0f);
		textField_4.setAlignmentY(0.0f);
		textField_4.setMargin(new Insets(1, 0, 1, 0));
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(0, 0, 132, 20);
		panel.add(textField);
		textField.setAutoscrolls(false);
		textField.setAlignmentX(0.0f);
		textField.setAlignmentY(0.0f);
		textField.setMargin(new Insets(1, 0, 1, 0));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 160, 150);
		panel_2.add(panel_1);
		panel_1.setBorder(null);
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.setOpaque(false);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("NUMEMPLOYE");
		panel_1.add(lblNewLabel);
		lblNewLabel.setIconTextGap(1);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_1 = new JLabel("NOMEMP");
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setIconTextGap(1);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_2 = new JLabel("PRENOMEMP");
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setIconTextGap(1);
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_2.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_3 = new JLabel("CATEGORIE");
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setIconTextGap(1);
		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_3.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		lblNewLabel_4 = new JLabel("SALAIRE");
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setIconTextGap(1);
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.controlHighlight);
		panel_3.setBounds(10, 11, 360, 440);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		
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
		
		lblNewLabel_9 = new JLabel("TABLE EMPLOYE");
		lblNewLabel_9.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_9.setIconTextGap(1);
		lblNewLabel_9.setHorizontalTextPosition(SwingConstants.LEADING);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setAlignmentX(0.5f);
		lblNewLabel_9.setBounds(30, 11, 306, 22);
		panel_3.add(lblNewLabel_9);
		
		JButton btnNewButton = new JButton("AJOUTER");
		btnNewButton.setBounds(196, 231, 130, 50);
		panel_3.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(124, 124, 124));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBackground(SystemColor.activeCaption);
		btnNewButton_1.setAlignmentX(1.0f);
		btnNewButton_1.setBounds(33, 231, 130, 50);
		panel_3.add(btnNewButton_1);
		
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
		
		 
		DefaultTableModel model1 = new DefaultTableModel(
			    new Object[300][5],
			    new String[] {
			        "1", "2", "3", "4", "5"
			    }
			);
		
    	JTable table = new JTable(model1);
		table.setRowSelectionAllowed(false);
		table.setBounds(378, 11, 664, 440);
		contentPane.add(table);
		
    	int numColumns = 5;
        String[] columnNames = new String[numColumns];
         
        for (int i = 0; i < numColumns; i++) {
             columnNames[i] = String.valueOf(i + 1);
        }
         
        model1.setColumnIdentifiers(columnNames);
         
        model1.setValueAt("NUMEMPLOYE", 0, 0); 
    	model1.setValueAt("NOMEMP", 0, 1);
    	model1.setValueAt("PRENOMEMP", 0, 2); 
    	model1.setValueAt("CATEGORIE", 0, 3); 
    	model1.setValueAt("SALAIRE", 0, 4); 
    	

	}
}
