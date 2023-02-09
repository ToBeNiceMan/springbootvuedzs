package com.yu.springbootvuedzs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@SpringBootApplication(exclude={ErrorMvcAutoConfiguration.class})
@SpringBootApplication
@ServletComponentScan
public class SpringbootvuedzsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootvuedzsApplication.class, args);
    }

}
