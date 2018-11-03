package org.jug.littlerock.rockjug.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Index {

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    @GetMapping("/hello-user")
    public String helloUser(){
        return "hello_user.html";
    }

    @GetMapping("/hello-admin")
    public String helloAdmin(){
        return "hello_admin.html";
    }
}
