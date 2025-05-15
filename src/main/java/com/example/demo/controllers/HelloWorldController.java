package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Indica que esta clase es un controlador REST
public class HelloWorldController {

    @GetMapping("/helloWorld") // Define el endpoint accesible en "/helloWorld"
    public String helloWorld(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return "Hello " + name;
    }
}