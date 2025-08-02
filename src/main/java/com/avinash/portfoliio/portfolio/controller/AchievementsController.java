package com.avinash.portfoliio.portfolio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AchievementsController {
    @GetMapping("/achievements")
    public String achievements(Model model) {
        // Apni achievements list yahan update kar sakte ho
        model.addAttribute("achievements", List.of(
                "Leetcode - 200+ Problems Solved",
                "GitHub Arctic Code Vault Contributor",
                "Spring Boot Pro Certification",
                "College Coding Club Lead (2024)"
        ));
        return "achievements";
    }
}