package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model.Cat;
import com.chenyl.module.spring.model1.Dog;
import com.chenyl.module.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 测试@Import功能
 *
 * 其中@Import[快速给容器导入一个组件]注：@Bean有点简单，构造一个无参或有参的bean
 *     1. @Import(要导入到容器中的组件)：容器会自动注册这个组件，id默认是全类名
 *     2. ImportSelector:是一个接口，返回需要导入的组件的全类名数组
 *     3. ImportBeanDefinitionRegistrar：点进去：
 *     有个registerBeanDefinitions()，通过调用此方法可以手动添加组件到IOC容器。
 *     所有Bean的注册可以使用BeanDefinitionRegistry进行注册。
 */
@Configuration
@Import({ Cat.class,ChenylImportSelector.class,ChenylImportBeanDefinitionRegistrar.class,ChenylFactoryBean.class})
public class BeanConfig8 {

    @Bean("person")
    public Person person(){
        return new Person("person",20);
    }

    /*@Bean("chenylFactoryBean")
    public ChenylFactoryBean chenylFactoryBean(){
        return new ChenylFactoryBean();
    }*/
}
