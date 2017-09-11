package com.chencoder.common.base.base;

import java.util.List;

public abstract class BaseServiceImpl implements BaseService<Long, Record, Example>{


    @Override
    public int countByExample(Example example) {
        return (int) getDao().countByExample(example);
    }

    @Override
    public int deleteByExample(Example example) {
        return getDao().deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long aLong) {
        return getDao().deleteByPrimaryKey(aLong);
    }

    @Override
    public int insert(Record record) {
        return getDao().insert(record);
    }

    @Override
    public int insertSelective(Record record) {
        return getDao().insertSelective(record);
    }


    @Override
    public List<Record> selectByExample(Example example) {
        return getDao().selectByExample(example);
    }



    @Override
    public List<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize) {
        example.setOffset((pageNum - 1) * pageSize);
        example.setLimit(pageSize);
        return getDao().selectByExample(example);
    }

    @Override
    public List<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit) {
        example.setOffset(offset);
        example.setLimit(limit);
        return getDao().selectByExample(example);
    }

    @Override
    public Record selectFirstByExample(Example example) {
        List<Record> records =  getDao().selectByExample(example);
        if (records != null && records.size() > 0) {
            return records.get(0);
        }
        return null;
    }


    @Override
    public Record selectByPrimaryKey(Long aLong) {
        return (Record) getDao().selectByPrimaryKey(aLong);
    }

    @Override
    public int updateByExampleSelective(Record record, Example example) {
        return getDao().updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Record record, Example example) {
        return getDao().updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Record record) {
        return getDao().updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Record record) {
        return getDao().updateByPrimaryKey(record);
    }

    @Override
    public int deleteByPrimaryKeys(Long[] ids) {
        int del = 0;
        for (Long id : ids) {
            del += getDao().deleteByPrimaryKey(id);
        }
        return del;
    }

}
