
 
package schoolinfo;

import signup.LoginFrame;
import dbcon.db;


public class Schoolinfo {

    
    public static void main(String[] args) {
        //create object to display the login form
        LoginFrame loginObj = new LoginFrame();
        loginObj.show();
       
        
        db.loadConnection();
    }
    
}
