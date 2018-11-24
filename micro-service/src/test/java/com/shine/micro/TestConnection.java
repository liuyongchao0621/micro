package com.shine.micro;


import com.alibaba.fastjson.JSONObject;
import com.shine.micro.biz.QueryBiz;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-context.xml"})
@Slf4j
public class TestConnection {

    @Autowired
    QueryBiz queryBiz;

    @Test
    public void testConnection(){
        long id = 657719;

        String drCustInfo = queryBiz.testconnection(id);

        log.info("返回数据：" + JSONObject.toJSONString(drCustInfo));
    }
}
