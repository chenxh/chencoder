package com.chencoder.common.base.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<ID, RECORD, EXAMPLE> {

    long countByExample(EXAMPLE example);

    int deleteByExample(EXAMPLE example);

    int deleteByPrimaryKey(ID id);

    int insert(RECORD record);

    int insertSelective(RECORD record);

    List<RECORD> selectByExample(EXAMPLE example);

    <RECORD> RECORD selectByPrimaryKey(ID primaryKey);

    int updateByExampleSelective(@Param("record") RECORD record, @Param("example") EXAMPLE example);

    int updateByExample(@Param("record") RECORD record, @Param("example") EXAMPLE example);

    int updateByPrimaryKeySelective(RECORD record);

    int updateByPrimaryKey(RECORD record);

}
