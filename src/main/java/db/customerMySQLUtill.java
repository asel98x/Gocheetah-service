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

/**
 *
 * @author asel
 */
public class customerMySQLUtill implements customerDBUtill{
    Connection con = null;
    Statement pst = null;
    ResultSet rs = null;
    
    public customerMySQLUtill() {
        con = dbConnection.connect();         
    }

    @Override
    public boolean customerSignup(customer cs) {
        int rowsAffected = 0;
        try {
            rowsAffected = pst.executeUpdate("INSERT INTO `customer` (Customer_name, Customer_address, Customer_mobile, Customer_nic, Customer_email, Customer_password)"
                    + " VALUES ('" + cs.getName()+ "','" + cs.getAddress()+ "', " + cs.getMobile()+ ", '" + cs.getNic()+ "', '" + cs.getEmail()+ "', '" + cs.getPassword()+ "')");
            
        } catch(Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    
    
    
    
}
