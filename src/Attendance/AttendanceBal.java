/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Attendance;

import dbcon.db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Sithumini
 */
public class AttendanceBal {
    //create method for read data
    public List<AttendanceBean> loadData(){
        List<AttendanceBean> list = new ArrayList<AttendanceBean>();
        try {
            //make query select all data from attendance table
            String query = "select * from attendance";
            PreparedStatement ps = db.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int atID = rs.getInt("aID");
                String studentID1 = rs.getString("StudentID");
                String class3 = rs.getString("Class");
                String year = rs.getString("Year");
                String month = rs.getString("Month");
                String day = rs.getString("Day");
                
                //create attendancebean object
                AttendanceBean bean = new AttendanceBean(atID, studentID1, class3, year, month, day);
                list.add(bean); //add bean in list
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    
    
    //create method for insert data
    public void insert(AttendanceBean attendanceBean){
        //insert code
        try {
            //insert query
            String query = "insert into attendance values (null, ?, ?, ?, ?, ?)";
            PreparedStatement ps = db.con.prepareStatement(query);
            ps.setString(1, attendanceBean.getStudentID1());
            ps.setString(2, attendanceBean.getClass3());
            ps.setString(3, attendanceBean.getYear());
            ps.setString(4, attendanceBean.getMonth());
            ps.setString(5, attendanceBean.getDay());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
    }
        
        
        //create method to get data on clickin jtable
        public AttendanceBean returnAllDataToTextFields(int atID){
            AttendanceBean bean = null;
            try {
                String query = "select * from attendance where aID = "+atID;
                PreparedStatement ps = db.con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    int atIDs = rs.getInt("aID");
                    String studentID1 = rs.getString("StudentID");
                    String class3 = rs.getString("Class");
                    String year = rs.getString("Year");
                    String month = rs.getString("Month");
                    String day = rs.getString("Day");
                    
                    bean = new AttendanceBean(atIDs, studentID1, class3, year, month, day);

                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, ""+e);
            } 
            return bean;
            
        }
        
        //create method for update
        public void updateData(AttendanceBean bean) {
            try {
                String query = "update attendance set StudentID = ?, Class = ?, Year = ?, Month = ?, Day = ? where aID = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setString(1, bean.getStudentID1());
                ps.setString(2, bean.getClass3());
                ps.setString(3, bean.getYear());
                ps.setString(4, bean.getMonth());
                ps.setString(5, bean.getDay());
                ps.setInt(6, bean.getAtID());
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been updated.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
        
        //delete method
        public void deleteRecord(int atID) {
            try{
                String query = "delete from attendance where aID = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setInt(1, atID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been deleted.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
    
}
