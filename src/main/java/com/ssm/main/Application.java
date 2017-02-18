package com.ssm.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Fremon on 2017/2/18.
 @**/
@SpringBootApplication
@ComponentScan(basePackages = "com")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
