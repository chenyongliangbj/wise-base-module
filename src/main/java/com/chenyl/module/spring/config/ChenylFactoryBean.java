package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model.Dog;
import org.springframework.beans.factory.FactoryBean;

public class ChenylFactoryBean implements FactoryBean<Dog> {
    @Override
    public Dog getObject() throws Exception {
        return new Dog();
    }

    @Override
    public Class<?> getObjectType() {
        return Dog.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
