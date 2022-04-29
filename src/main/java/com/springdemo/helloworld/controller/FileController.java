package com.springdemo.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author why
 * @date 2022/4/26
 */
@Controller
public class FileController {
    @GetMapping("/form_layouts")
    public String formLayouts() {
        return "form/form_layouts";
    }

    @PostMapping("/uploadFile")
    public String uploadFile(@RequestParam("email") String email,
                             @RequestParam("username") String username,
                             @RequestPart("headerImage") MultipartFile headerImage,
                             @RequestPart("photos") MultipartFile[] files) throws IOException {
        if (!headerImage.isEmpty()) {
            headerImage.transferTo(new File("C:/tmp/" + headerImage.getOriginalFilename()));
        }
        if (files.length > 0) {
            for (MultipartFile file : files) {
                file.transferTo(new File("C:/tmp/" + file.getOriginalFilename()));
            }
        }
        return "index";
    }
}
