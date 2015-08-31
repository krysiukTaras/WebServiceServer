/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.webserviceserver.soap;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Taras_Krysiuk
 */
@WebService(serviceName = "Calculator")
public class Calculator {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public long add(@WebParam(name = "a") long a, @WebParam(name = "b") long b) {
        //TODO write your implementation code here:
        return 0;
    }
}
