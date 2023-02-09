package com.yu.springbootvuedzs.config.errorConfig;

import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @Program: iplat
 * @ClassName: com.yu.springbootvuedzs.config.errorConfig
 * @Description:
 * @Author: 于龙飞
 * @CreateDate: 2023/2/7
 * @version: 1.0
 */
@Component
public class MyErrorAttribute extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest,
                                                  ErrorAttributeOptions options) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        errorAttributes.put("custommsg","出错了!");
        errorAttributes.remove("error");
        return errorAttributes;
    }
}
