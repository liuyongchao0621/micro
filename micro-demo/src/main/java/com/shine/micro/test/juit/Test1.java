package com.shine.micro.test.juit;

import com.shine.micro.test.operation.JuiceMaker1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test/spring-test-context.xml");

        context.start();

//        JuiceMaker juiceMaker = context.getBean("juices",JuiceMaker.class);
//
//        juiceMaker.mix();

        ApplicationContext context1 = new ClassPathXmlApplicationContext("test/spring-test-context.xml");

//        BeanFactoryAware


//        BeanFactory factory ;//= new



        ((ClassPathXmlApplicationContext) context1).start();

        JuiceMaker1 juiceMaker1 = (JuiceMaker1) context1.getBean("beanJuice");


        juiceMaker1.mix();
        ((ClassPathXmlApplicationContext) context1).close();

    }
}
