package com.sebastian_daschner.cloud_native_ee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.time.Instant;

@Path("hello")
public class HelloResource {

    @GET
    public String hello() {
        return "Hello World, " + Instant.now();
    }

}
