package com.chenyl.module.java;

import com.chenyl.module.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    public static void main(String[] args){

        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
        Person person = (Person) context.getBean("person2");
        System.out.println(person.toString());
    }

}
