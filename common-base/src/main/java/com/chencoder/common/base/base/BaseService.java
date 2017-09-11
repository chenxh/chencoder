package com.chencoder.common.base.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * BaseService接口
 * Created by chenxh on 2017/01/07.
 */
public interface BaseService<Long, Record, Example> {

	BaseMapper getDao();

	int countByExample(Example example);

	int deleteByExample(Example example);

	int deleteByPrimaryKey(Long id);

	int insert(Record record);

	int insertSelective(Record record);

	List<Record> selectByExampleWithBLOBs(Example example);

	List<Record> selectByExample(Example example);

	List<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize);

	List<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit);

	Record selectFirstByExample(Example example);

	Record selectByPrimaryKey(Long id);

	int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

	int updateByExample(@Param("record") Record record, @Param("example") Example example);

	int updateByPrimaryKeySelective(Record record);

	int updateByPrimaryKey(Record record);

	int deleteByPrimaryKeys(Long[] ids);

}