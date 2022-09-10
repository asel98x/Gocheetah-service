/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.driver;
import model.vehicle;

/**
 *
 * @author asel
 */
public interface driverDBUtill {
    public boolean driverLogin(driver dr);
    public boolean addDriver(driver dr);
    public List<driver>DriverList();
    public driver getDriver(String search);
    public boolean updateDriver(driver dr);
    public boolean deleteDriver(driver dr);
    public List<vehicle>findDriverVehicleList(String search);
}
