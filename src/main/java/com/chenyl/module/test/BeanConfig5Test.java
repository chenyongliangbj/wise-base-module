package com.chenyl.module.test;

import com.chenyl.module.config.BeanConfig5;
import com.chenyl.module.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试自动装配
 * 1、@ComponentScan注解启动了组件扫描
 * 2、通过XML启动组件扫描
 */
public class BeanConfig5Test {
    public static void main(String[] args){

        //使用xml方式
        {
            ApplicationContext context =  new ClassPathXmlApplicationContext("beans2.xml");

            System.out.println("获取spring容器中所有实例：");
            String[] names = context.getBeanDefinitionNames();
            for (String name:names) {
                System.out.println(name);
            }

        }


        //使用注解方式
        {
            ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig5.class);

            System.out.println("IOC容器创建完成............");

            System.out.println("获取spring容器中所有实例：");
            String[] names = context.getBeanDefinitionNames();
            for (String name:names) {
                System.out.println(name);
            }

            Object person = context.getBean("personScan");
            System.out.println(person.toString());
        }
    }

}