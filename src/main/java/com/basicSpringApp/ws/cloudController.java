package com.basicSpringApp.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cloudController {

    @GetMapping("/hello")
    public String hello() {
        return "This is a dummy message to indicate that the service is working";
    }
}
