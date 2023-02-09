package com.yu.springbootvuedzs.service;

import org.springframework.stereotype.Service;

/**
 * @Program: iplat
 * @ClassName: com.yu.springbootvuedzs.service
 * @Description:
 * @Author: 于龙飞
 * @CreateDate: 2023/2/9
 * @version: 1.0
 */
@Service
public class UserService {
    public String getUserById(Integer id){
//        int a=1/0;
        System.out.println("get...");
        return "user";
    }

    public void deleteUserById(Integer id){
        System.out.println("delete...");
    }
}
