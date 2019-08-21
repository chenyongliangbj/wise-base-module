package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model1.Dog;
import com.chenyl.module.spring.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 测试bean的生命周期  创建 --》 初始化 --》 销毁
 *
 */
@Configuration
public class BeanConfig9 {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Dog dog(){
        return new Dog();
    }


}
