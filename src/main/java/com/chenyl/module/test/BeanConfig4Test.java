package com.chenyl.module.test;

import com.chenyl.module.config.BeanConfig3;
import com.chenyl.module.config.BeanConfig4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfig4Test {

    @Test
    public void test01(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig4.class);

        System.out.println("IOC容器创建完成............");

        Object person = context.getBean("person");
        System.out.println(person.toString());
    }

}