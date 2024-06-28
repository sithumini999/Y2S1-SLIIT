/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gradings;

import dbcon.db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author Sithumini
 */
public class GradingsLogic {
    //create method for read data
    public List<GradingsBean> loadData(){
        List<GradingsBean> list = new ArrayList<GradingsBean>();
        try {
            //make query select all data from Gradings table
            String query = "select * from gradings";
            PreparedStatement ps = db.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int gradingID = rs.getInt("GradingId");
                String studentID = rs.getString("StudentID");
                String studentName = rs.getString("StudentName");
                String batch = rs.getString("Batch");
                String class1 = rs.getString("Class");
                String subject = rs.getString("Subject");
                String grade = rs.getString("Grade");
                
                //create gradingsbean object
                GradingsBean bean = new GradingsBean(gradingID, studentID, studentName, batch, class1, subject, grade);
                list.add(bean); //add bean in list
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    
    
    //create method for insert data
    public void insert(GradingsBean gradingsBean){
        //insert code
        try {
            //insert query
            String query = "insert into gradings values (null, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = db.con.prepareStatement(query);
            ps.setString(1, gradingsBean.getStudentID());
            ps.setString(2, gradingsBean.getStudentName());
            ps.setString(3, gradingsBean.getBatch());
            ps.setString(4, gradingsBean.getClass1());
            ps.setString(5, gradingsBean.getSubject());
            ps.setString(6, gradingsBean.getGrade());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
    }
        
        
        //create method to get data on clickin jtable
        public GradingsBean returnAllDataToTextFields(int gradingID){
            GradingsBean bean = null;
            try {
                String query = "select * from gradings where GradingId = "+gradingID;
                PreparedStatement ps = db.con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    int gradingIDs = rs.getInt("GradingId");
                    String studentID = rs.getString("StudentID");
                    String studentName = rs.getString("StudentName");
                    String batch = rs.getString("Batch");
                    String class1 = rs.getString("Class");
                    String subject = rs.getString("Subject");
                    String grade = rs.getString("Grade");
                    bean = new GradingsBean(gradingIDs, studentID, studentName, batch, class1, subject, grade);

                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, ""+e);
            } 
            return bean;
            
        }
        
        //create method for update
        public void updateData(GradingsBean bean) {
            try {
                String query = "update gradings set StudentID = ?, StudentName = ?, Batch = ?, Class = ?, Subject = ?, Grade = ? where GradingId = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setString(1, bean.getStudentID());
                ps.setString(2, bean.getStudentName());
                ps.setString(3, bean.getBatch());
                ps.setString(4, bean.getClass1());
                ps.setString(5, bean.getSubject());
                ps.setString(6, bean.getGrade());
                ps.setInt(7, bean.getGradingID());
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been updated.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
        
        //delete method
        public void deleteRecord(int gradingID) {
            try{
                String query = "delete from gradings where GradingId = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setInt(1, gradingID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been deleted.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
       
    
    }
