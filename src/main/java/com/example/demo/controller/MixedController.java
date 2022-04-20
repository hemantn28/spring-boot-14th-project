package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MixedController {

    @RequestMapping("/print")
    public int makeInteger(){
        return 33;
    }

    @RequestMapping("/info")
    public double makeDouble(){
        return 85.5;
    }

    @RequestMapping("maths")
    public String mathsAddition(){
        int a=45;
        int b=45;
        return "addition is "+(a+b);
    }

    @RequestMapping("bodmas")
    public int mathsSubtract(){
        int a=21;
        int b=20;
        int c=a-b;
        return c;
    }

    @RequestMapping("vibgyor")
    public String mathsDivide(){
        int a=6;
        int b=3;
        int c=a*b;
        return "multiplication is "+c;
    }

    @RequestMapping("sun")
    public String mathsMultiply(){
        int a=9;
        int b=8;
        int c=a*b;
        return "multiplication is "+c;
    }
}
