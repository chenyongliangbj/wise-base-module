package com.chenyl.module.spring.test;

import com.chenyl.module.spring.config.BeanConfig1;
import com.chenyl.module.spring.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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