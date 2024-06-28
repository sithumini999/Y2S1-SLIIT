/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Student;

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
public class StudentFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentFrame
     */
    public StudentFrame() {
        initComponents();
        loadTable();
    }

    //create a method for load table
    public void loadAllDataIntoTable(List<StudentBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (StudentBean bean : list) {
            Vector v = new Vector();
            v.add(bean.getsID());
            v.add(bean.getFirstName());
            v.add(bean.getLastName());
            v.add(bean.getStuID());
            v.add(bean.getGender());
            v.add(bean.getCity());
            v.add(bean.getContactNo());
            v.add(bean.getAddress());
            v.add(bean.getClass2());
            
            dtm.addRow(v);
        }
    }
    
    public void loadTable(){
        //access those method which selecting all data
        StudentBal bal = new StudentBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }
    
    //method for clear
    public void clearTextFieldsData() {
        jTextFieldfirstName.setText("");
        jTextFieldlastName.setText("");
        jTextFieldstuId.setText("");
        jTextFieldcity.setText("");
        jTextFieldcontact.setText("");
        jTextAreaAddress.setText("");
        jTextFieldclass2.setText("");
    }
    
    
    //validate method
    public boolean validateStudent(){
        
        String stuID = jTextFieldstuId.getText();
        String contactNo = jTextFieldcontact.getText();
        
        
        //validations
        if(stuID.equals("")){
           JOptionPane.showMessageDialog(null, "Please enter the Student ID.");
           return false;
        }
        else if(stuID.length() != 10){
           JOptionPane.showMessageDialog(null, "Please enter an valid Student ID");
           return false;
        }
        else if(contactNo.length() != 10){
           JOptionPane.showMessageDialog(null, "Please enter an valid contact number");
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtondelete = new javax.swing.JButton();
        jTextFieldclass2 = new javax.swing.JTextField();
        jComboBoxgender = new javax.swing.JComboBox<>();
        jTextFieldfirstName = new javax.swing.JTextField();
        jTextFieldlastName = new javax.swing.JTextField();
        jTextFieldstuId = new javax.swing.JTextField();
        jTextFieldcity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAddress = new javax.swing.JTextArea();
        jTextFieldcontact = new javax.swing.JTextField();
        jButtoninsert = new javax.swing.JButton();
        jButtonupdate = new javax.swing.JButton();
        jButtonclear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton2search3 = new javax.swing.JButton();
        jTextFieldtext2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(129, 129, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.PNG"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 110, 80));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ASK Information Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 440, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 100));

        jPanel3.setBackground(new java.awt.Color(129, 129, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 800, 1530, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 209));
        jLabel3.setText("Class");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 120, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 209));
        jLabel4.setText("First Name");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 209));
        jLabel5.setText("Last Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 129, 209));
        jLabel6.setText("Student ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(129, 129, 209));
        jLabel7.setText("Gender");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(129, 129, 209));
        jLabel8.setText("City");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, 40));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(129, 129, 209));
        jLabel9.setText("Contact No.");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 40));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(129, 129, 209));
        jLabel10.setText("Address");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 120, 40));

        jButtondelete.setBackground(new java.awt.Color(129, 129, 209));
        jButtondelete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtondelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtondelete.setText("Delete");
        jButtondelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtondeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtondelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 110, 40));

        jTextFieldclass2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldclass2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldclass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 340, 30));

        jComboBoxgender.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jComboBoxgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        jComboBoxgender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jComboBoxgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 120, 30));

        jTextFieldfirstName.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldfirstName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jTextFieldfirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfirstNameActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldfirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 340, 30));

        jTextFieldlastName.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldlastName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jTextFieldlastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldlastNameActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldlastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 340, 30));

        jTextFieldstuId.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldstuId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldstuId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 340, 30));

        jTextFieldcity.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldcity.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 340, 30));

        jTextAreaAddress.setColumns(20);
        jTextAreaAddress.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextAreaAddress.setRows(5);
        jTextAreaAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jScrollPane1.setViewportView(jTextAreaAddress);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 340, 70));

        jTextFieldcontact.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldcontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 340, 30));

        jButtoninsert.setBackground(new java.awt.Color(129, 129, 209));
        jButtoninsert.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtoninsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtoninsert.setText("Insert");
        jButtoninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoninsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButtoninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, 110, 40));

        jButtonupdate.setBackground(new java.awt.Color(129, 129, 209));
        jButtonupdate.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonupdate.setText("Update");
        jButtonupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonupdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 110, 40));

        jButtonclear.setBackground(new java.awt.Color(129, 129, 209));
        jButtonclear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonclear.setText("Clear");
        jButtonclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonclearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, 110, 40));

        jButton1.setBackground(new java.awt.Color(129, 129, 209));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 620, 90, 40));

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student Info");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2023-10-23 at 5.00.22 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 540, 670));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 540, 680));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sid", "First Name", "Last Name", "Student ID", "Gender", "City", "Contact No", "Address", "Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 950, 570));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel13.setText("Student ID");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 110, 30));

        jButton2search3.setBackground(new java.awt.Color(129, 129, 209));
        jButton2search3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton2search3.setForeground(new java.awt.Color(255, 255, 255));
        jButton2search3.setText("Search");
        jButton2search3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2search3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 130, 50));

        jTextFieldtext2.setForeground(new java.awt.Color(129, 129, 209));
        jTextFieldtext2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209), 2));
        jPanel5.add(jTextFieldtext2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, 240, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 850, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1530, 900));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldfirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfirstNameActionPerformed

    private void jTextFieldlastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldlastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldlastNameActionPerformed

    private void jButtondeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtondeleteActionPerformed
        StudentBal bal = new StudentBal();
        bal.deleteRecord(sID);
        loadTable();
        clearTextFieldsData();


        
    }//GEN-LAST:event_jButtondeleteActionPerformed

    private void jButtonupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonupdateActionPerformed
        String firstName = jTextFieldfirstName.getText();
        String lastName = jTextFieldlastName.getText();
        String stuID = jTextFieldstuId.getText();
        String gender = (String) jComboBoxgender.getSelectedItem();
        String city = jTextFieldcity.getText();
        String contactNo = jTextFieldcontact.getText();
        String address = jTextAreaAddress.getText();
        String class2 = jTextFieldclass2.getText();

        StudentBean bean = new StudentBean(sID, firstName, lastName, stuID, gender, city, contactNo, address, class2);
        StudentBal bal = new StudentBal();
        bal.updateData(bean);
        loadTable();
        clearTextFieldsData();

        
    }//GEN-LAST:event_jButtonupdateActionPerformed

    private void jButtonclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonclearActionPerformed
        clearTextFieldsData();
        
    }//GEN-LAST:event_jButtonclearActionPerformed

    private void jButtoninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoninsertActionPerformed
        if(validateStudent() == true){
        //on clicking insert button can get these text field , combo box values
        String firstName = jTextFieldfirstName.getText();
        String lastName = jTextFieldlastName.getText();
        String stuID = jTextFieldstuId.getText();
        String gender = (String) jComboBoxgender.getSelectedItem();
        String city = jTextFieldcity.getText();
        String contactNo = jTextFieldcontact.getText();
        String address = jTextAreaAddress.getText();
        String class2 = jTextFieldclass2.getText();
        
        //create object from StudentBean class
        StudentBean studentBean = new StudentBean(0, firstName, lastName, stuID, gender, city, contactNo, address, class2);
        
        //create object from StudentBal class
        StudentBal studentObj = new StudentBal();
        studentObj.insert(studentBean); //through object we are paassing object to insert method
        loadTable();
        clearTextFieldsData();
        }

        
    }//GEN-LAST:event_jButtoninsertActionPerformed
    int sID = 0; //global variable 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0) {
            //if haven't selected any record from table
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
            
        }else{
            sID = (int) jTable1.getValueAt(row, 0); //get id from table
            StudentBal bal = new StudentBal();
            StudentBean bean = bal.returnAllDataToTextFields(sID);
            jTextFieldfirstName.setText(bean.getFirstName());
            jTextFieldlastName.setText(bean.getLastName());
            jTextFieldstuId.setText(bean.getStuID());
            jComboBoxgender.setSelectedItem(bean.getGender());
            jTextFieldcity.setText(bean.getCity());
            jTextFieldcontact.setText(bean.getContactNo());
            jTextAreaAddress.setText(bean.getAddress());
            jTextFieldclass2.setText(bean.getClass2());       
        }


        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        HomeJFrame homeObj = new HomeJFrame();
        homeObj.show();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2search3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2search3ActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jTextFieldtext2.getText()));

        
    }//GEN-LAST:event_jButton2search3ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2search3;
    private javax.swing.JButton jButtonclear;
    private javax.swing.JButton jButtondelete;
    private javax.swing.JButton jButtoninsert;
    private javax.swing.JButton jButtonupdate;
    private javax.swing.JComboBox<String> jComboBoxgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreaAddress;
    private javax.swing.JTextField jTextFieldcity;
    private javax.swing.JTextField jTextFieldclass2;
    private javax.swing.JTextField jTextFieldcontact;
    private javax.swing.JTextField jTextFieldfirstName;
    private javax.swing.JTextField jTextFieldlastName;
    private javax.swing.JTextField jTextFieldstuId;
    private javax.swing.JTextField jTextFieldtext2;
    // End of variables declaration//GEN-END:variables
}
