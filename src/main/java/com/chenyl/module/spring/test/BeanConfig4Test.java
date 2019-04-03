package com.chenyl.module.spring.test;

import com.chenyl.module.spring.config.BeanConfig4;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试@Lazy 懒加载
 */
public class BeanConfig4Test {

    @Test
    public void test01(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig4.class);

        System.out.println("IOC容器创建完成............");

        System.out.println("获取spring容器中所有实例：");
        String[] names = context.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }

        Object person = context.getBean("person");
        System.out.println(person.toString());
    }

}