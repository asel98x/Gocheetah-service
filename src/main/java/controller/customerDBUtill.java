/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.customer;

/**
 *
 * @author asel
 */
public interface customerDBUtill {
   public boolean customerSignup(customer cs);
   public boolean customerLogin(customer cs);
   public List<customer>customerList();
   public customer getCustomer(int id);
   public boolean updatedCustomer(customer cs);
   public boolean deleteCustomer(customer cs);
}
