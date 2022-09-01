/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import connection.dbConnection;
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
import controller.customerDBUtill;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asel
 */
public class MySQLUtill implements customerDBUtill{
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    
    public MySQLUtill() {
        con = dbConnection.connect();
        try {
            st = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLUtill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean customerSignup(customer cs) {
        int rowsAffected = 0;
        try {
            
            rowsAffected = st.executeUpdate("INSERT INTO customer (Customer_name, Customer_address, Customer_mobile, Customer_nic, Customer_email, Customer_password)"
                    + " VALUES ('" + cs.getName()+ "', '" + cs.getAddress()+ "', " + cs.getMobile()+ ", '" + cs.getNic()+ "', '" + cs.getEmail()+ "', '" + cs.getPassword()+ "')");
            
            //INSERT INTO `customer` (Customer_name, Customer_address, Customer_mobile, Customer_nic, Customer_email, Customer_password) values ('asel','address',0712345678,'983002919v','email','12345');
            
        } catch(Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean customerLogin(customer cs) {
        int rowsAffected = 0;
        
          try {
            String query = "select * from customer where Customer_mobile = "+cs.getMobile()+" and Customer_password = '"+cs.getPassword()+"'"; 
            rs = st.executeQuery(query);
              System.out.println("db work");
            
            while(rs.next()){
                rowsAffected = rowsAffected + 1;
            }
          } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    

    
    
    
    
}
