package com.chenyl.module.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Jeep implements BeanPostProcessor {

    public Jeep(){
        System.out.println("Jeep....constructor...");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Jeep....postProcessBeforeInitialization...");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Jeep....postProcessAfterInitialization...>>>>>>>>"+bean);
        return bean;
    }
}
