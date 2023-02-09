package com.yu.springbootvuedzs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Program: iplat
 * @ClassName: com.yu.springbootvuedzs.controller
 * @Description:
 * @Author: 于龙飞
 * @CreateDate: 2023/2/7
 * @version: 1.0
 */
@RestController
public class ErrorController {
    @GetMapping("/err1")
    public String err1(){
        int a =1/0;
        return "hello";
    }
}
