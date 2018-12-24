package com.shine.micro.object.test;

import com.shine.micro.object.item.EmployeeItem;

import java.math.BigDecimal;

public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeItem[] employeeItems = new EmployeeItem[3];
        employeeItems[0] = new EmployeeItem("liuyc", new BigDecimal(5000.00));
        employeeItems[1] = new EmployeeItem("liucq", new BigDecimal(5000.00));
        employeeItems[2] = new EmployeeItem("liuhc", new BigDecimal(5000.00));

        employeeItems[0].raiseSalary(new BigDecimal(0.5));
        for (EmployeeItem item: employeeItems) {
            System.out.println(item.toString());
        }


        swap(employeeItems[1],employeeItems[2]);


        System.out.println(employeeItems[1]);

        System.out.println(employeeItems[2]);


    }


    /**
     *  值引用验证
     * */
    public static void swap(EmployeeItem item,EmployeeItem anotherItem){

        EmployeeItem temp = item;
         item = anotherItem;
         anotherItem = temp;

    }
}
