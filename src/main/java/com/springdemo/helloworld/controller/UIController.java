package com.springdemo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author why
 * @createDate 2022/4/30
 */
@Controller
public class UIController {
    @GetMapping("/buttons")
    public String buttons() {
        return "ui/buttons";
    }
}
