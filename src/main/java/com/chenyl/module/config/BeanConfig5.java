package com.chenyl.module.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 测试带有@Component注解的自动装配
 */
@Configuration
@ComponentScan(value = "com.chenyl.module.model")
public class BeanConfig5 {

}
