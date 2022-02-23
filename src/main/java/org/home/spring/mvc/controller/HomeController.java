package org.home.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class HomeController {
    @RequestMapping(value = "/home", method = GET)
    public String home() {
        return "home";
    }
}
