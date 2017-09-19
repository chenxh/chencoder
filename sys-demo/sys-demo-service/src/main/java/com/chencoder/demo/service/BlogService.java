package com.chencoder.demo.service;

import com.chencoder.common.base.base.BaseMapper;
import com.chencoder.common.base.base.BaseService;
import com.chencoder.demo.dao.mapper.BlogMapper;
import com.chencoder.demo.pojo.Blog;
import com.chencoder.demo.pojo.BlogExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* BlogService接口
* Created by chenxh on 2017/9/18.
*/
@Service
public class BlogService extends BaseService<Long, Blog, BlogExample> {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    protected BaseMapper<Long, Blog, BlogExample> getDao() {
        return blogMapper;
    }

    public void setBlogMapper(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }
}