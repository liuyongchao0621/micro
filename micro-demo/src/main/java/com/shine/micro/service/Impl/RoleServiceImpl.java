package com.shine.micro.service.Impl;

import com.alibaba.fastjson.JSONObject;
import com.shine.micro.model.Role;
import com.shine.micro.service.RoleService;

public class RoleServiceImpl implements RoleService {


    @Override
    public void printRole(Role role) {

        System.out.println(JSONObject.toJSONString(role));
    }
}
