package com.howcute.howcuteproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
public class AppController {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("welcome", "page");

    return "welcomepage";

    }

    @GetMapping("/locale")
    public String changeLocale(@RequestParam String language){
        System.out.println("language selected = " + language);

        return "welcomepage";
    }

    @GetMapping("/aboutUs")
    public String aboutUs()  { return "aboutUs"; }


    @GetMapping("/question")
    public String question()  { return "question"; }
}
