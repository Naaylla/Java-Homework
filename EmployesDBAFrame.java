package EMPLOYESDBA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class EmployesDBAFrame extends JFrame {

    private JLabel lblNumEmploye;
    private JTextField textFieldNumEmploye;
    private JButton btnConsulter;
    private JTable tableResult;
    private DefaultTableModel tableModel;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmployesDBAFrame frame = new EmployesDBAFrame();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public EmployesDBAFrame() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\lenovo\\Desktop\\1077114.png"));
        setTitle("EmployesDBA/tasks/task1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLocationRelativeTo(null);

        JPanel contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        contentPane.add(inputPanel, BorderLayout.NORTH);

        lblNumEmploye = new JLabel("NUMERO EMPLOYE");
        lblNumEmploye.setFont(new Font("Tahoma", Font.PLAIN, 20));
        inputPanel.add(lblNumEmploye);

        textFieldNumEmploye = new JTextField(10);
        textFieldNumEmploye.setMargin(new Insets(5, 5, 5, 5));
        textFieldNumEmploye.setPreferredSize(new Dimension(textFieldNumEmploye.getPreferredSize().width, 30));
        inputPanel.add(textFieldNumEmploye);

        btnConsulter = new JButton("CONSULTER");
        btnConsulter.setHorizontalTextPosition(SwingConstants.CENTER);
        btnConsulter.setMargin(new Insets(5, 5, 5, 5));
        btnConsulter.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnConsulter.setForeground(new Color(255, 255, 255));
        btnConsulter.setBackground(new Color(124, 124, 124));
        btnConsulter.setBounds(105, 0, 96, 50);
        inputPanel.add(btnConsulter);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Employe Info");
        tableModel.addColumn("Intervenant Info");

        tableResult = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(tableResult);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        btnConsulter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String numEmploye = textFieldNumEmploye.getText().trim();
                if (!numEmploye.isEmpty()) {
                    // Database connection and query execution
                    // Replace with your own database connection code
                    // try {
                    //     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
                    //     Statement stmt = conn.createStatement();
                    //     String employesQuery = "SELECT * FROM Employes WHERE numEmploye = " + numEmploye;
                    //     ResultSet employesResultSet = stmt.executeQuery(employesQuery);

                    //     String intervenantsQuery = "SELECT * FROM Intervenants WHERE numEmploye = " + numEmploye;
                    //     ResultSet intervenantsResultSet = stmt.executeQuery(intervenantsQuery);

                    //     // Clear previous data in the table
                    //     tableModel.setRowCount(0);

                    //     // Display the results in the table
                    //     if (employesResultSet.next() && intervenantsResultSet.next()) {
                    //         Object[] employeRow = {
                    //                 "Numéro Employé: " + employesResultSet.getInt("numEmploye") +
                    //                 "\nNom : " + employesResultSet.getString("nomEmp") +
                    //                 "\nPrénom : " + employesResultSet.getString("prenomEmp") +
                    //                 "\nCategorie : " + employesResultSet.getString("categorie") +
                    //                 "\nSalaire : " + employesResultSet.getDouble("salaire")
                    //         };
                    //         tableModel.addRow(employeRow);

                    //         Object[] intervenantRow = {
                    //                 "Numéro Intervenant: " + intervenantsResultSet.getInt("numIntervention") +
                    //                 "\nDate Début: " + intervenantsResultSet.getDate("dateDebut") +
                    //                 "\nDate Fin: " + intervenantsResultSet.getDate("dateFin")
                    //         };
                    //         tableModel.addRow(intervenantRow);
                    //     } else {
                    //         tableModel.addRow(new Object[]{"Aucun employé trouvé avec ce numéro."});
                    //     }

                    //     employesResultSet.close();
                    //     intervenantsResultSet.close();
                    //     stmt.close();
                    //     conn.close();
                    // } catch (SQLException ex) {
                    //     ex.printStackTrace();
                    // }

                }
            }
        });
    }
}

