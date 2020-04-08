package org.javaboy.converter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @GetMapping("get")
    public String get(Date date){
        System.out.println(date);
        return "success";
    }
}
