package com.sebastian_daschner.cloud_native_ee;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.ServiceUnavailableException;

@Path("clouds")
public class CloudResource {

    @Inject
    Clouds clouds;

    @GET
    public String getClouds() {
        String clouds = this.clouds.getClouds();

        if (clouds == null)
            throw new ServiceUnavailableException();

        return clouds;
    }

}
