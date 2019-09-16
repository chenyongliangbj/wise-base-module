package com.chenyl.module.spring.model2;

import org.springframework.stereotype.Component;

@Component
public class InstanceA {

    private String name;

    private Integer age;

    private InstanceB instanceB;

    InstanceA(){
        name = "chenyl";
        age = 20;
    }
}
