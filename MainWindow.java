import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import DBAINTERVENTION.DBAINTERVENTIONTasks;
import EMPLOYESDBA.EmployesDBATasks;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class MainWindow extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField ID_field;
    private JTextField Password_field;
    private final Action action = new SwingAction();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainWindow() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";  // JDBC URL for the Oracle database
		String user = "system";  // Your Oracle database username
		String password = "ldABCs_2323kllds";  // Your Oracle database password
		
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lenovo\\Desktop\\1077114.png"));
        setForeground(Color.BLACK);
        setFont(new Font("Arial Black", Font.PLAIN, 12));
        setTitle("User Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setAutoscrolls(true);
        contentPane.setBackground(Color.GRAY);
        contentPane.setBorder(null);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setSize(1068, 502);

        JPanel panel = new JPanel();
        panel.setBounds(316, 101, 420, 261);
        panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(188, 188, 188), new Color(128, 128, 128),
        new Color(116, 116, 116), new Color(102, 102, 102)));
        panel.setBackground(new Color(206, 206, 206));
        contentPane.add(panel);
        panel.setLayout(null);

        ID_field = new JTextField();
        ID_field.setBounds(123, 62, 173, 30);
        panel.add(ID_field);
        ID_field.setColumns(10);

        Password_field = new JTextField();
        Password_field.setBounds(123, 106, 173, 30);
        Password_field.setColumns(10);
        panel.add(Password_field);

        JLabel ID_label = new JLabel("User ID");
        ID_label.setBounds(36, 69, 77, 14);
        ID_label.setForeground(new Color(29, 29, 27));
        ID_label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(ID_label);
        
        JLabel Password_label = new JLabel("Password");
        Password_label.setBounds(36, 113, 77, 14);
        Password_label.setForeground(new Color(29, 29, 27));
        Password_label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        panel.add(Password_label);

        JButton btnNewButton = new JButton("LOGIN");
        btnNewButton.setBounds(155, 169, 109, 36);
        btnNewButton.setAction(action);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(124, 124, 124));
        panel.add(btnNewButton);
    }
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "LOGIN");
		}
		public void actionPerformed(ActionEvent e) {
			String Password = Password_field.getText();
			String name = ID_field.getText();
			//CONNECT TO DATA BASE USER
			
			
			try {
			    // Set the database connection properties
			    Properties props = new Properties();
			    props.setProperty("user", name);
			    props.setProperty("password", Password);

			    // Establish the database connection
			    Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", props);

			    // Use the connection for database operations

			    // Close the connection when done
			    connection.close();

			} catch (SQLException ex) {
			    ex.printStackTrace();
			}

			
			
			if(Password.equals("123") && name.equals("DBAINTERVENTION"))
			{	
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Connecté avec succès à DBAINTERVENTION.");
				DBAINTERVENTIONTasks Secondwindow = new DBAINTERVENTIONTasks();
				Secondwindow.setVisible(true);
			//CONNECT TO DATA BASE USER
			} else if(Password.equals("123") && name.equals("EmployesDBA"))
			{	
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "Connecté avec succès à EmployesDBA.");
				EmployesDBATasks Secondwindow = new EmployesDBATasks();
				Secondwindow.setVisible(true);
			}
			else
			{
				Component frame = null;
				JOptionPane.showMessageDialog(frame, "ID ou mot de passe invalide.");
			}
		}

	}
}
