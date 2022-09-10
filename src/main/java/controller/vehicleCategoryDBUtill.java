/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;


import java.util.List;
import model.vehicleCat;


/**
 *
 * @author asel
 */
public interface vehicleCategoryDBUtill {
    public boolean addVehicleCategory(vehicleCat vc);
    public List<vehicleCat> viewVehicleCateories();
    public List<vehicleCat>vehicleCategoryList();
    public vehicleCat getVehicleCategoryh(String search);
    public boolean updatedVehicleCategory(vehicleCat vc);
    public boolean deleteVehicleCategory(vehicleCat vc);
}
