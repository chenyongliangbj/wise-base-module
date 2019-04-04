package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model.Cat;
import com.chenyl.module.spring.model.Dog;
import com.chenyl.module.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 测试@Import功能
 */
@Configuration
@Import({Dog.class, Cat.class})
public class BeanConfig8 {

    @Bean("person")
    public Person person(){
        return new Person("person",20);
    }
}
