package com.myblog.blog.controller;

import com.myblog.blog.entity.Blog;
import com.myblog.blog.services.BlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/blogs")
public class BlogController {
    private final BlogServices blogServices;

    @Autowired
    public BlogController(BlogServices blogServices) {
        this.blogServices = blogServices;
    }

    @PostMapping
    public String saveBlog(@RequestBody Blog blog) {
        blogServices.createBlog(blog);
        return "Blog Created";
    }

    @GetMapping
    public ResponseEntity<List<Blog>> getAllBlog() {
        List<Blog> blogs = blogServices.getAllBlog();
        return new ResponseEntity<>(blogs, HttpStatus.OK);
    }






}
