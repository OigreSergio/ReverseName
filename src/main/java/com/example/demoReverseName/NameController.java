package com.example.demoReverseName;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return new StringBuilder(name).reverse().toString();
    }
}
