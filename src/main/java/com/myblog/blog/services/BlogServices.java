package com.myblog.blog.services;

import com.myblog.blog.entity.Blog;
import com.myblog.blog.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServices {
public final BlogRepo blogRepo;
    @Autowired
    public BlogServices(BlogRepo blogRepo) {
        this.blogRepo = blogRepo;
    }

    public void createBlog(Blog blog) {
        blogRepo.save(blog);
    }

    public List<Blog> getAllBlog() {
        return blogRepo.findAll();
    }




}
