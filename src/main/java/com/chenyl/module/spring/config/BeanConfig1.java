package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 简单测试注册Bean
 */
@Configuration
public class BeanConfig1 {

    @Bean("person")
    public Person person(){
        return new Person("chenyl",20);
    }

    @Bean("person1")
    public Person person1(){
        return new Person("malh",21);
    }

    @Bean("person2")
    public Person person2(){
        return new Person("guolin",30);
    }
}
