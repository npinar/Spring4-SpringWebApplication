package com.my.java.solutions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class SampleController {
 
    @RequestMapping("home")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "welcome to home page");
        return "home";
    }
}
