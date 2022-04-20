package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestParamController {

    @RequestMapping("/hello")
    public String message(@RequestParam String name){
        return "Welcome to Spring boot app "+name;
    }

    @RequestMapping("/msg")
    public String hello(@RequestParam String name){
        return "Hey, wassup"+name;
    }

    @RequestMapping("/go")
    public String trip(@RequestParam String city){
        return "Are you going to "+city;
    }

    @RequestMapping("/numbers")
    public String marks(@RequestParam int marks){
        if (marks>95){
            return "extraordinary student";
        }
        else if (marks>80){
            return "brilliant student";
        }
        else if (marks>60){
            return "intelligent student";
        }
        else{
            return "average student";
        }
    }

    @RequestMapping("/add")
    public String addition(@RequestParam int a,@RequestParam int b){
        return "addition is: "+(a+b);
    }

    @RequestMapping("/subtract")
    public String subtract(@RequestParam int a,@RequestParam int b){
        int c=a-b;
        return "subtraction is: "+c;
    }

    @RequestMapping("/multiplication")
    public String multiply(@RequestParam int a,@RequestParam int b){
        int c=a*b;
        return "multiplication is "+c;
    }

    @RequestMapping("/by")
    public String divide(@RequestParam int a,@RequestParam int b){
        return "division is "+(a/b);
    }
}
