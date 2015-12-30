package com.epam.webserviceserver.rest;

import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;


import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;


@Path("calc/add")
public class CalcAdd {

    @Context
    private UriInfo context;

    @GET
    @Produces("application/json")
    public String getJson(@QueryParam("name") String name, @QueryParam("b") String b) {
       switch(name){
            case "1":
                return "sdasdasdasd" + b;
            case "2":
                return "second" + b;
            case "3":
                return " case 3" + b;
       }
        throw new UnsupportedOperationException();
    }

    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
