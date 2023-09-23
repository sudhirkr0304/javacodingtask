package com.sudhirkumar.javacodingtask.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/demo")
@RequiredArgsConstructor
public class DemoController {



    @PreAuthorize("hasRole('admin')")
    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        System.out.println("sudhir kumar");
        return ResponseEntity.ok("Hello from secure api");
    }
}
