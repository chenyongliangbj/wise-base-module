package com.chenyl.module.test;

import com.chenyl.module.config.BeanConfig3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试@Scope("prototype")
 */
public class BeanConfig3Test {

    @Test
    public void test01(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig3.class);

        System.out.println("IOC容器创建完成............");

        System.out.println("获取spring容器中所有实例：");
        String[] names = context.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
        //测试多实例
        Object person1 = context.getBean("person");
        Object person2 = context.getBean("person");
        System.out.println(person1 == person2);
    }

}