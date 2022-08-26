/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class customer extends person{

    private int customerId;

    public customer(int customerId) {
        this.customerId = customerId;
    }

    public customer(int customerId, String pWord, String name, String address, int mobile, String nic, String dob, int age, String email, String branch, String password) {
        super(name, address, mobile, nic, dob, age, email, branch, password);
        this.customerId = customerId;
    }

    
    
    public customer(){
        this.customerId = 1;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

     
    
}
