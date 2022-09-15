/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;

import java.util.List;
import model.destination;

/**
 *
 * @author asel
 */
public interface destinationDBUtil {
    public boolean addDstination(destination ds);
    public List<destination> viewDstination();
    public List<destination>DstinationList();
    public destination getDstination(String search);
    public boolean updateDstination(destination vh);
    public boolean deleteDstination(destination vh);
    public destination getDistance(String pick, String drop);
    public destination getLocations(String search);
}
