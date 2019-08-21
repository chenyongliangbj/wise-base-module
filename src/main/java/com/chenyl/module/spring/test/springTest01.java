package com.chenyl.module.spring.test;

import com.chenyl.module.spring.model1.PersonScan;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest01 {

    @Test
    public void test01(){

        {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


            PersonScan personScan = context.getBean("personScan",PersonScan.class);

            personScan.liuDog();

        }
    }
}
