package com.shine.micro.design.agent.Impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyExample implements InvocationHandler {

    //创建真实角色
    private Object target = null;

    /**
     *  建立代理对象和真是对象的代理关系，返回代理对象
     * @param target ---真实对象
     * @return 代理对象
     *   1--类自带的类加载器
     *   2-类所实现的接口
     *   3-定义实现方法逻辑的代理类
     * */
    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);

    }
    /**
     *  代理方法逻辑
     *  proxy --代理对象 bind中生成的对象
     *  method -- 当前调度的方法
     *  args --当前调度的方法的入参
     * */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object obj = null;
        System.out.println("进入代理逻辑方法");
        System.out.println("在调度真实对象之前的服务");
        try{
            obj = method.invoke(target,args);
        }catch(Throwable e){
            throw e.getCause();
        }

        System.out.println("在调度真实对象之后的服务");
        return obj;
    }
}
