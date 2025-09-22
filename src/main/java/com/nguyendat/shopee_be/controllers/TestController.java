package com.nguyendat.shopee_be.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/123")
    public String Test(){
        return "Hello World";
    }

}
