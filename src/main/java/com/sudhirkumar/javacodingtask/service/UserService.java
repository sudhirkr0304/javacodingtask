package com.sudhirkumar.javacodingtask.service;

import com.sudhirkumar.javacodingtask.config.JwtService;
import com.sudhirkumar.javacodingtask.model.UserDetailResponse;
import com.sudhirkumar.javacodingtask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;


    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;


    public ResponseEntity<UserDetailResponse> getCurrentUser() {


        return null;
    }

    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello from user");
    }
}
