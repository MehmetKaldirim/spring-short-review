package com.math.multi_objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MultiApp {

    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(PersonConfig.class);

        //Person p1 =  container.getBean("p2",Person.class);
        Person p1 =  container.getBean(Person.class);
        System.out.println(p1.getMake());
    }
}
