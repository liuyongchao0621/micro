package com.shine.micro.design.service.Impl;

import com.shine.micro.design.service.ReflectService;

public class ReflectServiceImpl implements ReflectService {

    private String name ;

    public void sayHello(){
        System.out.println("Hello " + name);

    }

    public ReflectServiceImpl(){

    }

    public ReflectServiceImpl(String name){
        this.name = name;

    }
}
