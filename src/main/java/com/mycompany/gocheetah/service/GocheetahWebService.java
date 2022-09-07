
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.gocheetah.service;

import controller.adminDBUtill;
import controller.branchCategoryDBUtill;
import db.MySQLUtill;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.customer;
import controller.customerDBUtill;
import controller.driverDBUtill;
import controller.vehicleCategoryDBUtill;
import controller.vehicleDBUtill;
import java.util.List;
import model.admin;
import model.branchCategory;
import model.driver;
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
    public boolean customerLogin(@WebParam(name = "cs") customer cs){
        customerDBUtill util = new MySQLUtill();
        return util.customerLogin(cs);
    }
    
    @WebMethod(operationName = "adminLogin")
    public boolean adminLogin(@WebParam(name = "ad") admin ad){
        adminDBUtill util = new MySQLUtill();
        return util.adminLogin(ad);
    }
    
    @WebMethod(operationName = "addAdmin")
    public boolean addAdmin(@WebParam(name = "ad") admin ad){
        adminDBUtill util = new MySQLUtill();
        return util.addAdmin(ad);
    }
    
    @WebMethod(operationName = "driverLogin")
    public boolean driverLogin(@WebParam(name = "dr") driver dr){
        driverDBUtill util = new MySQLUtill();
        return util.driverLogin(dr);
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
    public branchCategory getBranch(@WebParam(name = "bn") int bn) {
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
    public vehicle getVehicle(@WebParam(name = "v") int id) {
        vehicleDBUtill util = new MySQLUtill();
        return util.getVehicle(id);
    }
    
    @WebMethod(operationName = "deleteVehicle")
    public boolean deleteVehicle(@WebParam(name = "vh") vehicle vh){
        vehicleDBUtill util = new MySQLUtill();
        return util.deleteVehicle(vh);
    }
}
