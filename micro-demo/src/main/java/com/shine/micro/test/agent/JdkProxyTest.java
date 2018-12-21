package com.shine.micro.test.agent;

import com.shine.micro.design.agent.HelloWord;
import com.shine.micro.design.agent.Impl.HelloWordImpl;
import com.shine.micro.design.agent.Impl.JdkProxyExample;

public class JdkProxyTest {


    public static void main(String[] args) {
        JdkProxyTest test = new JdkProxyTest();
        test.testProxy();


    }

    public void testProxy(){
        JdkProxyExample example = new JdkProxyExample();

        HelloWord proxy = (HelloWord) example.bind(new HelloWordImpl());

        proxy.sayHello();
    }
}
