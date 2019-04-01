package com.chenyl.module.config;

import com.chenyl.module.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig1 {

    @Bean("person1")
    public Person person(){
        return new Person("chenyl",20);
    }

}
