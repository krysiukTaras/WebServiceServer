package com.epam.webserviceserver.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

/**
 * REST Web Service
 *
 * @author taras
 */


@Path("calc/div")
public class CalcDiv {

    @Context
    private UriInfo context;

    public CalcDiv() {
    }

    @GET
    @Produces("application/json")
    public String getJson() {
        
        throw new UnsupportedOperationException();
    }

    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
