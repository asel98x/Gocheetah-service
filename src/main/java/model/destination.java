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
    private String dBranch;
    private String dPickup;
    private String dDrop;
    private int distance;

    public destination() {
    }

    public destination(int destinationID, String dBranch, String dPickup, String dDrop, int distance) {
        this.destinationID = destinationID;
        this.dBranch = dBranch;
        this.dPickup = dPickup;
        this.dDrop = dDrop;
        this.distance = distance;
    }

    public int getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(int destinationID) {
        this.destinationID = destinationID;
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

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

   
    
    
}
