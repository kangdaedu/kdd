package com.kdd.bo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @RequestMapping(value = "/home")
    public String home(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/valueTest")
    public String valueTest(){
        String value = "테스트 String";
                return value;
    }

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("name", "gangdaedu");
        return "thymeleaf/test";
    }
}
