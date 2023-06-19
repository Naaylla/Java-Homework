package DBAINTERVENTION;



import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.border.BevelBorder;

public class DBAINTERVENTIONTasks extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DBAINTERVENTIONTasks frame = new DBAINTERVENTIONTasks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public DBAINTERVENTIONTasks() {
		setTitle("DBI/Tasks");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lenovo\\Desktop\\1077114.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.setBackground(SystemColor.menu);
		setSize(1068, 502);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("TÂCHE 2");
		btnNewButton.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(192, 192, 192), new Color(192, 192, 192)));
		btnNewButton.setPreferredSize(new Dimension(200, 80));
		btnNewButton.setMargin(new Insets(30, 30, 30, 30));
		btnNewButton.setBounds(426, 282, 200, 80);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Action performed when the button is clicked
		    	   DBAINTERVENTIONFrame2 frame = new DBAINTERVENTIONFrame2();
		    	   frame.setVisible(true);
		    }
		});
		
		contentPane.setLayout(null);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(124, 124, 124));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TÂCHE 1");
		btnNewButton_1.setPreferredSize(new Dimension(200, 80));
		btnNewButton_1.setMargin(new Insets(30, 30, 30, 30));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(255, 255, 255), new Color(192, 192, 192), new Color(192, 192, 192)));
		btnNewButton_1.setBackground(new Color(124, 124, 124));
		btnNewButton_1.setBounds(426, 101, 200, 80);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Open the DBAINTERVENTIONFrame
		        DBAINTERVENTIONFrame frame = new DBAINTERVENTIONFrame();
		        frame.setVisible(true);
		    }
		});
	}
}
