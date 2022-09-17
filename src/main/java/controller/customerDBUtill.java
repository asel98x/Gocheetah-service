/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.booking;
import model.customer;
import model.feedback;

/**
 *
 * @author asel
 */
public interface customerDBUtill {
   public boolean customerSignup(customer cs);
   public customer customerLogin(customer cs);
   public List<customer>customerList();
   public customer getCustomer(String search);
   public boolean updatedCustomer(customer cs);
   public boolean deleteCustomer(customer cs);
   public boolean customerFeedback(feedback fd);
   public feedback getCustomerFeedback(String search);
}
