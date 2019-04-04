package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 简单@Conditional 条件注册bean
 */
@Configuration
public class BeanConfig7 {

    @Bean("person")
    public Person person(){
        return new Person("person",20);
    }

    @Conditional({WinCondition.class})
    @Bean("chenyl")
    public Person chenyl(){
        return new Person("chenyl",20);
    }

    @Conditional({LinuxCondition.class})
    @Bean("guolin")
    public Person guolin(){
        return new Person("guolin",50);
    }

    @Conditional({LinuxCondition.class,WinCondition.class})
    @Bean("duxl")
    public Person duxl(){
        return new Person("duxl",50);
    }
}
