package com.math.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfigApp {

    @Bean
    String str(){
        return "Spring String Example";
    }

    @Bean
    Integer integer(){
        return 100;
    }
}
