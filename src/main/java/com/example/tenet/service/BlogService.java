package com.example.tenet.service;

import com.example.tenet.dao.BlogDao;
import com.example.tenet.entity.BlogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Title:BlogService
 * @Description:com.example.tenet.service
 * @Auther: 崔洪铭
 * @Version:1.0
 * @create:2021/2/1
 */
@Service
public class BlogService {
    @Autowired
    private BlogDao blogDao;
    public String insertBlog(BlogEntity blogEntity){
        blogDao.insert(blogEntity);
        return "b";
    }
    public ArrayList<BlogDao> selectBlog(){
        return blogDao.select();
    }
    public Object selectIdBlog(BlogEntity blogEntity){
        return blogDao.select(blogEntity.getsetblog_id());
    }
}
