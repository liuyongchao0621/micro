package com.shine.micro.extend.item;

import com.shine.micro.object.item.EmployeeItem;

import java.math.BigDecimal;

public class Manager extends EmployeeItem {


    private static final long serialVersionUID = 4835256457779425436L;

    private BigDecimal bonus;  //奖金

    /**
     *  覆盖父类的方法，父类不能调用子类的方法
     * */
    public BigDecimal getSalary(){
        return super.getSalary().add(bonus);
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }
}
