package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariableController {

    @RequestMapping("/hi/{name}")
    public String hello(@PathVariable String name){
        return "Welcome to Agra "+name;
    }
    @RequestMapping("/myAge/{age}")
   public String checkAge(@PathVariable int age){
        if (age>60){
            return "You are senior citizen";
        }
        else if (age>50){
            return "You are old";
        }
        else if (age>40){
            return "You are adult";
        }
        else if (age>30){
            return "You are working";
        }
        else{
            return "You are a man";
        }
   }

   @RequestMapping("/my_salary/{salary}")
   public String checkSalary(@PathVariable int salary){
        if (salary>100000){
            return "Your package is high";
        }
        else if (salary>80000){
            return "Your package is good";
        }
        else if (salary>60000){
            return "Your package is average";
        }
        else{
            return "Your package is moderate";
        }
   }
}
