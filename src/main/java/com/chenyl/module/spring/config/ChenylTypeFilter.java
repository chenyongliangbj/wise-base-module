package com.chenyl.module.spring.config;

import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义过滤器
 */
public class ChenylTypeFilter implements TypeFilter {

    private ClassMetadata classMetadata;
    /**
     *
     * metadataReader：读取到当前正在扫描类的信息
     * metadataReaderFactory：可以获取其他任何类的信息
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类注解的信息
        AnnotatedTypeMetadata annotatedTypeMetadata = metadataReader.getAnnotationMetadata();
        //获取目前正在扫描的类信息
        classMetadata = metadataReader.getClassMetadata();
        //获取当前类资源（类的路径）
        String className = classMetadata.getClassName();
        System.out.println("-------->"+className);

        if(className.contains("Order")){//带有order的加载
            return true;
        }
        return false;
    }
}
