package com.chenyl.module.spring.model1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * 测试自动配置bean，@Component
 */
@Component
public class PersonScan {

    @Autowired
    private Dog dog;

    private String name;
    private Integer age;

    public PersonScan(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public PersonScan() {
        this.name = "chenyl";
        this.age = 20;
    }

    public void init(){
        System.out.println("PersonScan init..........");
    }

    public void destroy(){
        System.out.println("PersonScan destroy..........");
    }


    public void liuDog(){

        System.out.println(dog);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonScan person = (PersonScan) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "PersonScan{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
