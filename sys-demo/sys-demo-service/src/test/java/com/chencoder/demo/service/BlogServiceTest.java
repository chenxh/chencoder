package com.chencoder.demo.service;

import com.chencoder.demo.Application;
import com.chencoder.demo.pojo.Blog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class BlogServiceTest {

    @Autowired
    BlogService blogService;

    @Test
    public void testBlogService() {
        blogService.insert(new Blog());
    }

}
