package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableCalculator {

    @RequestMapping("/plus/{a}/{b}")
    public String addition(@PathVariable int a,@PathVariable int b){
        return "add is "+(a+b);
    }

    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return "addition is "+c;
    }

    @RequestMapping("/check_plus/{a}/{b}")
    public int makePlus(@PathVariable int a,@PathVariable int b){
        int c=a+b;
        return c;
    }

    @RequestMapping("/check_multiple/{a}/{b}")
    public String makeMultiply(@PathVariable int a,@PathVariable int b){
        return "multiplication is "+(a*b);
    }

    @RequestMapping("/request_multiple/{a}/{b}")
    public String makeMultiplication(@PathVariable int a,@PathVariable int b){
        int c=a*b;
        return "multiplication is: "+c;
    }

    @RequestMapping("/add_multiply/{a}/{b}")
    public int verifyMultiplication(@PathVariable int a,@PathVariable int b){
        int c=a*b;
        return c;
    }

}
