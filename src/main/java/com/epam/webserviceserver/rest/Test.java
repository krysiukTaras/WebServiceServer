/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.webserviceserver.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Taras_Krysiuk
 */
@Path("generic")
public class Test {

    @Context
    private UriInfo context;

    public Test() {
    }

    @GET
    @Produces("application/json")
    public String getJson(@QueryParam("name") String name) {
        switch(name){
            case "1":
                return "sdasdasdasd";
            case "2":
                return "second";
            case "3":
                return " case 3";
        }
        throw new UnsupportedOperationException();
    }

    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
