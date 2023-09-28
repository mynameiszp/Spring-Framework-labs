package com.example.lab1.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Page1 {
    @GetMapping("/FirstPage")
    @ResponseBody
    String View(){
        return "Page about member#1";
    }
}
