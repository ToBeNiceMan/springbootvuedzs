package com.yu.springbootvuedzs.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: iplat
 * @ClassName: com.yu.springbootvuedzs.controller
 * @Description:
 * @Author: 于龙飞
 * @CreateDate: 2023/2/8
 * @version: 1.0
 */
@RestController
@RequestMapping("/book")
public class CORStestController {

    @PostMapping("/")
//    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,
//            allowedHeaders = "*")
    public String addBook(String name){
        return "receive:" + name;
    }

    @DeleteMapping("/{id}")
//    @CrossOrigin(value = "http://localhost:8081",maxAge = 1800,
//            allowedHeaders = "*")
    public String deleteBookId(@PathVariable Long id){
        return String.valueOf(id);
    }

}
