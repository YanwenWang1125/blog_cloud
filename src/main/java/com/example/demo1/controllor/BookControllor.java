package com.example.demo1.controllor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookControllor {

    @GetMapping
    public String getById(){
        System.out.println("Running");
        return "Running boots";

    }

}
