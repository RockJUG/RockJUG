package org.jug.littlerock.rockjug.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("user")
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/")
    public String userIndex() {
        return "user/index.html";
    }

}
