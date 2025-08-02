package com.avinash.portfoliio.portfolio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        // redirect homePage
        return "index";
    }
}
