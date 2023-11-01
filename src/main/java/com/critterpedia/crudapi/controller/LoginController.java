package com.critterpedia.crudapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login1")
    public String showLoginForm(){
        return "login-form";
    }
}
