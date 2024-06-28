/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gradings;

import home.HomeJFrame;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Sithumini
 */
public class GradingsFrame extends javax.swing.JFrame {

    /**
     * Creates new form GradingsFrame
     */
    public GradingsFrame() {
        initComponents();
        loadTable();
    }

    //create a method for load table
    public void loadAllDataIntoTable(List<GradingsBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (GradingsBean bean : list) {
            Vector v = new Vector();
            v.add(bean.getGradingID());
            v.add(bean.getStudentID());
            v.add(bean.getStudentName());
            v.add(bean.getBatch());
            v.add(bean.getClass1());
            v.add(bean.getSubject());
            v.add(bean.getGrade());
            
            dtm.addRow(v);
        }
    }
    
    public void loadTable(){
        //access those method which selecting all data
        GradingsLogic bal = new GradingsLogic();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    //method for clear
    public void clearTextFieldsData() {
        jTextFieldStudentID.setText("");
        jTextFieldStudentName.setText("");
        jTextFieldBatch.setText("");
        jTextFieldClass1.setText("");
        jTextFieldSubject.setText("");
    }
    
    
    //validate method
    public boolean validateGradings(){
        
        String studentID = jTextFieldStudentID.getText();
        String grade = (String) jComboBoxGrade.getSelectedItem();
        
        //validations
        if(studentID.equals("")){
           JOptionPane.showMessageDialog(null, "Please enter the Student ID.");
           return false;
        }
        else if(studentID.length() != 10){
           JOptionPane.showMessageDialog(null, "Please enter an valid Student ID");
           return false;
        }
        else if(grade.equals("")){
           JOptionPane.showMessageDialog(null, "Please select the grade.");
           return false;
        }
        
        return true;
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldStudentID = new javax.swing.JTextField();
        jTextFieldStudentName = new javax.swing.JTextField();
        jTextFieldBatch = new javax.swing.JTextField();
        jTextFieldClass1 = new javax.swing.JTextField();
        jTextFieldSubject = new javax.swing.JTextField();
        jComboBoxGrade = new javax.swing.JComboBox<>();
        jButtonDelete = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButtonsearch1 = new javax.swing.JButton();
        jTextFieldtext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(129, 129, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.PNG"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 100, 70));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ASK Application");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 240, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 100));

        jPanel3.setBackground(new java.awt.Color(129, 129, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1190, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 209));
        jLabel4.setText("Student ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, 30));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 209));
        jLabel5.setText("Student Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 129, 209));
        jLabel6.setText("Batch");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 110, 30));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(129, 129, 209));
        jLabel7.setText("Grade");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 110, 30));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(129, 129, 209));
        jLabel8.setText("Class");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 30));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(129, 129, 209));
        jLabel9.setText("Subject");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 30));

        jTextFieldStudentID.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jTextFieldStudentID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 300, 30));

        jTextFieldStudentName.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jTextFieldStudentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 300, 30));

        jTextFieldBatch.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jTextFieldBatch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 300, 30));

        jTextFieldClass1.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jTextFieldClass1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldClass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 300, 30));

        jTextFieldSubject.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jTextFieldSubject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldSubject, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 300, 30));

        jComboBoxGrade.setFont(new java.awt.Font("Sylfaen", 1, 16)); // NOI18N
        jComboBoxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D" }));
        jComboBoxGrade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(129, 129, 209), 0, true));
        jPanel4.add(jComboBoxGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 300, 30));

        jButtonDelete.setBackground(new java.awt.Color(129, 129, 209));
        jButtonDelete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 100, 40));

        jButtonInsert.setBackground(new java.awt.Color(129, 129, 209));
        jButtonInsert.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInsert.setText("Insert");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 100, 40));

        jButtonUpdate.setBackground(new java.awt.Color(129, 129, 209));
        jButtonUpdate.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 100, 40));

        jButtonClear.setBackground(new java.awt.Color(129, 129, 209));
        jButtonClear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 100, 40));

        jButton1.setBackground(new java.awt.Color(129, 129, 209));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 130, 40));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gradings");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2023-10-23 at 5.00.22 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 550));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 530, 550));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grading ID", "Student ID", "Student Name", "Batch", "Class", "Subject", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 620, 430));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel11.setText("Student ID");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 90, 50));

        jButtonsearch1.setBackground(new java.awt.Color(129, 129, 209));
        jButtonsearch1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonsearch1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsearch1.setText("Search");
        jButtonsearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearch1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonsearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 140, 50));

        jTextFieldtext.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jTextFieldtext.setForeground(new java.awt.Color(129, 129, 209));
        jTextFieldtext.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209), 2));
        jPanel5.add(jTextFieldtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 190, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 620, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 770));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        String studentID = jTextFieldStudentID.getText();
        String studentName = jTextFieldStudentName.getText();
        String batch = jTextFieldBatch.getText();
        String class1 = jTextFieldClass1.getText();
        String subject = jTextFieldSubject.getText();
        String grade = (String) jComboBoxGrade.getSelectedItem();

        GradingsBean bean = new GradingsBean(gradingID, studentID, studentName, batch, class1, subject, grade);
        GradingsLogic bal = new GradingsLogic();
        bal.updateData(bean);
        loadTable();
        clearTextFieldsData();
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed

        if(validateGradings() == true){
        //on clicking insert button can get these text field , combo box values
        String studentID = jTextFieldStudentID.getText();
        String studentName = jTextFieldStudentName.getText();
        String batch = jTextFieldBatch.getText();
        String class1 = jTextFieldClass1.getText();
        String subject = jTextFieldSubject.getText();
        String grade = (String) jComboBoxGrade.getSelectedItem();
        
        //create object from GradingsBean class
        GradingsBean gradingsBean = new GradingsBean(0, studentID, studentName, batch, class1, subject, grade);
        
        //create object from GradingsLogic class
        GradingsLogic gradeObj = new GradingsLogic();
        gradeObj.insert(gradingsBean); //through object we are paassing object to insert method
        loadTable();
        clearTextFieldsData();
        }
        
        

    }//GEN-LAST:event_jButtonInsertActionPerformed
    int gradingID = 0; //global variable 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0) {
            //if haven't selected any record from table
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
            
        }else{
            gradingID = (int) jTable1.getValueAt(row, 0); //get id from table
            GradingsLogic bal = new GradingsLogic();
            GradingsBean bean = bal.returnAllDataToTextFields(gradingID);
            jTextFieldStudentID.setText(bean.getStudentID());
            jTextFieldStudentName.setText(bean.getStudentName());
            jTextFieldBatch.setText(bean.getBatch());
            jTextFieldClass1.setText(bean.getClass1());
            jTextFieldSubject.setText(bean.getSubject());
            jComboBoxGrade.setSelectedItem(bean.getGrade());
        }

    
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        GradingsLogic bal = new GradingsLogic();
        bal.deleteRecord(gradingID);
        loadTable();
        clearTextFieldsData();

        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clearTextFieldsData();

        
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        HomeJFrame homeObj = new HomeJFrame();
        homeObj.show();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonsearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearch1ActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jTextFieldtext.getText()));

        
    }//GEN-LAST:event_jButtonsearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(GradingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GradingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonsearch1;
    private javax.swing.JComboBox<String> jComboBoxGrade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBatch;
    private javax.swing.JTextField jTextFieldClass1;
    private javax.swing.JTextField jTextFieldStudentID;
    private javax.swing.JTextField jTextFieldStudentName;
    private javax.swing.JTextField jTextFieldSubject;
    private javax.swing.JTextField jTextFieldtext;
    // End of variables declaration//GEN-END:variables
}
