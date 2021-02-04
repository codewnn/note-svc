package com.example.tenet.Controller;

import com.example.tenet.entity.BlogEntity;

import com.example.tenet.service.BlogService;

import com.example.tenet.wrapper.ResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Title:BlogController
 * @Description:com.example.tenet.Controller
 * @Auther: 崔洪铭
 * @Version:1.0
 * @create:2021/2/1
 */
@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private BlogService blogService;

    @PostMapping("/insertBlog")
    public ResponseWrapper insertBlog(@RequestBody BlogEntity blogEntity){
        System.out.println(blogEntity);
        blogService.insertBlog(blogEntity);
        return ResponseWrapper.successResponess("成功");
    }

    @GetMapping("/selectBlog")
    public ResponseWrapper selectBlog(){
        return ResponseWrapper.successResponess(blogService.selectBlog());
    }

    @GetMapping("/selectIdBlog")
    public ResponseWrapper selectIdBlog(@RequestParam int blog_id){
        return ResponseWrapper.successResponess(blogService.selectIdBlog(blog_id));
    }

}
