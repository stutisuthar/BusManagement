/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.booking.system;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

/**
 *
 * @author I524925
 */
public class NewMaster extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewMaster
     */
    public NewMaster() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setForeground(new Color(0.18f,0.15f,0.16f,0.4f));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("BentonSans Medium", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "#", "BusID", "Source", "Destination", "Date", "Time", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 604, 180));

        jButton1.setFont(new java.awt.Font("BentonSans Bold", 1, 10)); // NOI18N
        jButton1.setText("VIEW BUS DETAILS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 300, -1, -1));

        jButton2.setFont(new java.awt.Font("BentonSans Bold", 1, 10)); // NOI18N
        jButton2.setText("CLOSE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("BentonSans Book Italic", 1, 18)); // NOI18N
        jLabel1.setText("BUS DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 6, 124, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/booking/system/oli-dale-xjSkI_seiZY-unsplash (1).jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FillTable(jTable1, "select * from bus_details;");
    }

    public void FillTable(JTable table, String Query) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:postgresql://localhost:5432/postgres";
            try ( Connection conn = DriverManager.getConnection(databaseURL, "postgres", "Stuti@12345");  java.sql.Statement stat = conn.createStatement()) {
                
                //To remove previously added rows
                try ( ResultSet rs = stat.executeQuery(Query)) {
                    //To remove previously added rows
                    while (table.getRowCount() > 0) {
                        ((DefaultTableModel) table.getModel()).removeRow(0);
                    }
                    int columns = rs.getMetaData().getColumnCount();
                    while (rs.next()) {
                        Object[] row = new Object[columns];
                        for (int i = 1; i <= columns; i++) {
                            row[i - 1] = rs.getObject(i);
                        }
                        ((DefaultTableModel) table.getModel()).insertRow(rs.getRow() - 1, row);
                    }
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(NewMaster.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
