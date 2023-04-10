package com.example.test;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class JsonMarshaller {

    private ObjectMapper mapper;

    @PostConstruct
    public void init() {
        System.out.println("init");
        mapper = new ObjectMapper().setSerializationInclusion(Include.NON_NULL)
                                   .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                                   .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                                   .configure(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false);
    }

    public String marshal(Object body) throws Exception {
        return mapper.writeValueAsString(body);
    }

    public Object unmarshal(String body) throws Exception {
        Object result = mapper.readValue(body, Object.class);
        return result;
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy");
    }
}
