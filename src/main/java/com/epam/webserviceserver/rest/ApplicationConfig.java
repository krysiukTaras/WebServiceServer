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

    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.epam.webserviceserver.rest.CalcAdd.class);
        resources.add(com.epam.webserviceserver.rest.CalcCos.class);
        resources.add(com.epam.webserviceserver.rest.CalcDiv.class);
        resources.add(com.epam.webserviceserver.rest.CalcMult.class);
        resources.add(com.epam.webserviceserver.rest.CalcSin.class);
        resources.add(com.epam.webserviceserver.rest.CalcSub.class);
        resources.add(org.glassfish.jersey.client.filter.HttpDigestAuthFilter.class);
        resources.add(org.glassfish.jersey.server.wadl.internal.WadlResource.class);
    }
    
}
