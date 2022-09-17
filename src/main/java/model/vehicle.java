/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class vehicle {

    private int vehicleId;
    private String vehicleName;
    private String ChasiNo;
    private String NoPlate;
    private String Category;
    private String type;
    private String passengers;
    private String branch;
    private String driver;
    private String image;
    private String availability;

    public vehicle() {
    }

    public vehicle(int vehicleId, String vehicleName, String ChasiNo, String NoPlate, String Category, String type, String passengers, String branch, String driver, String image, String availability) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.ChasiNo = ChasiNo;
        this.NoPlate = NoPlate;
        this.Category = Category;
        this.type = type;
        this.passengers = passengers;
        this.branch = branch;
        this.driver = driver;
        this.image = image;
        this.availability = availability;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    
    
}
