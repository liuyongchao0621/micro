package com.shine.micro.test.juit;

import com.shine.micro.test.operation.JuiceMaker1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test/spring-test-context.xml");

        context.start();







        JuiceMaker1 juiceMaker1 = (JuiceMaker1) context.getBean("beanJuice");


        juiceMaker1.mix();
        context.close();

    }
}
