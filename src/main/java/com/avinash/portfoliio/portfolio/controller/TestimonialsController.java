package com.avinash.portfoliio.portfolio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@Controller
public class TestimonialsController {
    @GetMapping("/testimonials")
    public String testimonials(Model model) {
        model.addAttribute("testimonials", List.of(
                "Avinash is a dedicated and fast learner! - Mentor",
                "Great teammate, always ready to help others. - Peer",
                "Delivered complex Spring Boot features on time. - Team Lead"
        ));
        return "testimonials";
    }
}