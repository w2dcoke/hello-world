package com.springdemo.helloworld.controller;

import com.springdemo.helloworld.service.DeptManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @author why
 * @date 2022/4/28
 */
@Controller
public class DeptManagerController {
    @Autowired
    DeptManagerService deptManagerService;

    @GetMapping("/deptManager/delete/{empNo}")
    public String delete(@PathVariable("empNo") Integer empNO,
                         @RequestParam(value = "pageNow", defaultValue = "1") Integer pageNow,
                         RedirectAttributes ra) {
        deptManagerService.deleteByEmpNo(empNO);
        ra.addAttribute("pageNow", pageNow);
        return "redirect:/dynamic_table";
    }
}
