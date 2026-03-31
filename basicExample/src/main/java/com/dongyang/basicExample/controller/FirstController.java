package com.dongyang.basicExample.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/home")
    public String firstPage(){
        return "index";
    }
    @GetMapping("/hi")
    public String hello(Model mo){
        mo.addAttribute("userName","이연호");
        return "hi";
    }
}
