package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {

    public static void main(String[] args) {
        System.out.println("Hello World");
        SpringApplication.run(HelloApplication.class, args);
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam(value="name", defaultValue = "Techie") String name)
    {
        return String.format("Hello %s!!!",name);
    }

}
