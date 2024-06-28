/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Teacher;

import home.HomeJFrame;
import java.util.List;
import java.util.Vector;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author Sithumini
 */
public class TeacherFrame extends javax.swing.JFrame {

    /**
     * Creates new form TeacherFrame
     */
    public TeacherFrame() {
        initComponents();
        loadTable();
    }
    
    //create a method for load table
    public void loadAllDataIntoTable(List<TeacherBean> list){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        
        for (TeacherBean bean : list) {
            Vector v = new Vector();
            v.add(bean.gettID());
            v.add(bean.getTeacherID());
            v.add(bean.getTeacherName());
            v.add(bean.getEmail());
            v.add(bean.getContact());
            v.add(bean.getAddress1());
            v.add(bean.getSpecialization());
            
            dtm.addRow(v);
        }
    }
    
    public void loadTable(){
        //access those method which selecting all data
        TeacherBal bal = new TeacherBal();
        List list = bal.loadData();
        loadAllDataIntoTable(list);
    }

    //method for clear
    public void clearTextFieldsData() {
        jTextFieldtid.setText("");
        jTextFieldtname.setText("");
        jTextFieldtemail.setText("");
        jTextFieldtcontact.setText("");
        jTextAreataddress.setText("");
        jTextFieldtspecial.setText("");
    }
    
    
    //validate method
    public boolean validateTeacher(){
        
        String teacherID = jTextFieldtid.getText();
        String email = jTextFieldtemail.getText();
        String contact = jTextFieldtcontact.getText();
        
        //validations
        if(teacherID.equals("")){
           JOptionPane.showMessageDialog(null, "Please enter the Teacher ID.");
           return false;
        }
        else if(teacherID.length() != 10){
           JOptionPane.showMessageDialog(null, "Please enter an valid Teacher ID");
           return false;
        }
        else if(email.equals("")){
           JOptionPane.showMessageDialog(null, "Email is mandatory.");
           return false;
        }
        else if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-z0-9]+$",jTextFieldtemail.getText()))){
           JOptionPane.showMessageDialog(null, "Please enter a valid email.");
           return false;
        }
        else if(contact.length() != 10){
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
        jTextFieldtspecial = new javax.swing.JTextField();
        jTextFieldtid = new javax.swing.JTextField();
        jTextFieldtname = new javax.swing.JTextField();
        jTextFieldtemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreataddress = new javax.swing.JTextArea();
        jTextFieldtcontact = new javax.swing.JTextField();
        jButtontdelete = new javax.swing.JButton();
        jButtontinsert = new javax.swing.JButton();
        jButtontupdate = new javax.swing.JButton();
        jButtontclear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButtonsearch6 = new javax.swing.JButton();
        jTextFieldtext4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(129, 129, 209));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.PNG"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 70));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ASK Information Management System");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 460, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 110));

        jPanel3.setBackground(new java.awt.Color(129, 129, 209));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 1040, 110));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(129, 129, 209));
        jLabel3.setText("Specialization");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 40));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 129, 209));
        jLabel4.setText("Teacher ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, 40));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(129, 129, 209));
        jLabel5.setText("Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 100, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 129, 209));
        jLabel6.setText("Email");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 40));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(129, 129, 209));
        jLabel7.setText("Contact");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 40));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(129, 129, 209));
        jLabel8.setText("Address");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 40));

        jTextFieldtspecial.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldtspecial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldtspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 260, 30));

        jTextFieldtid.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldtid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 260, 30));

        jTextFieldtname.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldtname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 260, 30));

        jTextFieldtemail.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldtemail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 260, 30));

        jTextAreataddress.setColumns(20);
        jTextAreataddress.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextAreataddress.setRows(5);
        jScrollPane1.setViewportView(jTextAreataddress);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 260, 80));

        jTextFieldtcontact.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jTextFieldtcontact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209)));
        jPanel4.add(jTextFieldtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 260, 30));

        jButtontdelete.setBackground(new java.awt.Color(129, 129, 209));
        jButtontdelete.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtontdelete.setForeground(new java.awt.Color(255, 255, 255));
        jButtontdelete.setText("Delete");
        jButtontdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontdeleteActionPerformed(evt);
            }
        });
        jPanel4.add(jButtontdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 40));

        jButtontinsert.setBackground(new java.awt.Color(129, 129, 209));
        jButtontinsert.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtontinsert.setForeground(new java.awt.Color(255, 255, 255));
        jButtontinsert.setText("Insert");
        jButtontinsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontinsertActionPerformed(evt);
            }
        });
        jPanel4.add(jButtontinsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 100, 40));

        jButtontupdate.setBackground(new java.awt.Color(129, 129, 209));
        jButtontupdate.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtontupdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtontupdate.setText("Update");
        jButtontupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontupdateActionPerformed(evt);
            }
        });
        jPanel4.add(jButtontupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 100, 40));

        jButtontclear.setBackground(new java.awt.Color(129, 129, 209));
        jButtontclear.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtontclear.setForeground(new java.awt.Color(255, 255, 255));
        jButtontclear.setText("Clear");
        jButtontclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtontclearActionPerformed(evt);
            }
        });
        jPanel4.add(jButtontclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, 100, 40));

        jButton1.setBackground(new java.awt.Color(129, 129, 209));
        jButton1.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 100, 40));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Teacher Info");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 50));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/WhatsApp Image 2023-10-23 at 5.00.22 PM.jpeg"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -4, 450, 570));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 470, 580));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tid", "Teacher ID", "Name", "Email", "Contact", "Address", "Specialization"
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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 540, 470));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel11.setText("Teacher ID");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 35, -1, 30));

        jButtonsearch6.setBackground(new java.awt.Color(129, 129, 209));
        jButtonsearch6.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jButtonsearch6.setForeground(new java.awt.Color(255, 255, 255));
        jButtonsearch6.setText("Search");
        jButtonsearch6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsearch6ActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonsearch6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 110, -1));

        jTextFieldtext4.setForeground(new java.awt.Color(129, 129, 209));
        jTextFieldtext4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(129, 129, 209), 2));
        jTextFieldtext4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtext4ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldtext4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 180, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 540, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 820));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtontclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontclearActionPerformed
        clearTextFieldsData();

    }//GEN-LAST:event_jButtontclearActionPerformed

    private void jButtontdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontdeleteActionPerformed
        TeacherBal bal = new TeacherBal();
        bal.deleteRecord(tID);
        loadTable();
        clearTextFieldsData();

       
    }//GEN-LAST:event_jButtontdeleteActionPerformed

    private void jButtontupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontupdateActionPerformed
        String teacherID = jTextFieldtid.getText();
        String teacherName = jTextFieldtname.getText();
        String email = jTextFieldtemail.getText();
        String contact = jTextFieldtcontact.getText();
        String address1 = jTextAreataddress.getText();
        String specialization = jTextFieldtspecial.getText();

        TeacherBean bean = new TeacherBean(tID, teacherID, teacherName, email, contact, address1, specialization);
        TeacherBal bal = new TeacherBal();
        bal.updateData(bean);
        loadTable();
        clearTextFieldsData();

        
    }//GEN-LAST:event_jButtontupdateActionPerformed

    private void jButtontinsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtontinsertActionPerformed
        if(validateTeacher() == true){
            
        //on clicking insert button can get these text field , combo box values
        String teacherID = jTextFieldtid.getText();
        String teacherName = jTextFieldtname.getText();
        String email = jTextFieldtemail.getText();
        String contact = jTextFieldtcontact.getText();
        String address1 = jTextAreataddress.getText();
        String specialization = jTextFieldtspecial.getText();
        
        //create object from TeacherBean class
        TeacherBean teacherBean = new TeacherBean(0, teacherID, teacherName, email, contact, address1, specialization);
        
        //create object from TeacherBal class
        TeacherBal teacherObj = new TeacherBal();
        teacherObj.insert(teacherBean); //through object we are paassing object to insert method
        loadTable();
        clearTextFieldsData();

        }
        
    }//GEN-LAST:event_jButtontinsertActionPerformed
    int tID = 0; //global variable 
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0) {
            //if haven't selected any record from table
            JOptionPane.showMessageDialog(null, "Please select any record from table for update or delete");
            
        }else{
            tID = (int) jTable1.getValueAt(row, 0); //get id from table
            TeacherBal bal = new TeacherBal();
            TeacherBean bean = bal.returnAllDataToTextFields(tID);
            jTextFieldtid.setText(bean.getTeacherID());
            jTextFieldtname.setText(bean.getTeacherName());
            jTextFieldtemail.setText(bean.getEmail());
            jTextFieldtcontact.setText(bean.getContact());
            jTextAreataddress.setText(bean.getAddress1());
            jTextFieldtspecial.setText(bean.getSpecialization());
        }

        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        HomeJFrame homeObj = new HomeJFrame();
        homeObj.show();

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldtext4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtext4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtext4ActionPerformed

    private void jButtonsearch6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsearch6ActionPerformed
        DefaultTableModel ob = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(ob);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(jTextFieldtext4.getText()));
          
        
    }//GEN-LAST:event_jButtonsearch6ActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonsearch6;
    private javax.swing.JButton jButtontclear;
    private javax.swing.JButton jButtontdelete;
    private javax.swing.JButton jButtontinsert;
    private javax.swing.JButton jButtontupdate;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextAreataddress;
    private javax.swing.JTextField jTextFieldtcontact;
    private javax.swing.JTextField jTextFieldtemail;
    private javax.swing.JTextField jTextFieldtext4;
    private javax.swing.JTextField jTextFieldtid;
    private javax.swing.JTextField jTextFieldtname;
    private javax.swing.JTextField jTextFieldtspecial;
    // End of variables declaration//GEN-END:variables
}
