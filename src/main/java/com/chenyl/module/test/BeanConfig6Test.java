package com.chenyl.module.test;

import com.chenyl.module.config.BeanConfig1;
import com.chenyl.module.config.BeanConfig4;
import com.chenyl.module.config.BeanConfig5;
import com.chenyl.module.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试@Autowired
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig1.class)
public class BeanConfig6Test {

    @Autowired
    private Person person;

    @Test
    public void test01(){
        System.out.println(person.toString());
    }
}