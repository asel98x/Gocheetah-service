/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import model.admin;
import model.branchCategory;
import model.customer;
import model.driver;
import model.vehicle;
import model.vehicleCategory;

/**
 *
 * @author asel
 */
public interface customerDBUtill {
   public boolean customerSignup(customer cs);
   public boolean customerLogin(customer cs);
}