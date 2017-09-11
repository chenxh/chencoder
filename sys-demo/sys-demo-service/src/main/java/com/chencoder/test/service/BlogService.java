package com.chencoder.test.service;

import com.chencoder.common.base.base.BaseMapper;
import com.chencoder.common.base.base.BaseServiceImpl;
import com.chencoder.test.dao.BlogDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
* BlogService接口
* Created by chenxh on 2017/9/11.
*/
public class BlogService extends BaseServiceImpl {

    @Autowired
    private BlogDao blogDao;

    public BlogService(BlogDao mapper) {
        super();
        blogDao = mapper;
    }

    @Override
    public BaseMapper getDao() {
        return blogDao;
    }
}