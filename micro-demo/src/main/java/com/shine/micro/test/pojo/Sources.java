package com.shine.micro.test.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@ToString
@EqualsAndHashCode
public class Sources {

    /**
     *  依赖注入的时候需要有getter和setter
     * */
    private String fruit; //类型

    private String sugar; //原料

    private String size; //大小杯
}
