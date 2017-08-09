/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_payroll;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author afrin
 */
public class Database {
    public static Connection conn=null;
    
    public static Connection db(){
        try{
            
        conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost/employeepayroll", "root", "root");
        return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}
