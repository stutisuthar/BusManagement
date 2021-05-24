/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.booking.system;
/**
 *
 * @author I524925
 */
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.io.IOException;
import java.lang.System.Logger.Level;

import java.sql.*;
import java.util.Random;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import static org.postgresql.jdbc.EscapedFunctions.LOG;
public class MasterTable extends javax.swing.JInternalFrame{
        
//{
//    public  MasterTable() {
//       initComponents();
//    }
     public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MasterTable().setVisible(true);
            }
        });
    }private final JButton button;
    private final JTable table;
    private final DefaultTableModel tableModel = new DefaultTableModel();

    public MasterTable() throws HeadlessException {
initComponents();
//load the table value here so it will load everytime we load the page
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        button = new JButton("Load Data");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SwingWorker<Void, Void>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        loadData();
                        return null;
                    }
                }.execute();
            }
        });
        add(button, BorderLayout.PAGE_START);

        setSize(640, 480);
    }

    private void loadData() throws ClassNotFoundException {
//        LOG.info("START loadData method");

        button.setEnabled(false);
Class.forName("com.mysql.cj.jdbc.Driver");
String databaseURL = "jdbc:postgresql://localhost:5432/bus_sys";
        try (Connection conn = DriverManager.getConnection(databaseURL, "postgres", "root");
                Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("select * from master.admin_user");
            ResultSetMetaData metaData = rs.getMetaData();

            // Names of columns
            Vector<String> columnNames = new Vector<String>();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                columnNames.add(metaData.getColumnName(i));
            }

            // Data of the table
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                for (int i = 1; i <= columnCount; i++) {
                    vector.add(rs.getObject(i));
                }
                data.add(vector);
            }

            tableModel.setDataVector(data, columnNames);
        } catch (Exception e) {
           // LOG.log(Level.SEVERE, "Exception in Load Data", e);
        }
        button.setEnabled(true);

       // LOG.info("END loadData method");
    }


    /**
     * Creates new form MasterTable
     */
     
//    public  MasterTable() {
//        initComponents();
//    }
//    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 380, 260));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("BUS MASTER TABLE");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/booking/system/icons8-cloud-refresh-50.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 60, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/booking/system/oleg-laptev-EA7vfFpTJB4-unsplash.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   



    //PUT THIS IN THE INIT CODE
//private void Update_table(){
//    try{
//        // fetch a connection
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String databaseURL = "jdbc:postgresql://localhost:5432/bus_sys";
//        Connection con = DriverManager.getConnection(databaseURL, "postgres", "root");
//
//        
//
//       
//        if (con != null) 
//        {
//            String sql = "select * from master.new_user";
//            Statement pst = con.prepareStatement(sql);
//            
//             ResultSet rs = pst.executeQuery(sql);
//           
//            jTable.setModel(DbUtils.resultSetToTableModel(rs));
//        }
//    }
//    catch(Exception e){
//    JOptionPane.showMessageDialog(null,e);
//    }
//    
//}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
