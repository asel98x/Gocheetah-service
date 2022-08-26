/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import connection.dbConnection;
import controller.DBUtill;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.admin;
import model.branchCategory;
import model.customer;
import model.driver;
import model.vehicle;
import model.vehicleCategory;

/**
 *
 * @author asel
 */
public class MySQLUtill implements DBUtill{
//    Connection con = null;
//    Statement pst = null;
//    ResultSet rs = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/gocheetah?zeroDateTimeBehavior=CONVERT_TO_NULL";
    static final String USER = "root";
    static final String PASS = "";
    
    public MySQLUtill() {
        //con = dbConnection.connect(); 
        
        
    }

    @Override
    public boolean customerSignup(customer cs) {
        int rowsAffected = 0;
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement statement = conn.createStatement();
//            String sql = "INSERT INTO `customer` VALUES ('" + cs.getName()+ "','" + cs.getAddress()+ "', " + cs.getMobile()+ ", '" + cs.getNic()+ "', '" + cs.getEmail()+ "')";
//            pst = con.createStatement();
            rowsAffected = statement.executeUpdate("INSERT INTO `customer` (Customer_name, Customer_address, Customer_mobile, Customer_nic, Customer_email, Customer_password) VALUES ('" + cs.getName()+ "','" + cs.getAddress()+ "', " + cs.getMobile()+ ", '" + cs.getNic()+ "', '" + cs.getEmail()+ "', '" + cs.getPassword()+ "')");
            //rowsAffected = pst.executeUpdate("INSERT INTO `customer` (Customer_name, Customer_address, Customer_mobile, Customer_nic, Customer_email) VALUES ('asel','address', 0123456789, '0123456nic', 'gmail.com')");
        } catch(Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    
    
    
    
}
