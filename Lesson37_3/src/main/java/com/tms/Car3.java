package com.tms;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;


@Component
public class Car3 {

    private String model = "Kia Rio X-Line";

    private final Engine engine;
    private final ObjectMapper objectMapper;

    public Car3(Engine engine, ObjectMapper objectMapper) {
        this.engine = engine;
        this.objectMapper = objectMapper;
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
