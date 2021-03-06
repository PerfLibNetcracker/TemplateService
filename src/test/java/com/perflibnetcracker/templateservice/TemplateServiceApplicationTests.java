package com.perflibnetcracker.templateservice;

import com.perflibnetcracker.templateservice.service.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TemplateServiceApplicationTests {
    private final String testHello = "Hello World!";
    @Autowired
    private HelloService helloService;

    @Test
    void contextLoads() {
        assertEquals(testHello, helloService.getHello());
    }
}
