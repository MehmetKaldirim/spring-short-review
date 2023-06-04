package com.math.stereotype_annotation;

import com.math.bean_annotation.FullTimeMentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StereoApp {
    public static void main(String[] args) {
        ApplicationContext container =  new AnnotationConfigApplicationContext(ConfigCourse.class);

        Java java = container.getBean(Java.class);
        java.getTeachingHours();

        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();
    }
}
