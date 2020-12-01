package com.perflibnetcracker.templateservice.controller;

import com.perflibnetcracker.templateservice.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final HelloService helloService;

    @Autowired
    public TestController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("test")
    private ResponseEntity<String> test() {
        return ResponseEntity.ok(helloService.getHello());
    }
}
