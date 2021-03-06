package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * 测试懒加载
 */
@Configuration
public class BeanConfig4 {

    //给容器注册一个bean，类型为返回值的类型，默认为单实例

    /**
     * 懒加载：主要针对单实例bean：默认在容器启动的时候创建对象
     * 懒加载：容器启动时候不创建对象，仅当第一次使用bean时候创建对象
     */
    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加person..........-");
        return new Person("chenyl",20);
    }

}
