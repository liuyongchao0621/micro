package com.shine.micro.test.operation;

import com.shine.micro.test.pojo.Sources;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Data
@ToString
@EqualsAndHashCode
@Slf4j
public class JuiceMaker {


    private String stop; //商店

    private Sources sources;


    public void mix(){

        System.out.println("这是一杯由" + stop + "制造的含" + sources.getSize() + "杯的" +  sources.getFruit() + sources.getSugar());
    }

}
