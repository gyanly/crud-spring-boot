package com.myblog.blog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api")
public class Controller {
    @GetMapping()
    public String myData(){
        return "Hi this app is working...";
    }
}
