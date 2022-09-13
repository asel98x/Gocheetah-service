/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class destination {
    private int destinationID;
    private String dVehicle;
    private String dBranch;
    private String dPickup;
    private String dDrop;
    private float dPrice;

    public destination() {
    }

    public destination(int destinationID, String dVehicle, String dBranch, String dPickup, String dDrop, float dPrice) {
        this.destinationID = destinationID;
        this.dVehicle = dVehicle;
        this.dBranch = dBranch;
        this.dPickup = dPickup;
        this.dDrop = dDrop;
        this.dPrice = dPrice;
    }

    public int getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(int destinationID) {
        this.destinationID = destinationID;
    }

    public String getdVehicle() {
        return dVehicle;
    }

    public void setdVehicle(String dVehicle) {
        this.dVehicle = dVehicle;
    }

    public String getdBranch() {
        return dBranch;
    }

    public void setdBranch(String dBranch) {
        this.dBranch = dBranch;
    }

    public String getdPickup() {
        return dPickup;
    }

    public void setdPickup(String dPickup) {
        this.dPickup = dPickup;
    }

    public String getdDrop() {
        return dDrop;
    }

    public void setdDrop(String dDrop) {
        this.dDrop = dDrop;
    }

    public float getdPrice() {
        return dPrice;
    }

    public void setdPrice(float dPrice) {
        this.dPrice = dPrice;
    }

    
    
}
