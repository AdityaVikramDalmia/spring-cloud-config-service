package com.aditya.configconsumer.configconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@ComponentScan(basePackages = "com.aditya.configconsumer.configconsumer")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class ConfigconsumerApplication {


    public static void main(String[] args) {

        SpringApplication.run(ConfigconsumerApplication.class, args);
//        System.out.println(hello);
    }







}
