/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.vehicle;

/**
 *
 * @author asel
 */
public interface vehicleDBUtill {
    public boolean addVehicle(vehicle vh);
    public List<vehicle> viewVehicles();
    public List<vehicle>vehicleList();
    public vehicle getVehicle(String search);
    public boolean updateVehicle(vehicle vh);
    public boolean deleteVehicle(vehicle vh);
}
