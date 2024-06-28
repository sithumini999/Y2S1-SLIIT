/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package signup;

import home.HomeJFrame;
import signup.Bal;
import signup.SignupFrame;

/**
 *
 * @author KUSHMI
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1pwd1 = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        jButton2signupbtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(580, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(129, 129, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 450, 100));

        jPanel3.setBackground(new java.awt.Color(129, 129, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.PNG"))); // NOI18N
        jLabel1.setText("For logo");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Management System");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 220, 40));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ASK Information");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 200, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(540, 460));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 209));
        jLabel3.setText("Email");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 30));

        jTextField1username.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jTextField1username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 209), 2, true));
        jTextField1username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1usernameActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField1username, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 250, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 209));
        jLabel4.setText("Password");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 80, 30));

        jPasswordField1pwd1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPasswordField1pwd1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 209), 2, true));
        jPanel4.add(jPasswordField1pwd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 250, 30));

        jButtonlogin.setBackground(new java.awt.Color(129, 129, 209));
        jButtonlogin.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButtonlogin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonlogin.setText("Login");
        jButtonlogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 209), 2, true));
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 110, 40));

        jButton2signupbtn.setBackground(new java.awt.Color(129, 129, 209));
        jButton2signupbtn.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton2signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        jButton2signupbtn.setText("Signup");
        jButton2signupbtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 209), 2, true));
        jButton2signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2signupbtnActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 110, 40));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Log In");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 70, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2023-10-23 at 5.00.22 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 430, 220));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 430, 210));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1usernameActionPerformed

    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
       //get data 
       String email = jTextField1username.getText();
       String pwd = jPasswordField1pwd1.getText();
       
       //create bal class object
       Bal balObj = new Bal();
       boolean b = balObj.checkLogin(email, pwd);

       if(b) {
           HomeJFrame homeObj = new HomeJFrame();
           homeObj.show();
           this.hide();
       } 
    }//GEN-LAST:event_jButtonloginActionPerformed

    private void jButton2signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2signupbtnActionPerformed
        this.hide(); //current frame hides when click on signup button
        SignupFrame signupObj = new SignupFrame();
        signupObj.show();


        
    }//GEN-LAST:event_jButton2signupbtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2signupbtn;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1pwd1;
    private javax.swing.JTextField jTextField1username;
    // End of variables declaration//GEN-END:variables
}