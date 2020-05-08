package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;
 
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoprojectApplication {
	@RequestMapping("/")
    String home() {
        return("Hello World Spring Boot!");
    }
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoprojectApplication.class, args);
	
		
		 
	}

}
