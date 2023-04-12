package com.tms;

import com.tms.config.BeanConfig;
import com.tms.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        final UserService service = (UserService) context.getBean("userService");

        service.test();
    }

}
