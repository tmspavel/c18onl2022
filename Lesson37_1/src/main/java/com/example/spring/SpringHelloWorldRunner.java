package com.example.spring;

import com.example.spring.model.SpringService;
import com.example.spring.model.User;
import com.example.test.JsonMarshaller;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloWorldRunner {

    public static void main(String[] args) throws Exception {

//        SpringHelloWorld world = new SpringHelloWorld("sdfsdf");
//        System.out.println(world.getHelloMessage());
        User user = new User();
        System.out.println(user);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-hello-bean.xml");
        try (context) {
            SpringService springService = (SpringService) context.getBean("springService");
            System.out.println(springService.getJsonMarshaller().marshal(new User()));

            JsonMarshaller jsonMarshaller = context.getBean("jsonMarshaller", JsonMarshaller.class);
            String body = jsonMarshaller.marshal(context.getBean("user", User.class));
            System.out.println(body);
            System.out.println(jsonMarshaller.unmarshal(body));
//            if (context != null) {
//                context.close();
//            }
        }
    }
}
