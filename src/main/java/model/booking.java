/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class booking {
    private int id;
    private String customerId;
    private String pickup;
    private String drop;
    private Float price;
    private int vehicleId;
    private String branch;
    private int driverId;
    private String acception;
    private String time;
    private String date;
    

    public booking() {
    }

    public booking(int id, String customerId, String pickup, String drop, Float price, int vehicleId, String branch, int driverId, String acception, String time, String date) {
        this.id = id;
        this.customerId = customerId;
        this.pickup = pickup;
        this.drop = drop;
        this.price = price;
        this.vehicleId = vehicleId;
        this.branch = branch;
        this.driverId = driverId;
        this.acception = acception;
        this.time = time;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getAcception() {
        return acception;
    }

    public void setAcception(String acception) {
        this.acception = acception;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    

    
    

    
    
    
    
    
}
