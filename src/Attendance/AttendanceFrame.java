/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Attendance;

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
public class AttendanceFrame extends javax.swing.JFrame {

    /**
     * Creates new form AttendanceFrame
     */
    public AttendanceFrame() {
        initComponents();
        loadTable();
    }

    //create a method for load table
    public void loadAllDataIntoTable(List<AttendanceBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (AttendanceBean bean : list) {
            Vector v = new Vector();
            v.add(bean.getAtID());
            v.add(bean.getStudentID1());
            v.add(bean.getClass3());
            v.add(bean.getYear());
            v.add(bean.getMonth());
            v.add(bean.getDay());
            
            dtm.addRow(v);
        }
    }
    
    public void loadTable(){
        //access those method which selecting all data
        AttendanceBal bal = new AttendanceBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    //method for clear
    public void clearTextFieldsData() {
        jTextFieldsid.setText("");
        jTextFieldclass.setText("");
       
    }
    
    //validate method
    public boolean validateAttendance(){
        
        String studentID1 = jTextFieldsid.getText();
        
        //validations
        if(studentID1.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the Student ID.");
            return false;
        }
        else if(studentID1.length() != 10){
            JOptionPane.showMessageDialog(null, "Please enter an valid Student ID");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonupdate = new javax.swing.JButton();
        jTextFieldclass = new javax.swing.JTextField();
        jTextFieldsid = new javax.swing.JTextField();
        comboboxday = new javax.swing.JComboBox<>();
        jComboBoxyear = new javax.swing.JComboBox<>();
        jComboBoxmonth = new javax.swing.JComboBox<>();
        jButtoninsert = new javax.swing.JButton();
        jButtondelete = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        jButtonsearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(129, 129, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.PNG"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 80));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ASK Information Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 430, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 100));

        jPanel3.setBackground(new java.awt.Color(129, 129, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 1140, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 209));
        jLabel3.setText("Day");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 50, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 209));
        jLabel4.setText("Student ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 110, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 209));
        jLabel5.setText("Class");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 110, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 129, 209));
        jLabel6.setText("Year");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 50, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(129, 129, 209));
        jLabel7.setText("Month");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 60, 40));

        jButtonupdate.setBackground(new java.awt.Color(129, 129, 209));
        jButtonupdate.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonupdate.setText("Update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 120, 40));

        jTextFieldclass.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 300, 40));

        jTextFieldsid.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldsid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 300, 40));

        comboboxday.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        comboboxday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jPanel4.add(comboboxday, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, 30));

        jComboBoxyear.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jComboBoxyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023", "2024", "2025", "2026" }));
        jComboBoxyear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jComboBoxyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        jComboBoxmonth.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jComboBoxmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxmonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jComboBoxmonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, 30));

        jButtoninsert.setBackground(new java.awt.Color(129, 129, 209));
        jButtoninsert.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtoninsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtoninsert.setText("Insert");
        jButtoninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButtoninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 120, 40));

        jButtondelete.setBackground(new java.awt.Color(129, 129, 209));
        jButtondelete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtondelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 120, 40));

        jButtonclear.setBackground(new java.awt.Color(129, 129, 209));
        jButtonclear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 120, 40));

        jButton1.setBackground(new java.awt.Color(129, 129, 209));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 120, 40));

        jLabel9.setBackground(new java.awt.Color(129, 129, 209));
        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Attendance");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -4, 120, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2023-10-23 at 5.00.22 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 460));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 510, 460));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AcID", "Student ID", "Class", "Year", "Month", "Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 600, 350));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField12.setFont(new java.awt.Font("Sylfaen", 0, 12)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(129, 129, 209));
        jTextField12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209), 2));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 200, 40));

        jButtonsearch.setBackground(new java.awt.Color(129, 129, 209));
        jButtonsearch.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonsearch.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsearch.setText("Search");
        jButtonsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearchActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 100, 40));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setText("Student ID");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 100, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 580, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        AttendanceBal bal = new AttendanceBal();
        bal.deleteRecord(atID);
        loadTable();
        clearTextFieldsData();

        
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        String studentID1 = jTextFieldsid.getText();
        String class3 = jTextFieldclass.getText();
        String year =  (String) jComboBoxyear.getSelectedItem();
        String month = (String) jComboBoxmonth.getSelectedItem();
        String day =  (String) comboboxday.getSelectedItem();
        

        AttendanceBean bean = new AttendanceBean(atID, studentID1, class3, year, month, day);
        AttendanceBal bal = new AttendanceBal();
        bal.updateData(bean);
        loadTable();
        clearTextFieldsData();

       
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtoninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertActionPerformed
        if(validateAttendance() == true){
            
        //on clicking insert button can get these text field , combo box values
        String studentID1 = jTextFieldsid.getText();
        String class3 = jTextFieldclass.getText();
        String year =  (String) jComboBoxyear.getSelectedItem();
        String month = (String) jComboBoxmonth.getSelectedItem();
        String day =  (String) comboboxday.getSelectedItem();
        
        //create object from AttendanceBean class
        AttendanceBean attendanceBean = new AttendanceBean(0, studentID1, class3, year, month, day);
        
        //create object from AttendanceBal class
        AttendanceBal attendanceObj = new AttendanceBal();
        attendanceObj.insert(attendanceBean); //through object we are paassing object to insert method
        loadTable();
        clearTextFieldsData();

           
        }
        
    }//GEN-LAST:event_jButtoninsertActionPerformed
    int atID = 0; //global variable 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0) {
            //if haven't selected any record from table
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
            
        }else{
            atID = (int) jTable1.getValueAt(row, 0); //get id from table
            AttendanceBal bal = new AttendanceBal();
            AttendanceBean bean = bal.returnAllDataToTextFields(atID);
            jTextFieldsid.setText(bean.getStudentID1());
            jTextFieldclass.setText(bean.getClass3());
            jComboBoxyear.setSelectedItem(bean.getYear());
            jComboBoxmonth.setSelectedItem(bean.getMonth());
            comboboxday.setSelectedItem(bean.getDay());
        }

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        clearTextFieldsData();

        
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        HomeJFrame homeObj = new HomeJFrame();
        homeObj.show();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearchActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jTextField12.getText()));
        
        
    }//GEN-LAST:event_jButtonsearchActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

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
            java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AttendanceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboboxday;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtoninsert;
    private javax.swing.JButton jButtonsearch;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JComboBox<String> jComboBoxmonth;
    private javax.swing.JComboBox<String> jComboBoxyear;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextFieldclass;
    private javax.swing.JTextField jTextFieldsid;
    // End of variables declaration//GEN-END:variables
}
