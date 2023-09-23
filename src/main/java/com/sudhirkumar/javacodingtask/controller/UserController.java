package com.sudhirkumar.javacodingtask.controller;


import com.sudhirkumar.javacodingtask.model.UserDetailResponse;
import com.sudhirkumar.javacodingtask.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    public ResponseEntity<UserDetailResponse> getCurrentUserDetail() {
        return userService.getCurrentUser();
    }
}
