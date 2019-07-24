package com.chenyl.module.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 扫描ComponentScan
 */
@Configuration
@ComponentScan(value = "com.chenyl.module.spring.service")
public class BeanConfig2_1 {

    /**
     * FilterType类型
     * 1. ANNOTATION 通过注解类型 列如 @Controller为Controller.class @Service 为 Service.class
     * 2. ASSIGNABLE_TYPE 一组具体类 例如PersonController.class
     * 3. ASPECTJ 一组表达式,使用Aspectj表达式命中类
     * 4. REGEX 一组表达式,使用正则命中类
     * 5. CUSTOM 自定义的TypeFilter
     */

    /**
     * excludeFIlters = Filter[] 根据规则排除组件
     *
     * includeFIlters = Filter[]根据规则只包含哪些组件（ps：useDefaultFilters设置为false）
     */

    /**
     * 如果includeFilters，useDefaultFilters = true时，会把@Controller、@Service、@Respostry、@Component都扫描进来。
     */


    /**
     * @ComponentScan只能扫描到4类：
     * 1.@Component
     * 2.@Controller
     * 3.@Service
     * 4.@Repository
     */
}
