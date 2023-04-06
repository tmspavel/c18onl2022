package com.example.spring;

import com.example.spring.model.SpringHelloWorld;
import com.example.spring.model.User;
import com.example.test.JsonMarshaller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {

    public static void main(String[] args) throws Exception {

//        SpringHelloWorld world = new SpringHelloWorld("sdfsdf");
//        System.out.println(world.getHelloMessage());
        User user = new User("Ivan");
        System.out.println(user);

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml")) {
            SpringHelloWorld helloWorld = (SpringHelloWorld) context.getBean("springHelloWorld");
            System.out.println(helloWorld.getHelloMessage());

            JsonMarshaller jsonMarshaller = context.getBean("jsonMarshaller", JsonMarshaller.class);
            String body = jsonMarshaller.marshal(new User("Ivan"));
            System.out.println(body);
            System.out.println(jsonMarshaller.unmarshal(body));
        }
    }
}
