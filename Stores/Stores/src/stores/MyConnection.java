
package stores;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author sachi
 */
public class MyConnection {
    
    //create a function to connect with mysql database
    public static Connection getConnection(){
        
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/products_db","root","");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}


