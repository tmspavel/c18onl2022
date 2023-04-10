package com.tms;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Car2 {

    private final Engine engine;
    private final ObjectMapper objectMapper;

    void run() {
        System.out.println(engine.getVersion());
    }
}
