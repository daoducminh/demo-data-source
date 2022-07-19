package com.example.demodatasource.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class IndexController {
    @GetMapping("/api")
    public ResponseEntity<Object> getApi() {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/form")
    public ResponseEntity<Object> getForm() {
        return ResponseEntity.ok().build();
    }

    @PostMapping("/form")
    public ResponseEntity<Object> postForm() {
        return ResponseEntity.ok().build();
    }
}
