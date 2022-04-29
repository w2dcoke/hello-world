package com.springdemo.helloworld.controller;

import com.springdemo.helloworld.domain.DeptManager;
import com.springdemo.helloworld.service.DeptManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author why
 * @date 2022/4/24
 */
@Controller
public class TableController {
    @Autowired
    DeptManagerService deptManagerService;

    @GetMapping("/basic_table")
    public String baseTable() {
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamicTable(Model model) {
        List<DeptManager> deptManagers = deptManagerService.list();
        model.addAttribute("deptManagers", deptManagers);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsiveTable() {
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editableTable() {
        return "table/editable_table";
    }
}
