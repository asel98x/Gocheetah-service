/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class driver extends person{

    private int vehicleId;

    public driver() {
    }

    
    
    public driver(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public driver(int vehicleId, String name, String address, int mobile, String nic, String dob, int age, String email, String branch, String password) {
        super(name, address, mobile, nic, dob, age, email, branch, password);
        this.vehicleId = vehicleId;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    
    

 

    

    
    
    
    
}
