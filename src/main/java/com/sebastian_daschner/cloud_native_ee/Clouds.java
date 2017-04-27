package com.sebastian_daschner.cloud_native_ee;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class Clouds {

    @Inject
    CloudProcessor cloudProcessor;

    public String getClouds() {
        String forecast = cloudProcessor.getForecast();

        if (forecast == null)
            return null;

        return "sunny".equals(forecast) ? "no clouds" : "lots of clouds";
    }

}
