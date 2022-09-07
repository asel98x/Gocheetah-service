/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public class admin extends person{

    private int adminId;
    private String type;

    public admin() {
    }

    public admin(int adminId, String type, String name, String address, int mobile, String nic, String dob, int age, String email, String branch, String password) {
        super(name, address, mobile, nic, dob, age, email, branch, password);
        this.adminId = adminId;
        this.type = type;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    
    
    
   

    
    

    
    

    
}
