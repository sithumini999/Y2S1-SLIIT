/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package signup;

import java.awt.Toolkit;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithumini
 */
public class SignupFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignupFrame
     */
    public SignupFrame() {
        initComponents();
        //set image icon
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("sg1.png")));
    }

    
    //validate method
    public boolean validateSignup(){
        
        String nic = jTextFieldnic1.getText();
        String email = jTextFieldEmail1.getText();
        String pwd = jPasswordFieldpw1.getText();
        
        //validations
        if(nic.equals("")){
           JOptionPane.showMessageDialog(null, "NIC is mandatory.");
           return false;
        }
        else if(nic.length() != 10){
           JOptionPane.showMessageDialog(null, "Please enter an valid NIC");
           return false;
        }
        else if(email.equals("")){
           JOptionPane.showMessageDialog(null, "Email is mandatory.");
           return false;
        }
        else if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-z0-9]+$",jTextFieldEmail1.getText()))){
           JOptionPane.showMessageDialog(null, "Please enter a valid email.");
           return false;
        }
        else if(pwd.length() < 6){
           JOptionPane.showMessageDialog(null, "Your password should have atleast 6 characters.");
           return false;
        }
        
        return true;
    }
        
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldLastName1 = new javax.swing.JTextField();
        jTextFieldFirstName1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldnic1 = new javax.swing.JTextField();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jPasswordFieldpw1 = new javax.swing.JPasswordField();
        jButtonsign = new javax.swing.JButton();
        jButtonsignback = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(129, 129, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Management System");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.PNG"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 90, 70));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ASK Information");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 220, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 90));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(129, 129, 209));
        jLabel8.setText("Password");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 120, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(129, 129, 209));
        jLabel9.setText("Last Name");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 120, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(129, 129, 209));
        jLabel11.setText("Email");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 120, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(129, 129, 209));
        jLabel12.setText("First Name");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 120, 40));

        jTextFieldLastName1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextFieldLastName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(80, 80, 197)));
        jTextFieldLastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastName1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldLastName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 230, 40));

        jTextFieldFirstName1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextFieldFirstName1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jTextFieldFirstName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstName1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldFirstName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 40));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(129, 129, 209));
        jLabel13.setText("NIC");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 40));

        jTextFieldnic1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextFieldnic1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jTextFieldnic1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnic1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldnic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 230, 40));

        jTextFieldEmail1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextFieldEmail1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jTextFieldEmail1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmail1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 40));

        jTextField9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 230, 40));

        jPasswordFieldpw1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jPasswordFieldpw1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPasswordFieldpw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldpw1ActionPerformed(evt);
            }
        });
        jPanel5.add(jPasswordFieldpw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 230, 40));

        jButtonsign.setBackground(new java.awt.Color(129, 129, 209));
        jButtonsign.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonsign.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsign.setText("SIGN UP");
        jButtonsign.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 209), 2, true));
        jButtonsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsignActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 150, 40));

        jButtonsignback.setBackground(new java.awt.Color(129, 129, 209));
        jButtonsignback.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jButtonsignback.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsignback.setText("BACK");
        jButtonsignback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 209), 2, true));
        jButtonsignback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsignbackActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonsignback, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 150, 40));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sign Up");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 90, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2023-10-23 at 5.00.22 PM.jpeg"))); // NOI18N
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 480));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 560, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 590));

        jPanel4.setBackground(new java.awt.Color(129, 129, 209));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 580, 90));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldLastName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastName1ActionPerformed

    private void jTextFieldFirstName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstName1ActionPerformed

    private void jTextFieldnic1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnic1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnic1ActionPerformed

    private void jTextFieldEmail1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmail1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmail1ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jPasswordFieldpw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldpw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldpw1ActionPerformed

    private void jButtonsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsignActionPerformed
        if(validateSignup() == true){
        //get data from text fields 
        String firstName = jTextFieldFirstName1.getText();
        String lastName = jTextFieldLastName1.getText();
        String nic = jTextFieldnic1.getText();
        String email = jTextFieldEmail1.getText();
        String pwd = jPasswordFieldpw1.getText();
       
       
        //pass these values to constructor in bean class
        Bean beanObj = new Bean(firstName, lastName, nic, email, pwd);
       
        //create bal class object
        Bal balObj = new Bal();
        balObj.insertDataSignup(beanObj);

        }
       
    }//GEN-LAST:event_jButtonsignActionPerformed

    private void jButtonsignbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsignbackActionPerformed
        this.hide();
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();

       
    }//GEN-LAST:event_jButtonsignbackActionPerformed

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
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonsign;
    private javax.swing.JButton jButtonsignback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordFieldpw1;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldFirstName1;
    private javax.swing.JTextField jTextFieldLastName1;
    private javax.swing.JTextField jTextFieldnic1;
    // End of variables declaration//GEN-END:variables
}
