package com.howcute.howcuteproject.web.rest;

import com.howcute.howcuteproject.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class QuestionController {

    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/question/{id}")
    public String findById(@PathVariable("id") Integer id, ModelMap model) {
        model.addAttribute("question", this.questionService.findById(id));
        System.out.println(id);
        System.out.println(this.questionService.findById(id));
        return "question";
    }
}
