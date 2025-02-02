package com.johnfisher.form_submission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.johnfisher.form_submission.utility.Form;

@Controller
public class FormController {

    @GetMapping("/form")
    public String formInfo(Model model) {
        model.addAttribute("form", new Form());
        return "form";
    }

    @PostMapping("/form")
    public String formInfo(@ModelAttribute Form form, Model model) {
        model.addAttribute("form", form);
        return "submit";
    }

}
