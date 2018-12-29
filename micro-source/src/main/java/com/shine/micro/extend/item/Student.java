package com.shine.micro.extend.item;

import com.shine.micro.extend.stract.Person;

public class Student extends Person {

    private String major;

    public String getMajor() {
        return major;
    }

    public Student(String major,String name){
        super(name);
        this.major = major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String getDeciption() {
        return null;
    }
}
