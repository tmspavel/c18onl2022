package com.tms;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        {
            Car car = (Car) ctx.getBean("car");
            System.out.println(car.getModel());
            System.out.println(car.getEngine().getVersion());
        }

        {

            Car2 car = (Car2) ctx.getBean("car2");
//            System.out.println(car.getModel());
            car.run();
        }

        {
            Car3 car = (Car3) ctx.getBean("car3");
            System.out.println(car.getModel());
            System.out.println(car.getEngine().getVersion());
        }
    }
}
