package com.chenyl.module.spring.test;

import com.chenyl.module.spring.config.BeanConfig2_2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试@ComponentScan 扫描
 *
 * 其中：@ComponentScan只能扫描到4类：
 *       * 1.@Component
 *       * 2.@Controller
 *       * 3.@Service
 *       * 4.@Repository
 *
 * 注解@ComponentScan的参数：
 *      * FilterType
 *      * excludeFilters
 *      * includeFilters
 *      * 使用自定义TypeFilter
 */
public class BeanConfig2_2Test {

    @Test
    public void test01(){

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig2_2.class);

        System.out.println("获取spring容器中所有实例：");
        String[] names = context.getBeanDefinitionNames();
        for (String name:names) {
            System.out.println(name);
        }
    }

}