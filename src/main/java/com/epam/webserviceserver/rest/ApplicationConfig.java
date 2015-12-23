/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.webserviceserver.rest;

/**
 *
 * @author Taras_Krysiuk
 */
import java.util.Set;
import javax.ws.rs.core.Application;

@javax.ws.rs.ApplicationPath("restAPI")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.epam.webserviceserver.rest.Calc.class);
        resources.add(com.epam.webserviceserver.rest.Test.class);
        resources.add(com.epam.webserviceserver.rest.temp.class);
        resources.add(org.glassfish.jersey.client.filter.HttpDigestAuthFilter.class);
        resources.add(org.glassfish.jersey.server.wadl.internal.WadlResource.class);
    }
    
}