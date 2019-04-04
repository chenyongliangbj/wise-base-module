package com.chenyl.module.spring.config;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 条件注册bean
 */
public class WinCondition implements Condition {

    /**
     * ConditionContext:判断条件能使用的上下文环境
     * AnnotatedTypeMetadata：注释信息
     *
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否是Linux系统
        //1.能获取到IOC使用的beanFactory
        ConfigurableBeanFactory beanFactory = context.getBeanFactory();
        //2. 获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //3. 获取当前环境信息
        Environment environment = context.getEnvironment();
        //4. 获取Bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        String property =   environment.getProperty("os.name");
        if(property.contains("Windows")){
            return true;
        }
        return false;
    }
}
