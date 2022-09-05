/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import connection.dbConnection;
import controller.adminDBUtill;
import controller.branchCategoryDBUtill;
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
import controller.driverDBUtill;
import controller.vehicleCategoryDBUtill;
import controller.vehicleDBUtill;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.vehicleCat;

/**
 *
 * @author asel
 */
public class MySQLUtill implements customerDBUtill, adminDBUtill, driverDBUtill, branchCategoryDBUtill, vehicleCategoryDBUtill, vehicleDBUtill {

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
                    + " VALUES ('" + cs.getName() + "', '" + cs.getAddress() + "', " + cs.getMobile() + ", '" + cs.getNic() + "', '" + cs.getEmail() + "', '" + cs.getPassword() + "')");

            //INSERT INTO `customer` (Customer_name, Customer_address, Customer_mobile, Customer_nic, Customer_email, Customer_password) values ('asel','address',0712345678,'983002919v','email','12345');
        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean customerLogin(customer cs) {
        int rowsAffected = 0;

        try {
            String query = "select * from customer where Customer_mobile = " + cs.getMobile() + " and Customer_password = '" + cs.getPassword() + "'";
            rs = st.executeQuery(query);
            System.out.println("db work");

            while (rs.next()) {
                rowsAffected = rowsAffected + 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean adminLogin(admin ad) {
        //insert into admin (admin_name,admin_address,admin_mobile,admin_nic,admin_dob,admin_email,admin_age,branch_id) VALUES('asel','kadawatha',0765760512,'983002919v','1998.10.26','asel@gmail.com',23,1)
        int rowsAffected = 0;

        try {
            String query = "select * from admin where admin_email = '" + ad.getEmail() + "' and admin_password = '" + ad.getPassword() + "'";
            rs = st.executeQuery(query);
            System.out.println("db work");

            while (rs.next()) {
                rowsAffected = rowsAffected + 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean driverLogin(driver dr) {
        int rowsAffected = 0;
        //insert into driver (driver_name,driver_address,driver_mobile,driver_nic,driver_dob,driver_email,driver_age,driver_password,branch_id) VALUES('asel','kadawataha',0765760512,'983002919v','1998.10.26','vinjith98@gmail.com',23,'MTIzNDU2Nzg5MA==',1)
        try {
            String query = "select * from driver where driver_nic = '" + dr.getNic() + "' and driver_password = '" + dr.getPassword() + "'";
            rs = st.executeQuery(query);
            System.out.println("db work");

            while (rs.next()) {
                rowsAffected = rowsAffected + 1;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean addBranch(branchCategory bn) {
        int rowsAffected = 0;
        try {

            rowsAffected = st.executeUpdate("INSERT INTO branch (location) VALUE ('" + bn.getLocation() + "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public List<branchCategory> viewBranches() {
        List<branchCategory> bn = new ArrayList<>();
        try {
            String query = "select location from branch";
            rs = st.executeQuery(query);
            System.out.println("db work");

            while (rs.next()) {
                branchCategory brnch = new branchCategory();
                brnch.setLocation(rs.getString("location"));
                bn.add(brnch);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return bn;
    }

    @Override
    public List<branchCategory> branchesList() {
        List<branchCategory> bn = new ArrayList<>();
        try {
            String query = "select * from branch";
            rs = st.executeQuery(query);
            System.out.println("db work");
            while (rs.next()) {
                branchCategory brnch = new branchCategory();
                brnch.setBranchId(rs.getInt("branch_id"));
                brnch.setLocation(rs.getString("location"));
                bn.add(brnch);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return bn;
    }

    @Override
    public branchCategory getBranch(int id) {
        branchCategory bn = new branchCategory();

        try {
            rs = st.executeQuery("SELECT * FROM branch WHERE WHERE (branch_id  = " + id + ")");
                                
            rs.next();
            bn.setBranchId(rs.getInt("branch_id"));
            bn.setLocation(rs.getString("location"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return bn;
    }

    @Override
    public boolean updatedBranch(branchCategory bn) {
        int rowsAffected = 0;

        try {
            rowsAffected = st.executeUpdate("UPDATE `branch` SET `location` = '" + bn.getLocation() + "' WHERE (branch_id = " + bn.getBranchId() + ")");

        } catch (Exception e) {
            System.out.println(e);
        }

        return rowsAffected > 0;
    }

    @Override
    public boolean deleteBranch(branchCategory bn) {
        int rowsAffected = 0;
        try {
            rowsAffected = st.executeUpdate("delete FROM branch WHERE (branch_id  = " + bn.getBranchId() + ")");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean addVehicleCategory(vehicleCat vc) {
        int rowsAffected = 0;
        try {

            rowsAffected = st.executeUpdate("INSERT INTO vehiCategory (vehicleCat_category) VALUE ('" + vc.getVehicleCategory() + "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public List<vehicleCat> viewVehicleCateories() {
        List<vehicleCat> vc = new ArrayList<>();
        try {
            String query = "SELECT vehicleCat_category   FROM `vehicategory` ";
            rs = st.executeQuery(query);
            System.out.println("db work");

            while (rs.next()) {
                vehicleCat vehi = new vehicleCat();
                vehi.setVehicleCategory(rs.getString("vehicleCat_category"));
                vc.add(vehi);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return vc;
    }

    @Override
    public List<vehicleCat> vehicleCategoryList() {
        List<vehicleCat> vc = new ArrayList<>();
        try {
            String query = "select * from vehicategory";
            rs = st.executeQuery(query);
            System.out.println("db work");
            while (rs.next()) {
                vehicleCat vehi = new vehicleCat();
                vehi.setVehicleCatId(rs.getInt("vehicleCat_id"));
                vehi.setVehicleCategory(rs.getString("vehicleCat_category"));
                vc.add(vehi);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return vc;
    }

    @Override
    public vehicleCat getVehicleCategoryh(int id) {
        vehicleCat vc = new vehicleCat();

        try {
            rs = st.executeQuery("SELECT * FROM vehicategory WHERE vehicleCat_id=" + id);
            rs.next();
            vc.setVehicleCatId(rs.getInt("vehicleCat_id"));
            vc.setVehicleCategory(rs.getString("vehicleCat_category"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return vc;
    }

    @Override
    public boolean updatedVehicleCategory(vehicleCat vc) {
        int rowsAffected = 0;

        try {
            rowsAffected = st.executeUpdate("UPDATE `vehicategory` SET `vehicleCat_category` = '" + vc.getVehicleCategory() + "' WHERE (vehicleCat_id = " + vc.getVehicleCatId() + ")");

        } catch (Exception e) {
            System.out.println(e);
        }

        return rowsAffected > 0;
    }
    
    @Override
    public boolean deleteVehicleCategory(vehicleCat vc) {
        int rowsAffected = 0;
        try {
            rowsAffected = st.executeUpdate("delete FROM vehicategory WHERE (vehicleCat_id  = " + vc.getVehicleCatId()+ ")");
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean addVehicle(vehicle vh) {
        int rowsAffected = 0;
        try {

            rowsAffected = st.executeUpdate("INSERT INTO vehicle (vehicle_chasiNno,vehicle_noPlate,vehicleCatgory,branch,driver_id) VALUE ('" + vh.getChasiNo() + "', '" + vh.getNoPlate() + "', '" + vh.getCategory() + "', '" + vh.getBranch() + "',  '" + vh.getDriver() + "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public List<vehicle> viewVehicles() {
        List<vehicle> vh = new ArrayList<>();
        try {
            String query = "SELECT vehicleCatgory   FROM `vehicle` ";
            rs = st.executeQuery(query);
            System.out.println("db work");

            while (rs.next()) {
                vehicle vhcl = new vehicle();
                vhcl.setCategory(rs.getString("vehicleCatgory"));
                vh.add(vhcl);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return vh;
    }

    @Override
    public List<vehicle> vehicleList() {
        List<vehicle> vh = new ArrayList<>();
        try {
            String query = "select * from vehicle";
            rs = st.executeQuery(query);
            System.out.println("db work");
            while (rs.next()) {
                vehicle vhcl = new vehicle();
                vhcl.setVehicleId(rs.getInt("vehicle_id"));
                vhcl.setChasiNo(rs.getString("vehicle_chasiNno"));
                vhcl.setNoPlate(rs.getString("vehicle_noPlate"));
                vhcl.setCategory(rs.getString("vehicleCatgory"));
                vhcl.setBranch(rs.getString("branch"));
                vhcl.setDriver(rs.getString("driver_id"));
                vh.add(vhcl);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return vh;
    }

    

}
