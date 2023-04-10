package com.example.spring.model;

import com.example.test.JsonMarshaller;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Getter
@Component
@RequiredArgsConstructor
public class SpringService {

    private final JsonMarshaller jsonMarshaller;
    private final User user;

}
