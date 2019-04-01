package com.chenyl.module.config;

import com.chenyl.module.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 简单测试注册Bean
 */
@Configuration
public class BeanConfig1 {

    @Bean("person1")
    public Person person(){
        return new Person("chenyl",20);
    }

}
