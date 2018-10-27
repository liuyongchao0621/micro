package com.shine.micro.service;


import com.alibaba.dubbo.config.annotation.Service;
import com.shine.micro.biz.QueryBiz;
import com.shine.micro.inference.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class QueryService implements IQueryService {

    @Autowired
    QueryBiz queryBiz;


    public String testconnection(Long id) {

        return queryBiz.testconnection(id);
    }
}
