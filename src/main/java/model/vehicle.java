/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class vehicle extends vehicleCategory{
    private int vehicleId;
    private String ChasiNo;
    private String NoPlate;
    private int Category;
    private int branch;
    private int driver;

    public vehicle(int vehicleId, String ChasiNo, String NoPlate, int Category, int branch, int driver, int vehicleCatId, String vehicleCategory) {
        super(vehicleCatId, vehicleCategory);
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

    public int getCategory() {
        return Category;
    }

    public void setCategory(int Category) {
        this.Category = Category;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getDriver() {
        return driver;
    }

    public void setDriver(int driver) {
        this.driver = driver;
    }

    
    

    
    
    
}