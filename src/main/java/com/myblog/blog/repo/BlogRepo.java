package com.myblog.blog.repo;

import com.myblog.blog.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepo extends JpaRepository<Blog,Long> {


}
