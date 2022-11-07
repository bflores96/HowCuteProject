package com.howcute.howcuteproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
    @GetMapping("/")
    public String home() {
        return "welcomepage";
    }

    @GetMapping("/aboutUs")
    public String aboutUs()  { return "aboutUs"; }

    @GetMapping("/waifus")
    public String waifus()  { return "waifus"; }

    @GetMapping("/question")
    public String question()  { return "question"; }
}
