package com.avinash.portfoliio.portfolio.api;

import com.avinash.portfoliio.portfolio.model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectApiController {
    @GetMapping("/api/projects")
    public List<Project> apiProjects() {
        return List.of(
                new Project("OOPs Concepts Practice", "Showcases OOPs in Java", "https://github.com/Avinashkr000/oops-concepts-practice"),
                new Project("This Portfolio", "Spring Boot site for my projects", "https://github.com/Avinashkr000/portfolio")
        );
    }
}
