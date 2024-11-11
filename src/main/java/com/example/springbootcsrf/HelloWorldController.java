package com.example.springbootcsrf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("form", new Form());
        return "csrf-form";
    }

    @PostMapping("/submit")
    public String processForm(@ModelAttribute Form form, Model model) {
        model.addAttribute("data", form.getData());
        return "success";
    }
}
