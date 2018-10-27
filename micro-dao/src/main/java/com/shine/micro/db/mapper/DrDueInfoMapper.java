package com.shine.micro.db.mapper;


import com.shine.micro.db.pojo.DrDueInfo;

public interface DrDueInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrDueInfo record);

    int insertSelective(DrDueInfo record);

    DrDueInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrDueInfo record);

    int updateByPrimaryKey(DrDueInfo record);
}