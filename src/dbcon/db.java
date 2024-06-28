/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author Sithumini
 */
public class db {
    public static Connection con = null;
    
    public static void loadConnection(){
        String url = "jdbc:mysql://localhost:3306/javadb";
        String root = "root";
        String pass = "";
        
        
        try{
            con = DriverManager.getConnection(url, root, pass);
            
            if(con != null) {
                JOptionPane.showMessageDialog(null, "database has successfully connected");
            }
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "error with database loading"+e);
        }
    }
    
}
