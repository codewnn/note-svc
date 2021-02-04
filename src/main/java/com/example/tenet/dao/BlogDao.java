package com.example.tenet.dao;

import com.example.tenet.entity.BlogEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @Title:BlogDao
 * @Description:com.example.tenet.dao
 * @Auther: 崔洪铭
 * @Version:1.0
 * @create:2021/2/1
 */
@Mapper
@Repository
public interface BlogDao {
    int insert(@Param("blogEntity") BlogEntity blogEntity);
    ArrayList<BlogDao> select();
    Object select(@Param("blog_id") int blog_id);
}
