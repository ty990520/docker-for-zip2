package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

//    private final ImageService imageService;
//
//    public ThymeleafController(ImageService imageService) {
//        this.imageService = imageService;
//    }

    @GetMapping("/")
    public String index(Model model) {
//        model.addAttribute("images", imageService.getAllImages());
        return "index";
    }

    @GetMapping("/redirect")
    public String redirectToIndex() {
        return "redirect:/";
    }
}