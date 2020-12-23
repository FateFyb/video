package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan  //Servlet可以直接通过@WebServlet注解自动注册
//Filter可以直接通过@WebFilter注解自动注册
//Listener可以直接通过@WebListener 注解自动注册
@MapperScan("com.qf.dao")
public class VideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoApplication.class, args);
    }

}
