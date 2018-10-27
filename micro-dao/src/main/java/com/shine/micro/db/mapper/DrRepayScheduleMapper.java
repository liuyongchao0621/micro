package com.shine.micro.db.mapper;


import com.shine.micro.db.pojo.DrRepaySchedule;

public interface DrRepayScheduleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DrRepaySchedule record);

    int insertSelective(DrRepaySchedule record);

    DrRepaySchedule selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrRepaySchedule record);

    int updateByPrimaryKey(DrRepaySchedule record);
}