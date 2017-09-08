package com.chencoder.test.service;

import com.chencoder.test.dao.BlogDao;
import com.chencoder.test.dao.model.Blog;
import com.chencoder.test.dao.model.BlogExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class BlogServiceTest {

    private BlogService blogService;
    private SqlSession session;

    @Before
    public void init() {
        String resource = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(BlogServiceTest.class.getClassLoader(),resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession();
            BlogDao mapper = session.getMapper(BlogDao.class);
            blogService = new BlogService(mapper);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testCrud() {
        blogService.countByExample(new BlogExample());
        Blog blog = new Blog();
        blog.setTitle("test");
        try {
            blogService.insertSelective(blog);
            session.commit();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }

    @After
    public void clear() {
        if (session != null) {
            session.close();
        }
    }


}
