package com.aditya.configconsumer.configconsumer.controller;

import com.aditya.configconsumer.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;


    @RequestMapping("/profile")
    public MemberProfileConfiguration getConfigjahsvkd(){
        return memberProfileConfiguration;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
