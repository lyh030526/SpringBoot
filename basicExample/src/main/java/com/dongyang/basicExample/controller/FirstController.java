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
    @GetMapping("/quote")
    public String quoteMethod(Model model){
        String [] varQuotes= {
                "꿈을 계속 간직하고 있으면 반드시 실현할 때가 온다.",
                "내일이란 오늘의 다른 이름일 뿐이다.",
                " 마음만을 가지고 있어서는 안 된다. 반드시 실천하여야 한다.",
                "건강에 대한 지나친 걱정만큼 건강에 치명적인 것은 없다.",
                "오늘이란 신어야 할 신발과 같은 것이다."

        };
        int random = (int)(Math.random() * varQuotes.length);
        model.addAttribute("quoteResult",varQuotes[random]);
        return "quote";
    }
}
