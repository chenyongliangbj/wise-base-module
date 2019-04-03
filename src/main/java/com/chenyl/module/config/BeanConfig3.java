package com.chenyl.module.config;

import com.chenyl.module.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 测试单实例、多实例
 */
@Configuration
public class BeanConfig3 {

    //给容器注册一个bean，类型为返回值的类型，默认为单实例

    /**
     * prototype:多实例 IOC容器启动的时候，IOC容器启动并不会去调用方法创建对象，而是每次获取的时候才会调用方法创建对象
     * singleton:单实例（默认）：IOC容器启动的时候会调用方法创建对象并放到IOC容器中
     * request:主要针对web应用，递交一次请求创建一个实例
     * session:同一个session创建一个实例
     */
    @Scope("prototype")
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person..........");
        return new Person("chenyl",20);
    }

}
