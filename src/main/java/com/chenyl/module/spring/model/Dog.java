package com.chenyl.module.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;
    private Integer age;

    public Dog() {
        this.name = "guolin";
        this.age = 28;
        System.out.println("Dog constructor...........");
    }

    public void init(){
        System.out.println("Dog init..........");
    }

    public void destroy(){
        System.out.println("Dog destroy..........");
    }
}
