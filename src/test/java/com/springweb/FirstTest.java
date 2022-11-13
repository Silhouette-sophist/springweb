package com.springweb;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {

    @Test
    public void testIoc(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springmvc.xml");
        Object springController = applicationContext.getBean("springController");
        System.out.println(springController);
    }
}
