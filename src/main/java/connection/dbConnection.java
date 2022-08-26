/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author asel
 */
public class dbConnection {
    public static Connection connect(){
        Connection conn = null;
        
        try {
            
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gocheetah?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return conn;
    }
}
