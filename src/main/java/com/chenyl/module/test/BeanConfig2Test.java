package com.chenyl.module.test;

import com.chenyl.module.config.BeanConfig2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanConfig2Test {

    @Test
    public void test01(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2.class);

        System.out.println("获取spring容器中所有实例：");
        String[] names = context.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }

}