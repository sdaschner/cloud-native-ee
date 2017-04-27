package com.sebastian_daschner.cloud_native_ee;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class CloudProcessor {

    private WebTarget target;

    @PostConstruct
    private void init() {
        target = ClientBuilder.newClient().target("http://cloud-processor:8080/cloud-processor/resources/forecast/extensive");
    }

    public String getForecast() {
        Response response = target.request().get();

        if (response.getStatusInfo().getFamily() != Response.Status.Family.SUCCESSFUL)
            return null;

        return response.readEntity(String.class);
    }

}
