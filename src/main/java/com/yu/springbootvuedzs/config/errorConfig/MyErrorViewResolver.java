package com.yu.springbootvuedzs.config.errorConfig;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @Program: iplat
 * @ClassName: com.yu.springbootvuedzs.controller
 * @Description:
 * @Author: 于龙飞
 * @CreateDate: 2023/2/7
 * @version: 1.0
 */
@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request,
                                         HttpStatus status, Map<String, Object> model) {
        ModelAndView errorPage = new ModelAndView("errorPage");
        errorPage.addObject("custommsg","MyErrorViewResolver出错了!");
        errorPage.addAllObjects(model);
        return errorPage;
    }
}
