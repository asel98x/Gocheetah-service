/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class vehicle{
    private int vehicleId;
    private String ChasiNo;
    private String NoPlate;
    private String Category;
    private String branch;
    private String driver;

    public vehicle() {
    }

    public vehicle(int vehicleId, String ChasiNo, String NoPlate, String Category, String branch, String driver) {
        this.vehicleId = vehicleId;
        this.ChasiNo = ChasiNo;
        this.NoPlate = NoPlate;
        this.Category = Category;
        this.branch = branch;
        this.driver = driver;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getChasiNo() {
        return ChasiNo;
    }

    public void setChasiNo(String ChasiNo) {
        this.ChasiNo = ChasiNo;
    }

    public String getNoPlate() {
        return NoPlate;
    }

    public void setNoPlate(String NoPlate) {
        this.NoPlate = NoPlate;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

   
    

    
 
    
}
    
