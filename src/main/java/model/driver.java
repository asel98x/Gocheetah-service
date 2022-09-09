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

    private int driverID;

    public driver() {
    }

    public driver(int driverID, String name, String address, int mobile, String nic, String dob, int age, String email, String branch, String password) {
        super(name, address, mobile, nic, dob, age, email, branch, password);
        this.driverID = driverID;
    }

    public int getDriverID() {
        return driverID;
    }

    public void setDriverID(int driverID) {
        this.driverID = driverID;
    }

    
    
    

    
    

 

    

    
    
    
    
}
