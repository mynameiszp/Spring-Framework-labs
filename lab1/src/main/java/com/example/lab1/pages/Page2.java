package com.example.lab1.pages;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Page2 {
    @GetMapping("/SecondPage")
    @ResponseBody
    String View(){
        return "Page about member#2";
    }
}
