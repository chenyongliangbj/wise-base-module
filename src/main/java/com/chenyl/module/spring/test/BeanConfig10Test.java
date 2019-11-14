package com.chenyl.module.spring.test;

import com.chenyl.module.spring.config.BeanConfig10;
import com.chenyl.module.spring.model1.PersonScan;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试bean的生命周期  创建 --》 初始化 --》 销毁
 *
 */
public class BeanConfig10Test {

    @Test
    public void test01(){

        {
            System.out.println("使用config创建bean");
            AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig10.class);

            System.out.println("IOC容器创建完成............");

            PersonScan personScan = context.getBean("personScan",PersonScan.class);

            System.out.println(personScan);

            context.close();
        }
    }
}