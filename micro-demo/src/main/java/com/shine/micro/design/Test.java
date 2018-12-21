package com.shine.micro.design;

import com.shine.micro.design.service.Impl.ReflectServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {


    public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException,NoSuchMethodException,InvocationTargetException{
        Test test = new Test();


        test.buildClassByConstruct();
        test.methodInvoke();

    }


    /**
     *  反射到类
     * */
    public void buildClass() throws ClassNotFoundException,InstantiationException,IllegalAccessException{
        ReflectServiceImpl reflect = null;

        try{

            reflect  = (ReflectServiceImpl)Class.forName("com.shine.micro.design.service.Impl.ReflectServiceImpl").newInstance();

            reflect.sayHello();
        }catch(ClassNotFoundException e){
            throw e;
        }catch(InstantiationException ee){
            throw ee;
        }catch(IllegalAccessException e){
            throw e;
        }
    }

    /**
     *  反射到构造器构造类
     * */
    public void buildClassByConstruct() throws ClassNotFoundException,InstantiationException,IllegalAccessException,NoSuchMethodException,InvocationTargetException{
        ReflectServiceImpl reflect = null;

        try{

            reflect  = (ReflectServiceImpl)Class.forName("com.shine.micro.design.service.Impl.ReflectServiceImpl").getConstructor(String.class).newInstance("朱丽");

            reflect.sayHello();
        }catch(ClassNotFoundException e){
            throw e;
        }catch(InstantiationException ee){
            throw ee;
        }catch(IllegalAccessException e){
            throw e;
        }catch(NoSuchMethodException e){
            throw e;
        }catch(InvocationTargetException e){
            throw e;
        }
    }

    /**
     *  反射方法
     * */
    public void methodInvoke() throws ClassNotFoundException,InstantiationException,IllegalAccessException,NoSuchMethodException,InvocationTargetException{
        ReflectServiceImpl reflect = new ReflectServiceImpl();

        try{

            Method method = ReflectServiceImpl.class.getMethod("sayHello");

            method.invoke(reflect);

        }catch(IllegalAccessException e){
            throw e;
        }catch(NoSuchMethodException e){
            throw e;
        }catch(InvocationTargetException e){
            throw e;
        }

    }
}
