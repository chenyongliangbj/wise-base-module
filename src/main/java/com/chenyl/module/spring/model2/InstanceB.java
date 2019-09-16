package com.chenyl.module.spring.model2;

import org.springframework.stereotype.Component;

@Component
public class InstanceB {

    private String name;

    private Integer age;

    private InstanceA instanceA;

    InstanceB(){
        name = "guLi";
        age = 29;
    }
}
