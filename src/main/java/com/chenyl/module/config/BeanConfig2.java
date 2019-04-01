package com.chenyl.module.config;

import com.chenyl.module.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value = "com.chenyl.module",excludeFilters =  {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
public class BeanConfig2 {

    @Bean("person2")
    public Person person(){
        return new Person("chenyl",20);
    }
}
