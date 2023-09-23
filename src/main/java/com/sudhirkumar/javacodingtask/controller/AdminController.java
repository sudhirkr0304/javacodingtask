package com.sudhirkumar.javacodingtask.controller;

import com.sudhirkumar.javacodingtask.model.UserDetailResponse;
import com.sudhirkumar.javacodingtask.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return adminService.hello();
    }
}
