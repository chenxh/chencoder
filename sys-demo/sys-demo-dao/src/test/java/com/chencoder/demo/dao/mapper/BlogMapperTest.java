package com.chencoder.demo.dao.mapper;


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
public class BlogMapperTest {

    @Autowired
    private  BlogMapper blogMapper;

    @Test
    public void testCRUD() {
        Blog record = new Blog();
        blogMapper.insert(record);

        Blog selected = blogMapper.selectByPrimaryKey(record.getId());

        blogMapper.deleteByPrimaryKey(selected.getId());

    }

}
