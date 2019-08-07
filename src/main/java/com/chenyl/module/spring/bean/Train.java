package com.chenyl.module.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Train implements InitializingBean , DisposableBean {

    public Train(){
        System.out.println("Train....constructor...");
    }

    //在容器创建时调用
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train....afterPropertiesSet...");
    }

    /**
     * 定义销毁逻辑
     * Method destroy
     * @author Chenyl
     * @date 2019/8/7 17:08
     **/
    @Override
    public void destroy() throws Exception {
        System.out.println("Train....destroy...");
    }
}
