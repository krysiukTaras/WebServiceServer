package com.epam.webserviceserver.rest;

import com.epam.webserviceserver.rest.model.Result;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author taras
 */


@Path("calc/sin")
public class CalcSin {

    @Context
    private UriInfo context;
    
    @GET
    @Produces("application/json")
    public String getJson(@QueryParam("a") double a) {
        try{
            return new Serializer().serialize(new Result(Math.sin(a)));
        } catch(Exception e){
            return new Serializer().serialize("wrong input parameter");
        }
    }
    
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
