/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package db;

import java.util.List;
import model.admin;
import model.booking;
import model.branchCategory;
import model.customer;
import model.destination;
import model.driver;
import model.feedback;
import model.vehicle;
import model.vehicleCat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author asel
 */
public class MySQLUtillTest {
    
    public MySQLUtillTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of customerSignup method, of class MySQLUtill.
     */
    @Test
    public void testCustomerSignup() {
        System.out.println("customerSignup");
        customer cs = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.customerSignup(cs);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of customerLogin method, of class MySQLUtill.
     */
    @Test
    public void testCustomerLogin() {
        System.out.println("customerLogin");
        customer cs = null;
        MySQLUtill instance = new MySQLUtill();
        customer expResult = null;
        customer result = instance.customerLogin(cs);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of customerList method, of class MySQLUtill.
     */
    @Test
    public void testCustomerList() {
        System.out.println("customerList");
        MySQLUtill instance = new MySQLUtill();
        customer expResult = new customer(69);
        List<customer> result = instance.customerList();
        for(customer cs : result){
            if(cs.getCustomerId()== expResult.getCustomerId()){
                assertEquals(expResult.getCustomerId(), cs.getCustomerId());
            }
        }
        
    }

    /**
     * Test of getCustomer method, of class MySQLUtill.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        String search = "69";
        MySQLUtill instance = new MySQLUtill();
        customer expResult = new customer(69);
        customer result = instance.getCustomer(search);
        assertEquals(expResult.getCustomerId(), result.getCustomerId());
        
    }

    /**
     * Test of updatedCustomer method, of class MySQLUtill.
     */
    @Test
    public void testUpdatedCustomer() {
        System.out.println("updatedCustomer");
        customer cs = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updatedCustomer(cs);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteCustomer method, of class MySQLUtill.
     */
    @Test
    public void testDeleteCustomer() {
        System.out.println("deleteCustomer");
        customer cs = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.deleteCustomer(cs);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of customerFeedback method, of class MySQLUtill.
     */
    @Test
    public void testCustomerFeedback() {
        System.out.println("customerFeedback");
        feedback fd = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.customerFeedback(fd);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCustomerFeedback method, of class MySQLUtill.
     */
//    @Test
//    public void testGetCustomerFeedback() {
//        System.out.println("getCustomerFeedback");
//        String search = "7";
//        MySQLUtill instance = new MySQLUtill();
//        feedback expResult = new feedback(7, search, search, 1, search, search);
//        feedback result = instance.getCustomerFeedback(search);
//        assertEquals(expResult.getOrderId(), result.getOrderId());
//        
//    }

    /**
     * Test of adminLogin method, of class MySQLUtill.
     */
    @Test
    public void testAdminLogin() {
        System.out.println("adminLogin");
        admin admn = null;
        MySQLUtill instance = new MySQLUtill();
        admin expResult = null;
        admin result = instance.adminLogin(admn);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addAdmin method, of class MySQLUtill.
     */
    @Test
    public void testAddAdmin() {
        System.out.println("addAdmin");
        admin ad = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.addAdmin(ad);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of AdminList method, of class MySQLUtill.
     */
    @Test
    public void testAdminList() {
        System.out.println("AdminList");
        MySQLUtill instance = new MySQLUtill();
        admin expResult = new admin(1,"Main","asel","Kadawatha",765760512,"983002919v","2022-09-09",23,"asel@gmail.com==","Kandy","MTIzNDU2Nzg5MA==");
        List<admin> result = instance.AdminList();
        for(admin ad : result){
            if(ad.getAdminId()== expResult.getAdminId()){
                assertEquals(expResult.getAdminId(), ad.getAdminId());
            }
        }
        
    }

    /**
     * Test of getAdmin method, of class MySQLUtill.
     */
   @Test
    public void testGetAdminT() {
        System.out.println("getAdminT");
        String search = "1";
        MySQLUtill instance = new MySQLUtill();
        admin expResult = new admin(1,"Main","asel","Kadawatha",765760512,"983002919v","2022-09-09",23,"asel@gmail.com==","Kandy","MTIzNDU2Nzg5MA==");
        admin result = instance.getAdmin(search);
        assertEquals(expResult.getAdminId(), result.getAdminId());
        assertEquals(expResult.getName(), result.getName());
        
    }

    /**
     * Test of updateAdmin method, of class MySQLUtill.
     */
    @Test
    public void testUpdateAdmin() {
        System.out.println("updateAdmin");
        admin ad = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updateAdmin(ad);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteAdmin method, of class MySQLUtill.
     */
    @Test
    public void testDeleteAdmin() {
        System.out.println("deleteAdmin");
        admin ad = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.deleteAdmin(ad);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of driverLogin method, of class MySQLUtill.
     */
    @Test
    public void testDriverLogin() {
        System.out.println("driverLogin");
        driver dr = null;
        MySQLUtill instance = new MySQLUtill();
        driver expResult = null;
        driver result = instance.driverLogin(dr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addDriver method, of class MySQLUtill.
     */
    @Test
    public void testAddDriver() {
        System.out.println("addDriver");
        driver dr = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.addDriver(dr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of DriverList method, of class MySQLUtill.
     */
    @Test
    public void testDriverList() {
        System.out.println("DriverList");
        MySQLUtill instance = new MySQLUtill();
        driver expResult = new driver("23F9SK4GSD", "Kasun gunawardana", "kadawataha", 765210452, "983002919v", "2022-09-10", 25, "vinjith11@gmail.com", "Kandy", "MTIzNDU2Nzg5MA==");
        List<driver> result = instance.DriverList();
        for(driver dr : result){
            if(dr.getLicence()== expResult.getLicence()){
                assertEquals(expResult.getName(), dr.getName());
            }
        }
        
    }

    /**
     * Test of getDriver method, of class MySQLUtill.
     */
    @Test
    public void testGetDriver() {
        System.out.println("getDriver");
        String search = "1";
        MySQLUtill instance = new MySQLUtill();
        driver expResult = new driver("23F9SK4GSD", "Kasun gunawardana", "kadawataha", 765210452, "983002919v", "2022-09-10", 25, "vinjith11@gmail.com", "Kandy", "MTIzNDU2Nzg5MA==");
        driver result = instance.getDriver(search);
        assertEquals(expResult.getLicence(), result.getLicence());
        assertEquals(expResult.getName(), result.getName());
        
    }

    /**
     * Test of updateDriver method, of class MySQLUtill.
     */
    @Test
    public void testUpdateDriver() {
        System.out.println("updateDriver");
        driver dr = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updateDriver(dr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteDriver method, of class MySQLUtill.
     */
    @Test
    public void testDeleteDriver() {
        System.out.println("deleteDriver");
        driver dr = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.deleteDriver(dr);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addBranch method, of class MySQLUtill.
     */
    @Test
    public void testAddBranch() {
        System.out.println("addBranch");
        branchCategory bn = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.addBranch(bn);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of findDriverVehicleList method, of class MySQLUtill.
     */
    @Test
    public void testFindDriverVehicleList() {
        System.out.println("findDriverVehicleList");
        String search = "1";
        MySQLUtill instance = new MySQLUtill();
        vehicle expResult = new vehicle(1, "Toyota Corolla", "z0x984mdf83k", "ABC-1234", "car", "Sedan", "1-5", "Colombo", "1", "NULL", "Available");
        List<vehicle> result = instance.findDriverVehicleList(search);
        for(vehicle vh : result){
            if(vh.getVehicleId()== expResult.getVehicleId()){
                assertEquals(expResult.getVehicleId(), vh.getVehicleId());
            }
        }
        
    }

    
    /**
     * Test of viewBranches method, of class MySQLUtill.
     */
    @Test
    public void testViewBranches() {
        System.out.println("viewBranches");
        MySQLUtill instance = new MySQLUtill();
        branchCategory expResult = new branchCategory(48, "Colombo");
        List<branchCategory> result = instance.viewBranches();
        for(branchCategory bc : result){
            if(bc.getBranchId()== expResult.getBranchId()){
                assertEquals(expResult.getBranchId(), bc.getBranchId());
            }
        }
        
    }

    /**
     * Test of branchesList method, of class MySQLUtill.
     */
    @Test
    public void testBranchesList() {
        System.out.println("branchesList");
        MySQLUtill instance = new MySQLUtill();
        branchCategory expResult = new branchCategory(48, "Colombo");
        List<branchCategory> result = instance.branchesList();
        for(branchCategory bc : result){
            if(bc.getBranchId()== expResult.getBranchId()){
                assertEquals(expResult.getBranchId(), bc.getBranchId());
            }
        }
        
    }

    /**
     * Test of getBranch method, of class MySQLUtill.
     */
    @Test
    public void testGetBranch() {
        System.out.println("getBranch");
        String search = "48";
        MySQLUtill instance = new MySQLUtill();
        branchCategory expResult = new branchCategory(48, "Colombo");
        branchCategory result = instance.getBranch(search);
        assertEquals(expResult.getBranchId(), result.getBranchId());
        
    }

    /**
     * Test of updatedBranch method, of class MySQLUtill.
     */
    @Test
    public void testUpdatedBranch() {
        System.out.println("updatedBranch");
        branchCategory bn = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updatedBranch(bn);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteBranch method, of class MySQLUtill.
     */
    @Test
    public void testDeleteBranch() {
        System.out.println("deleteBranch");
        branchCategory bn = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.deleteBranch(bn);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addVehicleCategory method, of class MySQLUtill.
     */
    @Test
    public void testAddVehicleCategory() {
        System.out.println("addVehicleCategory");
        vehicleCat vc = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.addVehicleCategory(vc);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewVehicleCateories method, of class MySQLUtill.
     */
    @Test
    public void testViewVehicleCateories() {
        System.out.println("viewVehicleCateories");
        MySQLUtill instance = new MySQLUtill();
        vehicleCat expResult = new vehicleCat(11, "Mini car", 5);
        List<vehicleCat> result = instance.viewVehicleCateories();
        for(vehicleCat vc : result){
            if(vc.getVehicleCatId()== expResult.getVehicleCatId()){
                assertEquals(expResult.getVehicleCatId(), vc.getVehicleCatId());
            }
        }
        
    }

    /**
     * Test of vehicleCategoryList method, of class MySQLUtill.
     */
    @Test
    public void testVehicleCategoryList() {
        System.out.println("vehicleCategoryList");
        MySQLUtill instance = new MySQLUtill();
        vehicleCat expResult = new vehicleCat(11, "Mini car", 5);
        List<vehicleCat> result = instance.vehicleCategoryList();
        for(vehicleCat vc : result){
            if(vc.getVehicleCatId()== expResult.getVehicleCatId()){
                assertEquals(expResult.getVehicleCatId(), vc.getVehicleCatId());
            }
        }
        
    }

    /**
     * Test of getVehicleCategoryh method, of class MySQLUtill.
     */
    @Test
    public void testGetVehicleCategoryh() {
        System.out.println("getVehicleCategoryh");
        String search = "11";
        MySQLUtill instance = new MySQLUtill();
        vehicleCat expResult = new vehicleCat(11, "Mini car", 5);
        vehicleCat result = instance.getVehicleCategoryh(search);
        assertEquals(expResult.getVehicleCatId(), result.getVehicleCatId());
        
    }

    /**
     * Test of updatedVehicleCategory method, of class MySQLUtill.
     */
    @Test
    public void testUpdatedVehicleCategory() {
        System.out.println("updatedVehicleCategory");
        vehicleCat vc = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updatedVehicleCategory(vc);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteVehicleCategory method, of class MySQLUtill.
     */
    @Test
    public void testDeleteVehicleCategory() {
        System.out.println("deleteVehicleCategory");
        vehicleCat vc = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.deleteVehicleCategory(vc);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addVehicle method, of class MySQLUtill.
     */
    @Test
    public void testAddVehicle() {
        System.out.println("addVehicle");
        vehicle vh = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.addVehicle(vh);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewVehicles method, of class MySQLUtill.
     */
    @Test
    public void testViewVehicles() {
        System.out.println("viewVehicles");
        MySQLUtill instance = new MySQLUtill();
        vehicle expResult = new vehicle(1, "Toyota Corolla", "z0x984mdf83k", "ABC-1234", "car", "Sedan", "1-5", "Colombo", "1", "NULL", "Available");
        List<vehicle> result = instance.viewVehicles();
        for(vehicle v : result){
            if(v.getVehicleId()== expResult.getVehicleId()){
                assertEquals(expResult.getVehicleId(), v.getVehicleId());
            }
        }
        
    }

    /**
     * Test of vehicleList method, of class MySQLUtill.
     */
    @Test
    public void testVehicleList() {
        System.out.println("vehicleList");
        MySQLUtill instance = new MySQLUtill();
        vehicle expResult = new vehicle(1, "Toyota Corolla", "z0x984mdf83k", "ABC-1234", "car", "Sedan", "1-5", "Colombo", "1", "NULL", "Available");
        List<vehicle> result = instance.vehicleList();
        for(vehicle v : result){
            if(v.getVehicleId()== expResult.getVehicleId()){
                assertEquals(expResult.getVehicleId(), v.getVehicleId());
            }
        }
        
    }

    /**
     * Test of getVehicle method, of class MySQLUtill.
     */
    @Test
    public void testGetVehicle() {
        System.out.println("getVehicle");
        String search = "1";
        MySQLUtill instance = new MySQLUtill();
        vehicle expResult = new vehicle(1, "Toyota Corolla", "z0x984mdf83k", "ABC-1234", "car", "Sedan", "1-5", "Colombo", "1", "NULL", "Available");
        vehicle result = instance.getVehicle(search);
        assertEquals(expResult.getVehicleId(), result.getVehicleId());
        
    }

    /**
     * Test of updateVehicle method, of class MySQLUtill.
     */
    @Test
    public void testUpdateVehicle() {
        System.out.println("updateVehicle");
        vehicle vh = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updateVehicle(vh);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of deleteVehicle method, of class MySQLUtill.
     */
    @Test
    public void testDeleteVehicle() {
        System.out.println("deleteVehicle");
        vehicle vh = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.deleteVehicle(vh);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addDstination method, of class MySQLUtill.
     */
    @Test
    public void testAddDstination() {
        System.out.println("addDstination");
        destination ds = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.addDstination(ds);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of viewDstination method, of class MySQLUtill.
     */
    @Test
    public void testViewDstination() {
        System.out.println("viewDstination");
        MySQLUtill instance = new MySQLUtill();
        destination expResult = new destination(1, "Colombo", "Thibirigasyaya", "Pitakotuwa", 5);
        List<destination> result = instance.viewDstination();
        for(destination ds : result){
            if(ds.getDestinationID()== expResult.getDestinationID()){
                assertEquals(expResult.getDestinationID(), ds.getDestinationID());
            }
        }
        
    }

    /**
     * Test of DstinationList method, of class MySQLUtill.
     */
    @Test
    public void testDstinationList() {
        System.out.println("DstinationList");
        MySQLUtill instance = new MySQLUtill();
        destination expResult = new destination(1, "Colombo", "Thibirigasyaya", "Pitakotuwa", 5);
        List<destination> result = instance.DstinationList();
        for(destination ds : result){
            if(ds.getDestinationID()== expResult.getDestinationID()){
                assertEquals(expResult.getDestinationID(), ds.getDestinationID());
            }
        }
        
    }

    /**
     * Test of getDstination method, of class MySQLUtill.
     */
    @Test
    public void testGetDstination() {
        System.out.println("getDstination");
        String search = "1";
        MySQLUtill instance = new MySQLUtill();
        destination expResult = new destination(1, "Colombo", "Thibirigasyaya", "Pitakotuwa", 5);
        destination result = instance.getDstination(search);
        assertEquals(expResult.getDestinationID(), result.getDestinationID());
        
    }

    /**
     * Test of updateDstination method, of class MySQLUtill.
     */
    @Test
    public void testUpdateDstination() {
        System.out.println("updateDstination");
        destination dstn = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updateDstination(dstn);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of deleteDstination method, of class MySQLUtill.
     */
    @Test
    public void testDeleteDstination() {
        System.out.println("deleteDstination");
        destination ds = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.deleteDstination(ds);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getDistance method, of class MySQLUtill.
     */
    @Test
    public void testGetDistance() {
        System.out.println("getDistance");
        String pick = "Thibirigasyaya";
        String drop = "Pitakotuwa";
        MySQLUtill instance = new MySQLUtill();
        destination expResult = new destination(1, drop, pick, drop, 5);
        destination result = instance.getDistance(pick, drop);
        assertEquals(expResult.getDistance(), result.getDistance());
        
    }

    /**
     * Test of getLocations method, of class MySQLUtill.
     */
    @Test
    public void testGetLocations() {
        System.out.println("getLocations");
        String search = "Colombo";
        MySQLUtill instance = new MySQLUtill();
        destination expResult = new destination(1, "Colombo", "Thibirigasyaya", "Pitakotuwa", 5);
        destination result = instance.getLocations(search);
        assertEquals(expResult.getdDrop(), result.getdDrop());
        
    }

    /**
     * Test of getDestiations method, of class MySQLUtill.
     */
    @Test
    public void testGetDestiations() {
        System.out.println("getDestiations");
        String branch = "";
        MySQLUtill instance = new MySQLUtill();
        destination expResult = new destination(1, "Colombo", "Thibirigasyaya", "Pitakotuwa", 5);
        List<destination> result = instance.getDestiations(branch);
        for(destination ds : result){
            if(ds.getDestinationID()== expResult.getDestinationID()){
                assertEquals(expResult.getDestinationID(), ds.getDestinationID());
            }
        }
        
    }

    /**
     * Test of addBooking method, of class MySQLUtill.
     */
    @Test
    public void testAddBooking() {
        System.out.println("addBooking");
        booking bk = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.addBooking(bk);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of bookingList method, of class MySQLUtill.
     */
    @Test
    public void testBookingList() {
        System.out.println("bookingList");
        MySQLUtill instance = new MySQLUtill();
        booking expResult = new booking(12, "69", "Thibirigasyaya", "Pitakotuwa", 625.0f, 1, "Colombo", 1, "mull", "11:56:29 PM", "2022-09-18");
        List<booking> result = instance.bookingList();
        for(booking bk : result){
            if(bk.getId()== expResult.getId()){
                assertEquals(expResult.getCustomerId(), bk.getCustomerId());
            }
        }
        
    }

    /**
     * Test of getbooking method, of class MySQLUtill.
     */
    @Test
    public void testGetbooking() {
        System.out.println("getbooking");
        String date = "2022-09-18";
        String branch = "Colombo";
        MySQLUtill instance = new MySQLUtill();
        booking expResult = new booking(12, "69", "Thibirigasyaya", "Pitakotuwa", 625.0f, 1, "Colombo", 1, "mull", "11:56:29 PM", "2022-09-18");
        booking result = instance.getbooking(date, branch);
        assertEquals(expResult.getId(), result.getId());
        
    }

    /**
     * Test of updateBooking method, of class MySQLUtill.
     */
    @Test
    public void testUpdateBooking() {
        System.out.println("updateBooking");
        booking bkng = null;
        MySQLUtill instance = new MySQLUtill();
        boolean expResult = false;
        boolean result = instance.updateBooking(bkng);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getBookingDriver method, of class MySQLUtill.
     */
    @Test
    public void testGetBookingDriver() {
        System.out.println("getBookingDriver");
        String search = "12";
        MySQLUtill instance = new MySQLUtill();
        booking expResult = new booking(12, "69", "Thibirigasyaya", "Pitakotuwa", 625.0f, 1, "Colombo", 1, "mull", "11:56:29 PM", "2022-09-18");
        booking result = instance.getBookingDriver(search);
        assertEquals(expResult.getId(), result.getId());
        
    }

    /**
     * Test of getBookingList method, of class MySQLUtill.
     */
    @Test
    public void testGetBookingList() {
        System.out.println("getBookingList");
        String search = "12";
        MySQLUtill instance = new MySQLUtill();
        booking expResult = new booking(12,"69","Thibirigasyaya","Pitakotuwa",625.0f,1,"Colombo",1,"null","11:56:29 PM","2022-09-18");
        List<booking> result = instance.getBookingList(search);
        for(booking bk : result){
            if(bk.getId() == expResult.getId()){
                assertEquals(expResult.getCustomerId(), bk.getCustomerId());
            }
        }
        
    }

    /**
     * Test of getBookingList2 method, of class MySQLUtill.
     */
    @Test
    public void testGetBookingList2() {
        System.out.println("getBookingList2");
        String search = "12";
        MySQLUtill instance = new MySQLUtill();
        booking expResult = new booking(12,"69","Thibirigasyaya","Pitakotuwa",625.0f,1,"Colombo",1,"null","11:56:29 PM","2022-09-18");
        List<booking> result = instance.getBookingList2(search);
        for(booking bk : result){
            if(bk.getId() == expResult.getId()){
                assertEquals(expResult.getCustomerId(), bk.getCustomerId());
            }
        }
        
        
    }
    
}
