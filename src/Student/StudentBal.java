/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;


import dbcon.db;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Sithumini
 */
public class StudentBal {
    //create method for read data
    public List<StudentBean> loadData(){
        List<StudentBean> list = new ArrayList<StudentBean>();
        try {
            //make query select all data from Student table
            String query = "select * from student";
            PreparedStatement ps = db.con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int sID = rs.getInt("sid");
                String firstName = rs.getString("FirstName");
                String lastName = rs.getString("LastName");
                String stuID = rs.getString("StudentID");
                String gender = rs.getString("Gender");
                String city = rs.getString("City");
                String contactNo = rs.getString("ContactNo");
                String address = rs.getString("Address");
                String class2 = rs.getString("Class");
                
                //create studentbean object
                StudentBean bean = new StudentBean(sID, firstName, lastName, stuID, gender, city, contactNo, address, class2);
                list.add(bean); //add bean in list
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        return list;
    }
    
    
    
    //create method for insert data
    public void insert(StudentBean studentBean){
        //insert code
        try {
            //insert query
            String query = "insert into student values (null, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = db.con.prepareStatement(query);
            ps.setString(1, studentBean.getFirstName());
            ps.setString(2, studentBean.getLastName());
            ps.setString(3, studentBean.getStuID());
            ps.setString(4, studentBean.getGender());
            ps.setString(5, studentBean.getCity());
            ps.setString(6, studentBean.getContactNo());
            ps.setString(7, studentBean.getAddress());
            ps.setString(8, studentBean.getClass2());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "A record has been inserted.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
    }
        
        
        //create method to get data on clickin jtable
        public StudentBean returnAllDataToTextFields(int sID){
            StudentBean bean = null;
            try {
                String query = "select * from student where sid = "+sID;
                PreparedStatement ps = db.con.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    int sIDs = rs.getInt("sid");
                    String firstName = rs.getString("FirstName");
                    String lastName = rs.getString("LastName");
                    String stuID = rs.getString("StudentID");
                    String gender = rs.getString("Gender");
                    String city = rs.getString("City");
                    String contactNo = rs.getString("ContactNo");
                    String address = rs.getString("Address");
                    String class2 = rs.getString("Class");
                    
                    bean = new StudentBean(sIDs, firstName, lastName, stuID, gender, city, contactNo, address, class2);

                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, ""+e);
            } 
            return bean;
            
        }
        
        //create method for update
        public void updateData(StudentBean bean) {
            try {
                String query = "update student set FirstName = ?, LastName = ?, StudentID = ?, Gender = ?, City = ?, ContactNo = ?, Address = ?, Class = ? where sid = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setString(1, bean.getFirstName());
                ps.setString(2, bean.getLastName());
                ps.setString(3, bean.getStuID());
                ps.setString(4, bean.getGender());
                ps.setString(5, bean.getCity());
                ps.setString(6, bean.getContactNo());
                ps.setString(7, bean.getAddress());
                ps.setString(8, bean.getClass2());
                ps.setInt(9, bean.getsID());
                
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been updated.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
        
        //delete method
        public void deleteRecord(int sID) {
            try{
                String query = "delete from student where sid = ?";
                PreparedStatement ps = db.con.prepareStatement(query);
                ps.setInt(1,sID);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "A record has been deleted.");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, ""+e);
            }
        }
    
}
