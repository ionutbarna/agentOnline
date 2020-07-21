package com.app.agentonline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
    @RequestMapping("/")
    public String homePage() {
        return "home";
    }
    @RequestMapping("/register")
    public String registerPage() {
        return "register";
    }
    @RequestMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }
}
