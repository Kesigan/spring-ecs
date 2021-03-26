package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloWorldController {
 
    @GetMapping("/hello")
    public String sayHello() {
<<<<<<< HEAD
        return "Hello world spring boot ECS!";
=======
        return "Hello world Kesigan!";
>>>>>>> c005b8a06da7996ee468280bb5e16f4a039f10bf
    }
}
