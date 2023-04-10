package com.tms;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    private String model = "Kia Rio X-Line";

    private Engine engine;

    @Resource
    private ObjectMapper objectMapper;

    @Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
