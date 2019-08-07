package com.chenyl.module.spring.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bike{

    public Bike(){
        System.out.println("Bike....constructor...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Bike....@PostConstruct...");
    }

    @PreDestroy
    public void destroy (){
        System.out.println("Bike....@PreDestroy...");
    }
}
