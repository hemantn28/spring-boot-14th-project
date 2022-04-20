package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamCalculator {

    @RequestMapping("/check_to_add")
    public String makeAdd(@RequestParam int a,@RequestParam int b){
        return "addition is: "+(a+b);

    }

    @RequestMapping("/check_minus")
    public int makeSubtract(@RequestParam int a,@RequestParam int b){
        int c=a-b;
        return c;
    }

    @RequestMapping("/check_division")
    public String makeDivide(@RequestParam int a,@RequestParam int b){
        int c=a/b;
        return "division is "+c;
    }

    @RequestMapping("/check_to_multiply")
    public String makeMyMultiply(@RequestParam int a,@RequestParam int b){
        return "multiplication is "+(a*b);
    }
}
