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

    @WebMethod(operationName = "addition")
    public double addition(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a+b;
    }

    @WebMethod(operationName = "multiply")
    public double multiply(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a*b;
    }
    
    @WebMethod(operationName = "subtraction")
    public double subtraction(@WebParam(name = "a") double a, @WebParam(name = "b")double b){
        return a-b;
    }
    
    @WebMethod(operationName = "division")
    public double division(@WebParam(name = "a") double a, @WebParam(name = "b") double b){
        return a/b;
    }
    
    @WebMethod(operationName = "cos")
    public double cos(@WebParam(name = "a")double a){
        return Math.cos(a);
    }
    
    @WebMethod(operationName = "sin")
    public double sin(@WebParam(name = "a") double a){
        return Math.sin(a);
    }
}
