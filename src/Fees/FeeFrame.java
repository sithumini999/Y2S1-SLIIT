/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Fees;

import home.HomeJFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithumini
 */
public class FeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form FeeFrame
     */
    public FeeFrame() {
        initComponents();
    }
    
    //displayfee method
    public void displayFee() {
        if(jComboBoxgrade.getSelectedItem().equals("Grade 6")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.3500.00\n End Term Fee = Rs.1000\n Mid Term Fee = Rs.1000.00\n Monthly Fee = Rs.1350\n Sports Fee = Rs1000.00\n");
        }
        else if(jComboBoxgrade.getSelectedItem().equals("Grade 7")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.4500.00\n End Term Fee = Rs.2000\n Mid Term Fee = Rs.2000.00\n Monthly Fee = Rs.2350\n Sports Fee = Rs2000.00\n");
        }
        else if(jComboBoxgrade.getSelectedItem().equals("Grade 8")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.4500.00\n End Term Fee = Rs.2000\n Mid Term Fee = Rs.2000.00\n Monthly Fee = Rs.2350\n Sports Fee = Rs2000.00\n");
        }
        else if(jComboBoxgrade.getSelectedItem().equals("Grade 9")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.5500.00\n End Term Fee = Rs.3000\n Mid Term Fee = Rs.3000.00\n Monthly Fee = Rs.3350\n Sports Fee = Rs3000.00\n");
        }
        else if(jComboBoxgrade.getSelectedItem().equals("Grade 10")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.5500.00\n End Term Fee = Rs.3000\n Mid Term Fee = Rs.3000.00\n Monthly Fee = Rs.3350\n Sports Fee = Rs3000.00\n");
        }
        else if(jComboBoxgrade.getSelectedItem().equals("Grade 11")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.5500.00\n End Term Fee = Rs.3000\n Mid Term Fee = Rs.3000.00\n Monthly Fee = Rs.3350\n Sports Fee = Rs3000.00\n");
        }
        else if(jComboBoxgrade.getSelectedItem().equals("Grade 12")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.6500.00\n End Term Fee = Rs.4000\n Mid Term Fee = Rs.4000.00\n Monthly Fee = Rs.4350\n Sports Fee = Rs4000.00\n");
        }
        else if(jComboBoxgrade.getSelectedItem().equals("Grade 13")){
            JOptionPane.showMessageDialog(null, "Admission fee = Rs.6500.00\n End Term Fee = Rs.4000\n Mid Term Fee = Rs.4000.00\n Monthly Fee = Rs.4350\n Sports Fee = Rs4000.00\n");
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxgrade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jButtonok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(129, 129, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.PNG"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 80));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ASK Information Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 440, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 100));

        jPanel3.setBackground(new java.awt.Color(129, 129, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 620, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 209));
        jLabel3.setText("Class");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 209));
        jLabel4.setText("2023");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 110, 50));

        jComboBoxgrade.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jComboBoxgrade.setForeground(new java.awt.Color(129, 129, 209));
        jComboBoxgrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 6", "Grade 7", "Grade 8", "Grade 9", "Grade 10", "Grade 11", "Grade 12", "Grade 13" }));
        jComboBoxgrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jComboBoxgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 150, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 209));
        jLabel5.setText("Year");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, 50));

        jButtonok.setBackground(new java.awt.Color(129, 129, 209));
        jButtonok.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonok.setForeground(new java.awt.Color(255, 255, 255));
        jButtonok.setText("OK");
        jButtonok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonokActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonok, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, 50));

        jButton1.setBackground(new java.awt.Color(129, 129, 209));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 150, 50));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fees");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2023-10-23 at 5.00.22 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 620, 340));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 600, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonokActionPerformed
        
        displayFee();
    }//GEN-LAST:event_jButtonokActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        HomeJFrame homeObj = new HomeJFrame();
        homeObj.show();

        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(FeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonok;
    private javax.swing.JComboBox<String> jComboBoxgrade;
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
    // End of variables declaration//GEN-END:variables
}
