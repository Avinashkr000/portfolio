package com.avinash.portfoliio.portfolio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SkillsController {
    @GetMapping("/skills")
    public String skills(Model model) {

        model.addAttribute("skills", List.of(
                "Java", "Spring Boot", "MySQL", "HTML/CSS", "Git & GitHub","Docker","AWS",
                "Problem Solving", "CI/CD ", " Linux", " Kubernetes"
        ));
        return "skills";
    }
}
