/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.booking.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author I524923
 */
public class UserLogon extends javax.swing.JFrame {

    /**
     * Creates new form UserlogonTry
     */
    public UserLogon() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        user_username = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        user_login = new javax.swing.JButton();
        user_reset = new javax.swing.JButton();
        user_password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        user_signUp = new javax.swing.JButton();
        Mainscreen = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 212, 114));

        jLabel6.setText("Username:");

        user_username.setText("Username");
        user_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_usernameActionPerformed(evt);
            }
        });

        jLabel7.setText("Password:");

        user_login.setText("Login");
        user_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_loginActionPerformed(evt);
            }
        });

        user_reset.setText("Reset");
        user_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_resetActionPerformed(evt);
            }
        });

        jLabel1.setText("New User? Sign Up now!");

        user_signUp.setText("Sign Up");
        user_signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_signUpActionPerformed(evt);
            }
        });

        Mainscreen.setText("Mainscreen");
        Mainscreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainscreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user_username, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(user_login, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(user_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(user_password)
                        .addGap(41, 41, 41))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Mainscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(user_signUp)
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(user_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(user_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user_login)
                    .addComponent(user_reset))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(user_signUp))
                .addGap(18, 18, 18)
                .addComponent(Mainscreen)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);
        jPanel4.setBounds(100, 0, 280, 240);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bus/booking/system/JoshuaSong_Unsplash_vancouvertrain.5ff33c5aba7f5.png"))); // NOI18N
        jPanel3.add(jLabel5);
        jLabel5.setBounds(0, 0, 600, 420);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 585, 325));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_loginActionPerformed
        // TODO add your handling code here:
        String username = user_username.getText();
        String password = user_password.getText();
        
        
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseURL = "jdbc:postgresql://localhost:5432/postgres";
            Connection con = DriverManager.getConnection(databaseURL, "postgres", "admin");

            String selectQuery = "select uname,password from new_user where uname='" + username + "' and password='" + password + "'";
            Statement stat = con.createStatement();

            ResultSet rs = stat.executeQuery(selectQuery);

            if (rs.next()) {
                //infoMessage("Welcome ! ", " ALert ");
                dispose();
                UserControlPanel ucp = new UserControlPanel(username);
                ucp.setLocationRelativeTo(null);
                ucp.setVisible(true);
            } else {

                JOptionPane.showMessageDialog(null,"Invalid Credentials");
               

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
    }//GEN-LAST:event_user_loginActionPerformed

    private void user_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_usernameActionPerformed

    private void user_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_resetActionPerformed
            // TODO add your handling code here:
            user_username.setText(null);
            user_password.setText(null);
    }//GEN-LAST:event_user_resetActionPerformed

    private void user_signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_signUpActionPerformed
        // TODO add your handling code here:
        NewUser new_user = new NewUser();
        new_user.setLocationRelativeTo(null);
        new_user.setVisible(true);
    }//GEN-LAST:event_user_signUpActionPerformed

    private void MainscreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainscreenActionPerformed
        // TODO add your handling code here:
        dispose();
        Mainscreen main = new Mainscreen();
        main.setLocationRelativeTo(null);
        main.setVisible(true);
    }//GEN-LAST:event_MainscreenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mainscreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton user_login;
    private javax.swing.JPasswordField user_password;
    private javax.swing.JButton user_reset;
    private javax.swing.JButton user_signUp;
    private javax.swing.JTextField user_username;
    // End of variables declaration//GEN-END:variables
}
