package com.chenyl.module.test;

import com.chenyl.module.config.BeanConfig1;
import com.chenyl.module.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  学习Spring源码
 *
 *  1、bean容器学习
 *      1）使用xml
 *      2）使用config
 *
 *  2、测试xml装配bean
 *  3、测试config装配bean
 *
 *  4、测试@Configuration+@Bean
 */
public class BeanConfig1Test {
    public static void main(String[] args){

        //使用xml方式
        {
            ApplicationContext context =  new ClassPathXmlApplicationContext("beans1.xml");
            Person person = (Person) context.getBean("person");
//            Person person = (Person) context.getBean(Person.class);
            System.out.println("使用xml方式，获取person实例");
            System.out.println(person.toString());
        }


        //使用注解方式
        {
            ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig1.class);
//            Person person = context.getBean(Person.class);
            Person person = (Person) context.getBean("person1");
            System.out.println("使用注解方式，获取person实例");
            System.out.println(person.toString());
        }
    }

}
