package com.decodogs.controllers;

import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("api"
)
public class QuotesController {
    @GetMapping("/quotes")
    public ResponseEntity<?> getAll (HttpRequest request){
        return ResponseEntity.ok(request);
    }
}
