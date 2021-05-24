/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.booking.system;

import com.toedter.calendar.JDateChooser;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JInternalFrame;

/**
 *
 * @author I524925
 */
public class AddBusDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddBusDetails
     */
    public AddBusDetails() {
        initComponents();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        choice1.add("UP");  
        choice1.add("DOWN");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bus_numTF = new javax.swing.JTextField();
        bus_sourceTF = new javax.swing.JTextField();
        bus_destTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        timeTF = new javax.swing.JTextField();
        seatTF = new javax.swing.JTextField();
        choice1 = new java.awt.Choice();
        Close = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 0));
        setMaximumSize(new java.awt.Dimension(650, 443));
        setMinimumSize(new java.awt.Dimension(650, 443));
        setPreferredSize(new java.awt.Dimension(650, 443));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("ADD BUS DETAILS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 220, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Bus Number ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Source ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 77, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Destination");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 90, -1));

        bus_numTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bus_numTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bus_numTFActionPerformed(evt);
            }
        });
        getContentPane().add(bus_numTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, -1));

        bus_sourceTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(bus_sourceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 150, -1));

        bus_destTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(bus_destTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 160, -1));

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 106, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 114, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Movement");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Price");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Time");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Seats");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 40, -1));

        priceTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(priceTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 150, -1));

        timeTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(timeTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, 160, -1));

        seatTF.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seatTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatTFActionPerformed(evt);
            }
        });
        getContentPane().add(seatTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 160, -1));

        choice1.setName(""); // NOI18N
        getContentPane().add(choice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 160, 20));

        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 90, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 150, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/booking/system/oleg-laptev-EA7vfFpTJB4-unsplash.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void infoMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    ;
     public void clear() {
        bus_numTF.setText("");
        bus_sourceTF.setText("");
        bus_destTF.setText("");
        priceTF.setText(null);
        seatTF.setText(null);
        jDateChooser1.setDate(null);
        timeTF.setText(null);
        
        
    }
    private void bus_numTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bus_numTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bus_numTFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String bus_num = bus_numTF.getText();
        String bus_source = bus_sourceTF.getText();
        String bus_dest = bus_destTF.getText();
         java.util.Date departDateD= jDateChooser1.getDate();
          //   SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
           //  String departDate = oDateFormat.format(departDateD);
//        java.util.Date departDateD = jDateChooser1.getDate();
       // jDateChooser2.setDateFormatString("yyyy/MM/dd");
        //SimpleDateFormat oDateFormat = new SimpleDateFormat("yyyy/MM/dd");
          
        //String departDate = oDateFormat.format(departDateD);
         System.out.println("Date:"+ departDateD);
        
        String departTime = timeTF.getText();
        
        String price = priceTF.getText();
        String total_seats = seatTF.getText();
                
        String move = (String) choice1.getSelectedItem();

        try {
            Class.forName("org.postgresql.Driver");
            String databaseURL = "jdbc:postgresql://localhost:5432/postgres";
            Connection con = DriverManager.getConnection(databaseURL, "postgres", "admin");
            Statement stat = con.createStatement();

            String selectQuery = "select count(*) from bus_details where bus_num='" + bus_num + "'";

            ResultSet rs = stat.executeQuery(selectQuery);

            if(Integer.parseInt(total_seats) > 30){
            JOptionPane.showMessageDialog(null,"Max Seats: 30");
            }
            System.out.println(rs.next());
            if (rs.next() == true) {
                infoMessage("Hmm.. seems like bus details already exists ! ", " ALert ");
            } else {
                
               
                
                String insertQuery = "insert into bus_details(bus_num, bus_source, bus_dest, \"departDate\", \"departTime\", price, total_seats, move) values('" + bus_num + "','" + bus_source + "','" + bus_dest + "','" + departDateD + "','" + departTime + "','" + price + "','" + total_seats + "','" + move + "')";
                int x = stat.executeUpdate(insertQuery);
                
                
                if(x>0){
                 infoMessage("Bus details successfully added ", " Great work ! :D  ");
                clear();
                
                }
               

 
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clear();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void seatTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatTFActionPerformed

    private void dateDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateDActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
                // TODO add your handling code here:
                clear();
                dispose();
                
                
    }//GEN-LAST:event_CloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JTextField bus_destTF;
    private javax.swing.JTextField bus_numTF;
    private javax.swing.JTextField bus_sourceTF;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField seatTF;
    private javax.swing.JTextField timeTF;
    // End of variables declaration//GEN-END:variables
}