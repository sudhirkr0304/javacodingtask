package com.sudhirkumar.javacodingtask.service;

import com.sudhirkumar.javacodingtask.model.AuthenticationRequest;
import com.sudhirkumar.javacodingtask.model.AuthenticationResponse;
import com.sudhirkumar.javacodingtask.config.JwtService;
import com.sudhirkumar.javacodingtask.model.Role;
import com.sudhirkumar.javacodingtask.model.User;
import com.sudhirkumar.javacodingtask.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;


    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(AuthenticationRequest.RegisterRequest request) {

        System.out.println(request.getRole());

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setUsername(request.getEmail());
        user.setPassword(passwordEncoder.encode(request.getPassword()));
        if(request.getRole() != null && request.getRole().equals("admin")) {
            user.setRole(Role.admin);
        }
        else {
            user.setRole(Role.user);
        }

        userRepository.save(user);

        String jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse.builder().token(jwtToken).build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );

        User user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        String jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse.builder().token(jwtToken).build();
    }
}
