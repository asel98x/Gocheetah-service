/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.admin;

/**
 *
 * @author asel
 */
public interface adminDBUtill {
    public boolean adminLogin(admin ad);
    public boolean addAdmin(admin ad);
    public List<admin>AdminList();
   public admin getAdmin(String search);
   public boolean updateAdmin(admin ad);
   public boolean deleteAdmin(admin ad);
}
