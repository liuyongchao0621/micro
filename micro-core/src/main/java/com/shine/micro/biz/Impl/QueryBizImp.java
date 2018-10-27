package com.shine.micro.biz.Impl;

import com.alibaba.fastjson.JSONObject;
import com.shine.micro.biz.QueryBiz;
import com.shine.micro.db.mapper.DrCustInfoMapper;
import com.shine.micro.db.pojo.DrCustInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class QueryBizImp implements QueryBiz {

    @Autowired
    DrCustInfoMapper drCustInfoMapper;

    @Override
    public String testconnection(Long id) {

        log.info("请求参数：" + id);
        DrCustInfo drCustInfo = drCustInfoMapper.selectByPrimaryKey(id);

        log.info("返回参数：" + JSONObject.toJSONString(drCustInfo));
        return JSONObject.toJSONString(drCustInfo);
    }
}
