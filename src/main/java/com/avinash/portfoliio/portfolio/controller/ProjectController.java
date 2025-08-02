package com.avinash.portfoliio.portfolio.controller;

import com.avinash.portfoliio.portfolio.controller.ProjectController;
import com.avinash.portfoliio.portfolio.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import java.util.Arrays;

@Controller
public class ProjectController {
    @GetMapping("/projects")
    public String projects(Model model) {
        List<Project> projects = Arrays.asList(
                new Project("OOPs Concepts Practice", "Java OOPs repo", "https://github.com/Avinashkr000/oops-concepts-practice"),
                new Project("Portfolio Example", "This portfolio site built in Spring Boot", "https://github.com/Avinashkr000/portfolio")
        );
        model.addAttribute("projects", projects);
        return "projects";
    }
}
