
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.gocheetah.service;

import controller.adminDBUtill;
import controller.bookingDBUtill;
import controller.branchCategoryDBUtill;
import db.MySQLUtill;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.customer;
import controller.customerDBUtill;
import controller.destinationDBUtil;
import controller.driverDBUtill;
import controller.vehicleCategoryDBUtill;
import controller.vehicleDBUtill;
import java.util.List;
import model.admin;
import model.booking;
import model.branchCategory;
import model.destination;
import model.driver;
import model.feedback;
import model.vehicle;
import model.vehicleCat;
import model.vehicleCategory;

/**
 *
 * @author asel
 */
@WebService(serviceName = "GocheetahWebService")
public class GocheetahWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "customerSignup")
    public boolean customerSignup(@WebParam(name = "cs") customer cs){
        customerDBUtill util = new MySQLUtill();
        return util.customerSignup(cs);
    }
    
    @WebMethod(operationName = "customerLogin")
    public customer customerLogin(@WebParam(name = "cs") customer cs){
        customerDBUtill util = new MySQLUtill();
        return util.customerLogin(cs);
    }
    
    @WebMethod(operationName = "customerList")
    public List<customer> customerList() {
        customerDBUtill util = new MySQLUtill();
        return util.customerList();
    }
    
    @WebMethod(operationName = "getCustomer")
    public customer getCustomer(@WebParam(name = "search") String search) {
        customerDBUtill util = new MySQLUtill();
        return util.getCustomer(search);
    }
    
    @WebMethod(operationName = "updatedCustomer")
    public boolean updatedCustomer(@WebParam(name = "cs") customer cs) {
        customerDBUtill util = new MySQLUtill();
        return util.updatedCustomer(cs);
    }
    
    @WebMethod(operationName = "deleteCustomer")
    public boolean deleteCustomer(@WebParam(name = "cs") customer cs){
        customerDBUtill util = new MySQLUtill();
        return util.deleteCustomer(cs);
    }
    
    @WebMethod(operationName = "customerFeedback")
    public boolean customerFeedback(@WebParam(name = "cs") feedback fd){
        customerDBUtill util = new MySQLUtill();
        return util.customerFeedback(fd);
    }
    
    @WebMethod(operationName = "getCustomerFeedback")
    public feedback getCustomerFeedback(@WebParam(name = "search") String search) {
        customerDBUtill util = new MySQLUtill();
        return util.getCustomerFeedback(search);
    }
    
   
    @WebMethod(operationName = "adminLogin")
    public admin adminLogin(@WebParam(name = "ad") admin ad){
        adminDBUtill util = new MySQLUtill();
        return util.adminLogin(ad);
    }
    
    @WebMethod(operationName = "addAdmin")
    public boolean addAdmin(@WebParam(name = "ad") admin ad){
        adminDBUtill util = new MySQLUtill();
        return util.addAdmin(ad);
    }
    
    @WebMethod(operationName = "AdminList")
    public List<admin> AdminList() {
        adminDBUtill util = new MySQLUtill();
        return util.AdminList();
    }
    
    @WebMethod(operationName = "getAdmin")
    public admin getAdmin(@WebParam(name = "searach") String searach) {
        adminDBUtill util = new MySQLUtill();
        return util.getAdmin(searach);
    }
    
    @WebMethod(operationName = "updateAdmin")
    public boolean updateAdmin(@WebParam(name = "dr") admin ad) {
        adminDBUtill util = new MySQLUtill();
        return util.updateAdmin(ad);
    }
    
    @WebMethod(operationName = "deleteAdmin")
    public boolean deleteAdmin(@WebParam(name = "ad") admin ad){
        adminDBUtill util = new MySQLUtill();
        return util.deleteAdmin(ad);
    }
    
    
    @WebMethod(operationName = "driverLogin")
    public driver driverLogin(@WebParam(name = "dr") driver dr){
        driverDBUtill util = new MySQLUtill();
        return util.driverLogin(dr);
    }
    
    @WebMethod(operationName = "addDriver")
    public boolean addDriver(@WebParam(name = "dr") driver dr){
        driverDBUtill util = new MySQLUtill();
        return util.addDriver(dr);
    }
    
    @WebMethod(operationName = "DriverList")
    public List<driver> DriverList() {
        driverDBUtill util = new MySQLUtill();
        return util.DriverList();
    }
    
    @WebMethod(operationName = "getDriver")
    public driver getDriver(@WebParam(name = "search") String search) {
        driverDBUtill util = new MySQLUtill();
        return util.getDriver(search);
    }
    
    @WebMethod(operationName = "updateDriver")
    public boolean updateDriver(@WebParam(name = "dr") driver dr) {
        driverDBUtill util = new MySQLUtill();
        return util.updateDriver(dr);
    }
    
    @WebMethod(operationName = "deleteDriver")
    public boolean deleteDriver(@WebParam(name = "cs") driver dr){
        driverDBUtill util = new MySQLUtill();
        return util.deleteDriver(dr);
    }
    
    @WebMethod(operationName = "findDriverVehicleList")
    public List<vehicle> findDriverVehicleList(@WebParam(name = "search") String search) {
        driverDBUtill util = new MySQLUtill();
        return util.findDriverVehicleList(search);
    }
    
    @WebMethod(operationName = "addBranch")
    public boolean addBranch(@WebParam(name = "bn") branchCategory bn){
        branchCategoryDBUtill util = new MySQLUtill();
        return util.addBranch(bn);
    }
    
    @WebMethod(operationName = "viewBranches")
    public List<branchCategory> viewBranches(){
        branchCategoryDBUtill util = new MySQLUtill();
        return util.viewBranches();
    }
    
    @WebMethod(operationName = "branchesList")
    public List<branchCategory> branchesList() {
        branchCategoryDBUtill util = new MySQLUtill();
        return util.branchesList();
    }
    
    @WebMethod(operationName = "getBranch")
    public branchCategory getBranch(@WebParam(name = "bn") String bn) {
        branchCategoryDBUtill util = new MySQLUtill();
        return util.getBranch(bn);
    }
    
    @WebMethod(operationName = "updatedBranch")
    public boolean updatedBranch(@WebParam(name = "bn") branchCategory bn) {
        branchCategoryDBUtill util = new MySQLUtill();
        return util.updatedBranch(bn);
    }
    
    @WebMethod(operationName = "deleteBranch")
    public boolean deleteBranch(@WebParam(name = "bn") branchCategory bn){
        branchCategoryDBUtill util = new MySQLUtill();
        return util.deleteBranch(bn);
    }
    
    
    @WebMethod(operationName = "addVehicleCategory")
    public boolean addVehicleCategory(@WebParam(name = "vc") vehicleCat vc){
        vehicleCategoryDBUtill util = new MySQLUtill();
        return util.addVehicleCategory(vc);
    }
    
    @WebMethod(operationName = "viewVehicleCateories")
    public List<vehicleCat> viewVehicleCateories(){
        vehicleCategoryDBUtill util = new MySQLUtill();
        return util.viewVehicleCateories();
    }
    
    @WebMethod(operationName = "vehicleCategoryList")
    public List<vehicleCat> vehicleCategoryList() {
        vehicleCategoryDBUtill util = new MySQLUtill();
        return util.vehicleCategoryList();
    }
    
    @WebMethod(operationName = "getVehicleCategoryh")
    public vehicleCat getVehicleCategoryh(@WebParam(name = "srch") String srch) {
        vehicleCategoryDBUtill util = new MySQLUtill();
        return util.getVehicleCategoryh(srch);
    }
    
    @WebMethod(operationName = "updatedVehicleCategory")
    public boolean updatedVehicleCategory(@WebParam(name = "vc") vehicleCat vc) {
        vehicleCategoryDBUtill util = new MySQLUtill();
        return util.updatedVehicleCategory(vc);
    }
    
    @WebMethod(operationName = "deleteVehicleCategory")
    public boolean deleteVehicleCategory(@WebParam(name = "vc") vehicleCat vc){
        vehicleCategoryDBUtill util = new MySQLUtill();
        return util.deleteVehicleCategory(vc);
    }
    
    @WebMethod(operationName = "addVehicle")
    public boolean addVehicle(@WebParam(name = "vh") vehicle vh){
        vehicleDBUtill util = new MySQLUtill();
        return util.addVehicle(vh);
    }
    
    @WebMethod(operationName = "viewVehicles")
    public List<vehicle> viewVehicles(){
        vehicleDBUtill util = new MySQLUtill();
        return util.viewVehicles();
    }
    
    @WebMethod(operationName = "vehicleList")
    public List<vehicle> vehicleList() {
        vehicleDBUtill util = new MySQLUtill();
        return util.vehicleList();
    }
    
    @WebMethod(operationName = "getVehicle")
    public vehicle getVehicle(@WebParam(name = "search") String search) {
        vehicleDBUtill util = new MySQLUtill();
        return util.getVehicle(search);
    }
    
    @WebMethod(operationName = "updateVehicle")
    public boolean updateVehicle(@WebParam(name = "vh") vehicle vh) {
        vehicleDBUtill util = new MySQLUtill();
        return util.updateVehicle(vh);
    }
    
    @WebMethod(operationName = "deleteVehicle")
    public boolean deleteVehicle(@WebParam(name = "vh") vehicle vh){
        vehicleDBUtill util = new MySQLUtill();
        return util.deleteVehicle(vh);
    }
    
    @WebMethod(operationName = "addDstination")
    public boolean addDstination(@WebParam(name = "ds") destination ds){
        destinationDBUtil util = new MySQLUtill();
        return util.addDstination(ds);
    }
    
    @WebMethod(operationName = "viewDstination")
    public List<destination> viewDstination(){
        destinationDBUtil util = new MySQLUtill();
        return util.viewDstination();
    }
    
    @WebMethod(operationName = "DstinationList")
    public List<destination> DstinationList() {
        destinationDBUtil util = new MySQLUtill();
        return util.DstinationList();
    }
    
    @WebMethod(operationName = "getDstination")
    public destination getDstination(@WebParam(name = "search") String search) {
        destinationDBUtil util = new MySQLUtill();
        return util.getDstination(search);
    }
    
    @WebMethod(operationName = "updateDstination")
    public boolean updateDstination(@WebParam(name = "ds") destination ds) {
        destinationDBUtil util = new MySQLUtill();
        return util.updateDstination(ds);
    }
    
    @WebMethod(operationName = "deleteDstination")
    public boolean deleteDstination(@WebParam(name = "ds") destination ds){
        destinationDBUtil util = new MySQLUtill();
        return util.deleteDstination(ds);
    }
    
    @WebMethod(operationName = "getDistance")
    public destination getDistance(@WebParam(name = "search") String pick, String drop) {
        destinationDBUtil util = new MySQLUtill();
        return util.getDistance(pick,drop);
    }
    
    @WebMethod(operationName = "getLocations")
    public destination getLocations(@WebParam(name = "search") String search) {
        destinationDBUtil util = new MySQLUtill();
        return util.getLocations(search);
    }
    
    @WebMethod(operationName = "getDestiations")
    public List<destination> getDestiations(@WebParam(name = "branch") String branch) {
        destinationDBUtil util = new MySQLUtill();
        return util.getDestiations(branch);
    }
    
    @WebMethod(operationName = "addBooking")
    public boolean addBooking(@WebParam(name = "bk") booking bk){
        bookingDBUtill util = new MySQLUtill();
        return util.addBooking(bk);
    }
    
    @WebMethod(operationName = "bookingList")
    public List<booking> bookingList() {
        bookingDBUtill util = new MySQLUtill();
        return util.bookingList();
    }
    
    @WebMethod(operationName = "getbooking")
    public booking getbooking(@WebParam(name = "search") String date, String branch) {
        bookingDBUtill util = new MySQLUtill();
        return util.getbooking(date,branch);
    }
    
    @WebMethod(operationName = "updateBooking")
    public boolean updateBooking(@WebParam(name = "bk") booking bk) {
        bookingDBUtill util = new MySQLUtill();
        return util.updateBooking(bk);
    }
    
    @WebMethod(operationName = "getBookingDriver")
    public booking getBookingDriver(@WebParam(name = "search") String search) {
        bookingDBUtill util = new MySQLUtill();
        return util.getBookingDriver(search);
    }
    
    @WebMethod(operationName = "getBookingList")
    public List<booking> getBookingList(@WebParam(name = "search") String search) {
        bookingDBUtill util = new MySQLUtill();
        return util.getBookingList(search);
    }
    
    @WebMethod(operationName = "getBookingList2")
    public List<booking> getBookingList2(@WebParam(name = "search") String search) {
        bookingDBUtill util = new MySQLUtill();
        return util.getBookingList2(search);
    }
    
}
