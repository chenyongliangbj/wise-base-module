package com.chenyl.module.spring.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class Test001 {

    @Value("jdbc.url")
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public static void main(String[] args){
//        ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        Test001 test001 = new Test001();


        System.out.println(test001.getString());
    }
}
