/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class vehicleCat {
    private int vehicleCatId;
    private String vehicleCategory;

    public vehicleCat(int vehicleCatId, String vehicleCategory) {
        this.vehicleCatId = vehicleCatId;
        this.vehicleCategory = vehicleCategory;
    }

    public vehicleCat() {
    }

    public int getVehicleCatId() {
        return vehicleCatId;
    }

    public void setVehicleCatId(int vehicleCatId) {
        this.vehicleCatId = vehicleCatId;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }
    
    
}
