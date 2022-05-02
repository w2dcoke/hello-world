package com.springdemo.helloworld.controller;

import com.springdemo.helloworld.domain.User;
import com.springdemo.helloworld.service.DeptManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @author why
 * @date 2022/4/24
 */
@Controller
public class LoginController {
    @Autowired
    DeptManagerService deptManagerService;

    @GetMapping(value = {"/", "/login"})
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, HttpSession session, Model model) {
        if (user != null && user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
            session.setAttribute("loginUser", user);
            return "redirect:/index";
        } else {
            model.addAttribute("msg", "用户名或密码错误");
            return "login";
        }
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("loginUser");
        return "redirect:/login";
    }

}
