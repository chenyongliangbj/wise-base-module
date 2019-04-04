package com.chenyl.module.spring.config;

import com.chenyl.module.spring.model.Fish;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class ChenylImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata:当前类的注解信息
     * BeanDefinitionRegistry：BeanDefinition注册类
     *      把所有需要添加到容器的bean
     *
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean definition1 = registry.containsBeanDefinition("com.chenyl.module.spring.model.Dog");
        boolean definition2 = registry.containsBeanDefinition("com.chenyl.module.spring.model.Cat");
        //如果注册的组件中存在Dog和cat就注册Fish
        if(definition1 && definition2){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(Fish.class);
            //注册一个叫fish的bean
            registry.registerBeanDefinition("fish",beanDefinition);

        }

    }
}
