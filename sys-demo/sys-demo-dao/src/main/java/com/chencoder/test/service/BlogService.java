package com.chencoder.test.service;

import com.chencoder.common.base.base.BaseMapper;
import com.chencoder.common.base.base.BaseServiceImpl;
import com.chencoder.test.dao.BlogDao;


public class BlogService  extends BaseServiceImpl {

    private BlogDao blogDao;

    @Override
    public BaseMapper getDao() {
        return blogDao;
    }
}
