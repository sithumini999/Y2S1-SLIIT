/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package signup;

import dbcon.db;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Sithumini
 */
public class Bal {
    
    public void insertDataSignup(Bean beanObj) {
        try {
            //create query for insert signup data
            String query = "insert into signup values(null, ?,?,?,?,?)";
            PreparedStatement ps = db.con.prepareStatement(query);
            ps.setString(1, beanObj.getFirstName());
            ps.setString(2, beanObj.getLastName());
            ps.setString(3, beanObj.getNic());
            ps.setString(4, beanObj.getEmail());
            ps.setString(5, beanObj.getPwd());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "You have sign up successfully...Now login");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
    
    //create method to check data from signup table
    public boolean checkLogin(String email, String pwd) {
        boolean b = false;
        try {
            //create query
            String query = "select Email, Password from signup where Email = '"+email+"' AND Password = '"+pwd+"'";
            Statement st = db.con.createStatement();
            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                b = true;
            }else{
                JOptionPane.showMessageDialog(null, "Invalid email or password...please try again.");
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, ""+e);
        }
        
        return b;
    }
    
    
    
    
    
    
}
