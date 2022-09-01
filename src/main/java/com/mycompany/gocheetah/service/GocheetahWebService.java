/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package com.mycompany.gocheetah.service;

import db.MySQLUtill;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.customer;
import controller.customerDBUtill;

/**
 *
 * @author asel
 */
@WebService(serviceName = "GocheetahWebService")
public class GocheetahWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "customerSignup")
    public boolean customerSignup(@WebParam(name = "cs") customer cs){
        customerDBUtill util = new MySQLUtill();
        return util.customerSignup(cs);
    }
    
    @WebMethod(operationName = "customerLogin")
    public boolean customerLogin(@WebParam(name = "cs") customer cs){
        customerDBUtill util = new MySQLUtill();
        return util.customerLogin(cs);
    }
}
