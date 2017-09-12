package com.chencoder.hello.world.service;

import com.chencoder.common.base.base.BaseMapper;
import com.chencoder.common.base.base.BaseService;
import com.chencoder.hello.world.dao.mapper.BlogMapper;
import com.chencoder.hello.world.pojo.Blog;
import com.chencoder.hello.world.pojo.BlogExample;
import org.springframework.beans.factory.annotation.Autowired;

/**
* BlogService接口
* Created by chenxh on 2017/9/12.
*/
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