package com.yu.springbootvuedzs.config.sfl;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @Program: iplat
 * @ClassName: com.yu.springbootvuedzs.config.sfl
 * @Description:
 * @Author: 于龙飞
 * @CreateDate: 2023/2/9
 * @version: 1.0
 */
//@WebListener
public class MyListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("MyListener>>requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("MyListener>>requestInitialized");
    }
}
