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
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int customerMobile;
    private String customerEmail;
    private String branch;
    private int driverId;
    private int vehicleId;
    private String pickup;
    private String drop;
    private Float price;
    private String time;
    private String date;
    private String acception;

    public booking() {
    }

    public booking(int id, int customerId, String customerName, String customerAddress, int customerMobile, String customerEmail, String branch, int driverId, int vehicleId, String pickup, String drop, Float price, String time, String date, String acception) {
        this.id = id;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerMobile = customerMobile;
        this.customerEmail = customerEmail;
        this.branch = branch;
        this.driverId = driverId;
        this.vehicleId = vehicleId;
        this.pickup = pickup;
        this.drop = drop;
        this.price = price;
        this.time = time;
        this.date = date;
        this.acception = acception;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(int customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
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

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
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

    public String getAcception() {
        return acception;
    }

    public void setAcception(String acception) {
        this.acception = acception;
    }

    
    
    
    
    
}
