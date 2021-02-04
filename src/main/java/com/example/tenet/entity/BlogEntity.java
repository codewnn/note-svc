package com.example.tenet.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Title:BlogEntity
 * @Description:com.example.tenet.entity
 * @Auther: 崔洪铭
 * @Version:1.0
 * @create:2021/2/1
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogEntity {
    private int blog_id;
    private String subject;
    private String content;
    private String category;
    private String author;
    private String time;
}
