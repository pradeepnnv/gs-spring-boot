package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        String env = System.getenv("ENVIRONMENT");
        if(env==null || env.isBlank()) {
        env = "Dev";
        }
        String msg = "Greetings from Spring Boot!"
				+env
                ;
        return msg;
    }

}
