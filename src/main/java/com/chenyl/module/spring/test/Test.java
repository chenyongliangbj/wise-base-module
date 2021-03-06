package com.chenyl.module.spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.beans.factory.support.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.AbstractRefreshableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.SpringServletContainerInitializer;
import org.springframework.web.context.ConfigurableWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {

    public static void main(String[] args){

        //获取bean的实例
        BeanFactory beanFactory;
        ConfigurableBeanFactory configurableBeanFactory;


        //注册bean的实例
        SingletonBeanRegistry singletonBeanRegistry;
        FactoryBeanRegistrySupport factoryBeanRegistrySupport;

        //IOC
        AbstractBeanFactory abstractBeanFactory;


        ApplicationContext applicationContext;

        AbstractApplicationContext abstratApplicationContext;


        SpringServletContainerInitializer ss;

        XmlWebApplicationContext a;

        AnnotationConfigApplicationContext anotationConfigApplicationContext;

        AbstractRefreshableApplicationContext abstractRefreshableApplicationContext;

        ConfigurableBeanFactory configurableBeanFactory1;

        BeanDefinitionRegistry beanDefinitionRegistry;

        BeanFactory beanFactory1;

        SimpleBeanDefinitionRegistry simpleBeanDefinitionRegistry;

        DefaultListableBeanFactory defaultListableBeanFactory;

        GenericApplicationContext genericApplicationContext;

        ConfigurableWebApplicationContext applicationContext1;

        ConfigurableListableBeanFactory configurableListableBeanFactory;

        AbstractAutowireCapableBeanFactory abstractAutowireCapableBeanFactory;

    }
}

