package com.math.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class, AnotherConfigApp.class);

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();//we use bean from application context

        String str = container.getBean(String.class);
        Integer integer = container.getBean(Integer.class);

        System.out.println(str + " and integer ="+ integer );
    }
}
