package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class TestController {

    private static String name;

    @Value("${project.name}")
    public void setName(String name) {
        TestController.name = name;
    }

    @RequestMapping("/list")
    public Object toLogin(){
        return name;
    }

}
