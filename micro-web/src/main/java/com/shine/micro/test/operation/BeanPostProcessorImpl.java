package com.shine.micro.test.operation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class BeanPostProcessorImpl implements BeanPostProcessor, Ordered {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {

        System.out.println("[" + o.getClass().getSimpleName() + "]对象" + s + "开始实例化");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("[" + o.getClass().getSimpleName() + "]对象" + s + "实例化完成");
        return o;    }

    @Override
    public int getOrder() {
        return 0;
    }
}
