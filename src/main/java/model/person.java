/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author asel
 */
public abstract class person {
    
    private String name;
    private String address;
    private int mobile;
    private String nic;
    private String dob;
    private int age;
    private String email;
    private String branch;
    private String password;

    public person(){
        this.name = "";
        this.address = "";
        this.mobile = 1;
        this.nic = "";
        this.dob = "";
        this.age = 1;
        this.email = "";
        this.branch = "";
        this.password = "";
    }
    
    public person(String name, String address, int mobile, String nic, String dob, int age, String email, String branch, String password) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.nic = nic;
        this.dob = dob;
        this.age = age;
        this.email = email;
        this.branch = branch;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    
    
    
}

