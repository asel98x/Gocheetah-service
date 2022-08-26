/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public abstract class vehicleCategory {
    private int vehicleCatId;
    private String vehicleCategory;

    public vehicleCategory(int vehicleCatId, String vehicleCategory) {
        this.vehicleCatId = vehicleCatId;
        this.vehicleCategory = vehicleCategory;
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
