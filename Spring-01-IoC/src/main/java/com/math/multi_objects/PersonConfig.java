package com.math.multi_objects;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfig {

    //@Bean(name="p1")
    @Bean
    @Primary
    Person per1(){
        Person p = new Person();
        p.setMake("Memocan");
        return p;
    }

    //@Bean(name="p2")
    @Bean
    Person per2(){
        Person p = new Person();
        p.setMake("Tako");
        return p;
    }
}
