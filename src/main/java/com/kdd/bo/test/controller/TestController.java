package com.kdd.bo.test.controller;

import com.kdd.bo.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    @Autowired
    TestService testService;

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

        model.addAttribute("name", testService.selectTest());

        return "thymeleaf/test";
    }
}
