package com.chenyl.module.spring.test;

import com.chenyl.module.spring.model2.InstanceA;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest02 {

    @Test
    public void test01(){

        {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");


            InstanceA instanceA = context.getBean("instanceA", InstanceA.class);

            System.out.println(instanceA);

        }
    }
}
