/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author DELL
 */
public class DBConnection {
    static  Connection con=null;
    public static Connection getConnection() {
      
try {
Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement","root","Gaurav@29");
} 
catch (ClassNotFoundException | SQLException e) {
}
return  con;

}

    static Connection getConnection(String jdbcmysqllocalhost3306placement, String root, String gaurav29) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
