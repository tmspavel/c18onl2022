package com.example.spring.config;

import com.example.spring.model.SpringHelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringHelloWoldConfig {

    @Autowired
    private Environment env;

    @Bean
    public SpringHelloWorld springHelloWorld(String test) {
        return new SpringHelloWorld();
    }

    @Bean(name = "message")
    public String helloMessage() {
        return env.getProperty("hello.world");
    }

    @Bean
    public String test() {
        return env.getProperty("db.url");
    }
}
