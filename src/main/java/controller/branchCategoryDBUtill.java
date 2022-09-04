/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.branchCategory;

/**
 *
 * @author asel
 */
public interface branchCategoryDBUtill {
    public boolean addBranch(branchCategory bn);
    public List<branchCategory> viewBranches();
    public List<branchCategory>branchesList();
    public branchCategory getBranch(int id);
    public boolean updatedBranch(branchCategory bn);
}
