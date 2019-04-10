package com.chenyl.module.spring.test;

import com.chenyl.module.spring.config.BeanConfig9;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试bean的生命周期  创建 --》 初始化 --》 销毁
 *
 */
public class BeanConfig9Test {

    @Test
    public void test01(){

        {//1. 在xml中添加init-method="init" destroy-method="destroy"
            System.out.println("使用xml创建bean");
            ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("beans1.xml");
            System.out.println("IOC容器创建完成............");
            context.close();

        }

        {//2. 在config中添加@Bean(initMethod = "init",destroyMethod = "destroy")
            System.out.println("使用config创建bean");
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig9.class);

            System.out.println("IOC容器创建完成............");
            context.close();
        }
    }
}