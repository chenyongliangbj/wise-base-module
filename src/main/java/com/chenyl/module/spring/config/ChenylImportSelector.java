package com.chenyl.module.spring.config;

import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class ChenylImportSelector implements ImportSelector {

    /**
     * ImportSelector可以批量导入组件的全类名数组
     *
     *  AnnotationMetadata:当前标注@Import注解类的所有注解信息，不止能获取到@Import注解信息，还能获取到其他注解
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.chenyl.module.spring.model.Fish","com.chenyl.module.spring.model.Tiger"};
    }
}
