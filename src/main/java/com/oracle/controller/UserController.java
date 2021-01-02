package com.oracle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(@RequestParam("uname")String username,@RequestParam("password")
                        String password ){
        System.out.println("uname:"+username+",password:"+password);
        return "dashboard";
    }
}
