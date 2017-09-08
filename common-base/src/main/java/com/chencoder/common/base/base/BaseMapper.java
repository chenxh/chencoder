package com.chencoder.common.base.base;

public interface BaseMapper<ID, RECORD, EXAMPLE> {

    long countByExample(EXAMPLE example);

    int deleteByExample(EXAMPLE example);

    int deleteByPrimaryKey(ID id);


}
