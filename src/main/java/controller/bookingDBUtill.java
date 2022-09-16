/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controller;
import java.util.List;
import model.booking;
/**
 *
 * @author asel
 */
public interface bookingDBUtill {
    public boolean addBooking(booking bk);
    public List<booking>bookingList();
    public booking getbooking(String date, String branch);
    public boolean updateBooking(booking bk);
}
