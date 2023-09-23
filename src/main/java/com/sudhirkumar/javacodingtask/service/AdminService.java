package com.sudhirkumar.javacodingtask.service;

import com.sudhirkumar.javacodingtask.config.JwtService;
import com.sudhirkumar.javacodingtask.model.UserDetailResponse;
import com.sudhirkumar.javacodingtask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {


    public ResponseEntity<String> hello() {
       return ResponseEntity.ok("Hello from admin");
    }
}
