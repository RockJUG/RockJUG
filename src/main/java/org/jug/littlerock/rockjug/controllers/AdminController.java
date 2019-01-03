package org.jug.littlerock.rockjug.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("admin")
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/hello-admin")
    public String helloAdmin() {
        return "hello_admin.html";
    }
}
