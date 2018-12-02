package com.shine.micro.test.operation;

import com.shine.micro.test.pojo.Sources;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Data
@ToString
@EqualsAndHashCode
@Slf4j
public class JuiceMaker1 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String stop; //商店

    private Sources sources;

    @PostConstruct
    public void init(){
        System.out.println("执行" + this.getClass().getSimpleName() + "自定义的初始化方法");
    }

    public void mix(){

        System.out.println("这是一杯由" + stop + "制造的含" + sources.getSize() + "杯的" +  sources.getFruit() + sources.getSugar());
    }

    @PreDestroy
    public void myDestroy(){
        System.out.println("执行" + this.getClass().getSimpleName() + "自定义的销毁方法");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("执行" + this.getClass().getSimpleName() + "调用BeanFactoryAware接口");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("执行" + this.getClass().getSimpleName() + "调用BeanNameWare接口");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("执行" + this.getClass().getSimpleName() + "调用DisposableBean接口");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行" + this.getClass().getSimpleName() + "调用InitializingBean接口");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("执行" + this.getClass().getSimpleName() + "调用ApplicationContextAware接口");

    }
}
