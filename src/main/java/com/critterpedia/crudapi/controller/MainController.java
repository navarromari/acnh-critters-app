package com.critterpedia.crudapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String homePage(Model model){
        return "homepage";
    }

    @GetMapping("/allcritters")
    public String allCrittersPage(Model model){
        //if logged in highlight catched critters
        //filter options to: fish, bugs, sea critters
        return "allcritters";
    }

    @GetMapping("/catchable")
    public String catchablePage(Model model){
        //if logged in show option to show only not catched critters
        //filter optiong by date and time
        return "catchable";
    }

    @GetMapping("/login")
    public String loginPage(Model model){
        return "login-form";
    }

    @GetMapping("/profile")
    public String profilePage(Model model){
        return "profile";
    }

    @GetMapping("/mycritters")
    public String myCrittersPage(Model model){
        return "mycritters";
    }

    @GetMapping("/critter/id")
    public String critterPage(Model model){
        return "critter";
    }
}
