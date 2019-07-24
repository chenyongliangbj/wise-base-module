package com.chenyl.module.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * 扫描,只使用includeFilters，没有设置useDefaultFilters = false，则includeFilters不生效
 */
@Configuration
@ComponentScan(value = "com.chenyl.module.spring",includeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
public class BeanConfig2_2 {

    /**
     * excludeFIlters = Filter[] 根据规则排除组件
     *
     * includeFIlters = Filter[]根据规则只包含哪些组件（ps：useDefaultFilters设置为false）
     */

    /**
     *
     * FilterType.ANNOTATION  注解类型：Controller.class, Service.class,Configuration.class, Component.class
     *
     * Component.class 包含：Controller.class, Service.class,Configuration.class
     **/
    /**
     * 如果includeFilters，useDefaultFilters = true时，会把@Controller、@Service、@Respostry、@Component都扫描进来。
     */
}
