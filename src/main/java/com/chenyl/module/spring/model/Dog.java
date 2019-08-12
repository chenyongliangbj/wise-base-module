package com.chenyl.module.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    public Dog(){
        System.out.println("Dog constructor...........");
    }

    public void init(){
        System.out.println("Dog init..........");
    }

    public void destroy(){
        System.out.println("Dog destroy..........");
    }
}
