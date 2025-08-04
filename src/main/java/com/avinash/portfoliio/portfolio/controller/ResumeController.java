package com.avinash.portfoliio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {
    @GetMapping("/resume")
    public String resume() {
        return "resume";
    }
}