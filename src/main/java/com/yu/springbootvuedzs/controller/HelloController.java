package com.yu.springbootvuedzs.controller;

import com.yu.springbootvuedzs.beans.Hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: iplat
 * @ClassName: com.yu.springbootvuedzs.controller
 * @Description:
 * @Author: 于龙飞
 * @CreateDate: 2023/2/9
 * @version: 1.0
 */
@RestController
public class HelloController {
    @Autowired
    private Hello hello;

    @GetMapping("/hello")
    public String hello(){
        return hello.sayHello("beans.xml配置文件生效了");
    }

    @GetMapping("/login")
    public String login(){
        return "login-controller";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

}
