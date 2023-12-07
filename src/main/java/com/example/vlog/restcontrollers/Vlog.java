package com.example.vlog.restcontrollers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vloger")
public class Vlog {

    @GetMapping("/impmessage")
    public ResponseEntity<String> getMessage(){
        return ResponseEntity.ok("Hello from Spring Boot");
    }
}
