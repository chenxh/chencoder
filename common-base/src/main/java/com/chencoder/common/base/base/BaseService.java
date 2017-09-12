package com.chencoder.common.base.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * BaseService接口
 * Created by chenxh on 2017/01/07.
 */
public abstract class BaseService<ID, T extends Record, E extends Example> {

	protected abstract BaseMapper<ID, T, E> getDao();

	public int countByExample(E example) {
		return (int) getDao().countByExample(example);
	}

	public int deleteByExample(E example) {
		return getDao().deleteByExample(example);
	}

	public int deleteByPrimaryKey(ID id) {
		return getDao().deleteByPrimaryKey(id);
	}

	public int insert(T record) {
		return getDao().insert(record);
	}

	public int insertSelective(T record) {
		return getDao().insertSelective(record);
	}


	public List<T> selectByExample(E example) {
		return getDao().selectByExample(example);
	}



	public List<T> selectByExampleForStartPage(E example, Integer pageNum, Integer pageSize) {
		example.setOffset((pageNum - 1) * pageSize);
		example.setLimit(pageSize);
		return getDao().selectByExample(example);
	}

	public List<T> selectByExampleForOffsetPage(E example, Integer offset, Integer limit) {
		example.setOffset(offset);
		example.setLimit(limit);
		return getDao().selectByExample(example);
	}

	public T selectFirstByExample(E example) {
		List<T> records = getDao().selectByExample(example);
		if (records != null && records.size() > 0) {
			return records.get(0);
		}
		return null;
	}


	public T selectByPrimaryKey(ID id) {
		return getDao().selectByPrimaryKey(id);
	}

	public int updateByExampleSelective(T record, E example) {
		return getDao().updateByExampleSelective(record, example);
	}

	public int updateByExample(T record, E example) {
		return getDao().updateByExample(record, example);
	}

	public int updateByPrimaryKeySelective(T record) {
		return getDao().updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(T record) {
		return getDao().updateByPrimaryKey(record);
	}

	public int deleteByPrimaryKeys(ID[] ids) {
		int del = 0;
		for (ID id : ids) {
			del += getDao().deleteByPrimaryKey(id);
		}
		return del;
	}

}