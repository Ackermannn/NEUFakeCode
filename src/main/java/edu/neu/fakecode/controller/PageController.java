package edu.neu.fakecode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/pass.html")
    public String index2() {
        return "pass";
    }
}
