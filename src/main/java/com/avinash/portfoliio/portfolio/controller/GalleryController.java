package com.avinash.portfoliio.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GalleryController {
    @GetMapping("/gallery")
    public String gallery(Model model) {

        model.addAttribute("images", List.of(
                "me.jpg",
                "cert.png",
                "gallery/project1.png"
        ));
        return "gallery";
    }
}