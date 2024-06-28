/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teacher;

import dbcon.db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Sithumini
 */
public class TeacherBal {
    //create method for read data
    public List<TeacherBean> loadData(){
        List<TeacherBean> list = new ArrayList<TeacherBean>();
        try {
            //make query select all data from teacher table
            String query = "select * from teacher";
            PreparedStatement ps = db.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int tID = rs.getInt("tid");
                String teacherID = rs.getString("TeacherID");
                String teacherName = rs.getString("Name");
                String email = rs.getString("Email");
                String contact = rs.getString("Contact");
                String address1 = rs.getString("Address");
                String specialization = rs.getString("Specialization");
                
                //create teachersbean object
                TeacherBean bean = new TeacherBean(tID, teacherID, teacherName, email, contact, address1, specialization);
                list.add(bean); //add bean in list
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    
    //create method for insert data
    public void insert(TeacherBean teacherBean){
        //insert code
        try {
            //insert query
            String query = "insert into teacher values (null, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = db.con.prepareStatement(query);
            ps.setString(1, teacherBean.getTeacherID());
            ps.setString(2, teacherBean.getTeacherName());
            ps.setString(3, teacherBean.getEmail());
            ps.setString(4, teacherBean.getContact());
            ps.setString(5, teacherBean.getAddress1());
            ps.setString(6, teacherBean.getSpecialization());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
    }
    
    
     //create method to get data on clickin jtable
        public TeacherBean returnAllDataToTextFields(int tID){
            TeacherBean bean = null;
            try {
                String query = "select * from teacher where tid = "+tID;
                PreparedStatement ps = db.con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    int tIDs = rs.getInt("tid");
                    String teacherID = rs.getString("TeacherID");
                    String teacherName = rs.getString("Name");
                    String email = rs.getString("Email");
                    String contact = rs.getString("Contact");
                    String address1 = rs.getString("Address");
                    String specialization = rs.getString("Specialization");
                    bean = new TeacherBean(tIDs, teacherID, teacherName, email, contact, address1, specialization);

                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, ""+e);
            } 
            return bean;
            
        }
        
        //create method for update
        public void updateData(TeacherBean bean) {
            try {
                String query = "update teacher set TeacherID = ?, Name = ?, Email = ?, Contact = ?, Address = ?, Specialization = ? where tid = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setString(1, bean.getTeacherID());
                ps.setString(2, bean.getTeacherName());
                ps.setString(3, bean.getEmail());
                ps.setString(4, bean.getContact());
                ps.setString(5, bean.getAddress1());
                ps.setString(6, bean.getSpecialization());
                ps.setInt(7, bean.gettID());
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been updated.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
        
        //delete method
        public void deleteRecord(int tID) {
            try{
                String query = "delete from teacher where tid = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setInt(1, tID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been deleted.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
    
}
