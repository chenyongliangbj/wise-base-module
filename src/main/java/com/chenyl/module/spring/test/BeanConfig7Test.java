package com.chenyl.module.spring.test;

import com.chenyl.module.spring.config.BeanConfig7;
import com.chenyl.module.spring.model.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * 测试@Conditional 条件注册bean
 */
public class BeanConfig7Test {

    @Test
    public void test01(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig7.class);

        System.out.println("IOC容器创建完成............");

        System.out.println("获取spring容器中所有实例：");
        String[] names = context.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }

        Map<String, Person> beans = context.getBeansOfType(Person.class);
        System.out.println(beans.toString());
    }
}