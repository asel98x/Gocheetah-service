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
import controller.destinationDBUtil;
import controller.driverDBUtill;
import controller.vehicleCategoryDBUtill;
import controller.vehicleDBUtill;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.destination;
import model.vehicleCat;

/**
 *
 * @author asel
 */
public class MySQLUtill implements customerDBUtill, adminDBUtill, driverDBUtill, branchCategoryDBUtill, vehicleCategoryDBUtill, vehicleDBUtill, destinationDBUtil {

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

            rowsAffected = st.executeUpdate("INSERT INTO customer (Customer_name,Customer_address,Customer_mobile,Customer_nic,Customer_email,Customer_branch,Customer_password) VALUES"
                    + " ('" + cs.getName() + "','" + cs.getAddress() + "'," + cs.getMobile() + ",'" + cs.getNic() + "','" + cs.getEmail() + "','" + cs.getBranch() + "','" + cs.getPassword() + "')");

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
    public List<customer> customerList() {
        List<customer> cs = new ArrayList<>();
        try {
            String query = "select * from customer";
            rs = st.executeQuery(query);
            System.out.println("db work");
            while (rs.next()) {
                customer cstm = new customer();
                cstm.setCustomerId(rs.getInt("Customer_id"));
                cstm.setName(rs.getString("Customer_name"));
                cstm.setAddress(rs.getString("Customer_address"));
                cstm.setMobile(rs.getInt("Customer_mobile"));
                cstm.setNic(rs.getString("Customer_nic"));
                cstm.setEmail(rs.getString("Customer_email"));
                cstm.setBranch(rs.getString("Customer_branch"));
                cstm.setPassword(rs.getString("Customer_password"));
                cs.add(cstm);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return cs;
    }

    @Override
    public customer getCustomer(String search) {
        customer cs = new customer();

        try {
            rs = st.executeQuery("SELECT * FROM customer WHERE Customer_id = '" + search + "' or Customer_name = '" + search + "' or Customer_nic = '" + search + "'");

            rs.next();
            cs.setCustomerId(rs.getInt("Customer_id"));
            cs.setName(rs.getString("Customer_name"));
            cs.setAddress(rs.getString("Customer_address"));
            cs.setMobile(rs.getInt("Customer_mobile"));
            cs.setNic(rs.getString("Customer_nic"));
            cs.setEmail(rs.getString("Customer_email"));
            cs.setBranch(rs.getString("Customer_branch"));
            cs.setPassword(rs.getString("Customer_password"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return cs;
    }

    @Override
    public boolean updatedCustomer(customer cs) {
        int rowsAffected = 0;

        try {
            rowsAffected = st.executeUpdate("UPDATE `customer` SET Customer_name = '" + cs.getName() + "',Customer_address = '" + cs.getAddress() + "',Customer_mobile = " + cs.getMobile() + ",Customer_nic = '" + cs.getNic() + "',Customer_email = '" + cs.getEmail() + "',"
                    + "Customer_branch = '" + cs.getBranch() + "',Customer_password = '" + cs.getPassword() + "' WHERE (Customer_id  = " + cs.getCustomerId() + ")");

        } catch (Exception e) {
            System.out.println(e);
        }

        return rowsAffected > 0;
    }

    @Override
    public boolean deleteCustomer(customer cs) {
        int rowsAffected = 0;
        try {
            rowsAffected = st.executeUpdate("delete FROM customer WHERE (Customer_id  = " + cs.getCustomerId() + ")");

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
    public boolean addAdmin(admin ad) {
        int rowsAffected = 0;
        try {

            rowsAffected = st.executeUpdate("INSERT INTO admin (admin_name,admin_address,admin_mobile,admin_nic,admin_dob,admin_email,admin_age,admin_password,branch,admin_type) VALUES"
                    + " ('" + ad.getName() + "','" + ad.getAddress() + "'," + ad.getMobile() + ",'" + ad.getNic() + "','" + ad.getDob() + "','" + ad.getEmail() + "','" + ad.getAge() + "','" + ad.getPassword() + "','" + ad.getBranch() + "','" + ad.getType() + "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public List<admin> AdminList() {
        List<admin> ad = new ArrayList<>();
        try {
            String query = "select * from admin";
            rs = st.executeQuery(query);
            System.out.println("db work");
            while (rs.next()) {
                admin admn = new admin();
                admn.setAdminId(rs.getInt("admin_id"));
                admn.setName(rs.getString("admin_name"));
                admn.setAddress(rs.getString("admin_address"));
                admn.setMobile(rs.getInt("admin_mobile"));
                admn.setNic(rs.getString("admin_nic"));
                admn.setDob(rs.getString("admin_dob"));
                admn.setEmail(rs.getString("admin_email"));
                admn.setAge(rs.getInt("admin_age"));
                admn.setPassword(rs.getString("admin_password"));
                admn.setBranch(rs.getString("branch"));
                admn.setType(rs.getString("admin_type"));
                ad.add(admn);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ad;
    }

    @Override
    public admin getAdmin(String search) {
        admin ad = new admin();

        try {
            rs = st.executeQuery("SELECT * FROM admin WHERE admin_id = '" + search + "' or admin_name = '" + search + "' or admin_nic = '" + search + "'");

            rs.next();
            ad.setAdminId(rs.getInt("admin_id"));
            ad.setName(rs.getString("admin_name"));
            ad.setAddress(rs.getString("admin_address"));
            ad.setMobile(rs.getInt("admin_mobile"));
            ad.setNic(rs.getString("admin_nic"));
            ad.setDob(rs.getString("admin_dob"));
            ad.setEmail(rs.getString("admin_email"));
            ad.setAge(rs.getInt("admin_age"));
            ad.setPassword(rs.getString("admin_password"));
            ad.setBranch(rs.getString("branch"));
            ad.setType(rs.getString("admin_type"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return ad;
    }

    @Override
    public boolean updateAdmin(admin ad) {
        int rowsAffected = 0;

        try {
            rowsAffected = st.executeUpdate("UPDATE `admin` SET admin_name = '" + ad.getName() + "',admin_address = '" + ad.getAddress() + "',admin_mobile = " + ad.getMobile() + ",admin_nic = '" + ad.getNic() + "',admin_dob = '" + ad.getDob() + "',"
                    + "admin_email = '" + ad.getEmail() + "',admin_age = " + ad.getAge() + ",branch = '" + ad.getBranch() + "',admin_type = '" + ad.getType() + "' WHERE (admin_id  = " + ad.getAdminId() + ")");

        } catch (Exception e) {
            System.out.println(e);
        }

        return rowsAffected > 0;
    }

    @Override
    public boolean deleteAdmin(admin ad) {
        int rowsAffected = 0;
        try {
            rowsAffected = st.executeUpdate("delete FROM admin WHERE (admin_id  = " + ad.getAdminId() + ")");

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
    public boolean addDriver(driver dr) {
        int rowsAffected = 0;
        try {

            rowsAffected = st.executeUpdate("INSERT INTO driver (driver_name,driver_address,driver_mobile,driver_nic,driver_dob,driver_email,driver_age,driver_password,branch) VALUES"
                    + " ('" + dr.getName() + "','" + dr.getAddress() + "'," + dr.getMobile() + ",'" + dr.getNic() + "','" + dr.getDob() + "','" + dr.getEmail() + "','" + dr.getAge() + "','" + dr.getPassword() + "','" + dr.getBranch() + "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public List<driver> DriverList() {
        List<driver> dr = new ArrayList<>();
        try {
            String query = "select * from driver";
            rs = st.executeQuery(query);
            System.out.println("db work");
            while (rs.next()) {
                driver drvr = new driver();
                drvr.setDriverID(rs.getInt("driver_id"));
                drvr.setName(rs.getString("driver_name"));
                drvr.setAddress(rs.getString("driver_address"));
                drvr.setMobile(rs.getInt("driver_mobile"));
                drvr.setNic(rs.getString("driver_nic"));
                drvr.setEmail(rs.getString("driver_dob"));
                drvr.setBranch(rs.getString("driver_email"));
                drvr.setAge(rs.getInt("driver_age"));
                drvr.setPassword(rs.getString("driver_password"));
                drvr.setBranch(rs.getString("branch"));
                dr.add(drvr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return dr;
    }

    @Override
    public driver getDriver(String search) {
        driver dr = new driver();

        try {
            rs = st.executeQuery("SELECT * FROM driver WHERE driver_id = '" + search + "' or driver_name = '" + search + "' or driver_nic = '" + search + "'");

            rs.next();
            dr.setDriverID(rs.getInt("driver_id"));
            dr.setName(rs.getString("driver_name"));
            dr.setAddress(rs.getString("driver_address"));
            dr.setMobile(rs.getInt("driver_mobile"));
            dr.setNic(rs.getString("driver_nic"));
            dr.setDob(rs.getString("driver_dob"));
            dr.setEmail(rs.getString("driver_email"));
            dr.setAge(rs.getInt("driver_age"));
            dr.setPassword(rs.getString("driver_password"));
            dr.setBranch(rs.getString("branch"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return dr;
    }

    @Override
    public boolean updateDriver(driver dr) {
        int rowsAffected = 0;

        try {
            rowsAffected = st.executeUpdate("UPDATE `driver` SET driver_name = '" + dr.getName() + "',driver_address = '" + dr.getAddress() + "',driver_mobile = " + dr.getMobile() + ",driver_nic = '" + dr.getNic() + "',driver_dob = '" + dr.getDob() + "',driver_email = '" + dr.getEmail() + "',"
                    + "driver_age = " + dr.getAge() + ",driver_password = '" + dr.getPassword() + "',branch = '" + dr.getBranch() + "' WHERE driver_id  = " + dr.getDriverID() + "");

        } catch (Exception e) {
            System.out.println(e);
        }

        return rowsAffected > 0;
    }

    @Override
    public boolean deleteDriver(driver dr) {
        int rowsAffected = 0;
        try {
            rowsAffected = st.executeUpdate("delete FROM driver WHERE (driver_id  = " + dr.getDriverID() + ")");

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
    public List<vehicle> findDriverVehicleList(String search) {
        List<vehicle> veh = new ArrayList<>();
        try {
            rs = st.executeQuery("SELECT * FROM vehicle WHERE driver_id   = " + search + "");

            while (rs.next()) {
                vehicle vh = new vehicle();
                vh.setVehicleId(rs.getInt("vehicle_id"));
                vh.setNoPlate(rs.getString("vehicle_noPlate"));
                veh.add(vh);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return veh;
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
    public branchCategory getBranch(String search) {
        branchCategory bn = new branchCategory();

        try {
            rs = st.executeQuery("SELECT * FROM branch WHERE branch_id = '" + search + "' or location = '" + search + "'");

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
    public vehicleCat getVehicleCategoryh(String search) {
        vehicleCat vc = new vehicleCat();

        try {
            rs = st.executeQuery("SELECT * FROM vehicategory WHERE vehicleCat_id= " + search + " or vehicleCat_category = '" + search + "'");
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
            rowsAffected = st.executeUpdate("delete FROM vehicategory WHERE (vehicleCat_id  = " + vc.getVehicleCatId() + ")");

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

    @Override
    public vehicle getVehicle(String search) {
        vehicle vh = new vehicle();

        try {
            rs = st.executeQuery("SELECT * FROM vehicle WHERE vehicle_id = " + search + " or vehicle_chasiNno = '" + search + "' "
                    + "or vehicle_noPlate = '" + search + "' or driver_id = '" + search + "'");

            rs.next();

            vh.setVehicleId(rs.getInt("vehicle_id"));
            vh.setChasiNo(rs.getString("vehicle_chasiNno"));
            vh.setNoPlate(rs.getString("vehicle_noPlate"));
            vh.setCategory(rs.getString("vehicleCatgory"));
            vh.setBranch(rs.getString("branch"));
            vh.setDriver(rs.getString("driver_id"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return vh;
    }

    @Override
    public boolean updateVehicle(vehicle vh) {
        int rowsAffected = 0;

        try {
            rowsAffected = st.executeUpdate("UPDATE `vehicle` SET vehicle_chasiNno = '" + vh.getChasiNo() + "', vehicle_noPlate = '" + vh.getNoPlate() + "',"
                    + "	branch='" + vh.getBranch() + "', driver_id = '" + vh.getDriver() + "' WHERE (vehicle_id = " + vh.getVehicleId() + ")");

        } catch (Exception e) {
            System.out.println(e);
        }

        return rowsAffected > 0;
    }

    @Override
    public boolean deleteVehicle(vehicle vh) {
        int rowsAffected = 0;
        try {
            rowsAffected = st.executeUpdate("delete FROM vehicle WHERE (vehicle_id  = " + vh.getVehicleId() + ")");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public boolean addDstination(destination ds) {
        int rowsAffected = 0;
        try {

            rowsAffected = st.executeUpdate("INSERT INTO destination (destination_vehicle,destination_branch,destination_pickup,destination_drop,destination_price) VALUE ('" + ds.getdVehicle() + "', '" + ds.getdBranch() + "', '" + ds.getdPickup() + "', '" + ds.getdDrop() + "',  '" + ds.getdPrice() + "')");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

    @Override
    public List<destination> DstinationList() {
        List<destination> ds = new ArrayList<>();
        try {
            String query = "select * from destination";
            rs = st.executeQuery(query);
            System.out.println("db work");
            while (rs.next()) {
                destination dstn = new destination();
                dstn.setDestinationID(rs.getInt("destination_id"));
                dstn.setdVehicle(rs.getString("destination_vehicle"));
                dstn.setdBranch(rs.getString("destination_branch"));
                dstn.setdPickup(rs.getString("destination_pickup"));
                dstn.setdDrop(rs.getString("destination_drop"));
                dstn.setdPrice(rs.getFloat("destination_price"));

                ds.add(dstn);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return ds;
    }

    @Override
    public destination getDstination(String search) {
        destination dstn = new destination();

        try {
            rs = st.executeQuery("SELECT * FROM destination WHERE destination_id = '" + search + "' or destination_vehicle = '" + search + "' "
                    + "or destination_branch = '" + search + "' or destination_pickup = '" + search + "' or destination_price = '" + search + "'");

            rs.next();

            dstn.setDestinationID(rs.getInt("destination_id"));
            dstn.setdVehicle(rs.getString("destination_vehicle"));
            dstn.setdBranch(rs.getString("destination_branch"));
            dstn.setdPickup(rs.getString("destination_pickup"));
            dstn.setdDrop(rs.getString("destination_drop"));
            dstn.setdPrice(rs.getFloat("destination_price"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return dstn;
    }

    @Override
    public boolean updateDstination(destination dstn) {
        int rowsAffected = 0;

        try {
            rowsAffected = st.executeUpdate("UPDATE `destination` SET destination_vehicle = '" + dstn.getdVehicle()+ "', destination_branch = '" + dstn.getdBranch()+ "',"
                    + "destination_pickup = '" + dstn.getdPickup()+ "', destination_drop = '" + dstn.getdDrop()+ "',"
                            + " destination_price = '" + dstn.getdPrice()+ "' WHERE destination_id = " + dstn.getDestinationID()+ "");

        } catch (Exception e) {
            System.out.println(e);
        }

        return rowsAffected > 0;
    }

    @Override
    public boolean deleteDstination(destination ds) {
        int rowsAffected = 0;
        try {
            rowsAffected = st.executeUpdate("delete FROM destination WHERE destination_id  = " + ds.getDestinationID()+ "");

        } catch (Exception e) {
            System.out.println(e);
        }
        return rowsAffected > 0;
    }

}
