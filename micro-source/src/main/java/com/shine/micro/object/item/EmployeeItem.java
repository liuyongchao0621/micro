package com.shine.micro.object.item;

import com.shine.micro.extend.stract.Person;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  自定义类
 * */
public class EmployeeItem extends Person implements java.io.Serializable {


    private static final long serialVersionUID = -6611757772304416998L;

    private static int nextId ;  //静态域  属于所有对象共享

    /**
     *  代码块
     * */
    static {
        nextId = 2;
    }

    private int id; //实例域，属于实例所有

    public void setId(){
        this.id = nextId;
        nextId ++;

//        this.nextId;    //实例域不能用this来修饰
    }

    public EmployeeItem(String name){
        super(name);
    }

    /**
     *  静态域可以操作静态域，不能操作实例域
     *  实例域既可以操作静态域，又可以操作实例域
     * */
    public int getId(){
        return id;
    }

    /**
     *  下面三个属于实例域
     * */
    private String name;

    private BigDecimal salary = BigDecimal.ZERO;

    private Date hireDay;  //聚合关系

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDeciption() {
        return null;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    /**
     *  两个构造器构成了重载，重载不止可以构造器重载，
     *  也可以方法重载
     * */
    public EmployeeItem(String name,BigDecimal salary){
        super(name);
        this.name = name;
//        this.salary = salary;
        this.hireDay = new Date();

    }
    /**
     * 一般代码中没有构造器的时候，系统会提供一个无参构造器，
     * 当系统中提供至少一个有参构造器，而没有提供无参构造器，再调用
     * 无参构造器的时候就会报错，是为不合法
     *
     * */
    public EmployeeItem(){
        super(null);

    }

    public EmployeeItem(BigDecimal salary,String name){
        super(name);
        this.salary = salary;
    }

    /**
     *  自定义方法
     * */
    public void raiseSalary(BigDecimal byPersent){
        this.salary = salary.add(salary.multiply(byPersent)).
                setScale(2,BigDecimal.ROUND_HALF_UP);

    }
    /**
     *  方法之间的重载
     * */
    public void raiseSalary(){
        this.salary = this.salary.add(new BigDecimal(5000));
    }

    public String toString(){
        return name + "的工资是"
                + salary + "元";
    }


}
