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


@Path("calc/mult")
public class CalcMult {

    @Context
    private UriInfo context;

    @GET
    @Produces("application/json")
    public String getJson(@QueryParam("a") double a, @QueryParam("b") double b) {
        try{
            return new Serializer().serialize(new Result(a*b));
        } catch(Exception e){
            return new Serializer().serialize("wrong input parameter");
        }
    }
    
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
