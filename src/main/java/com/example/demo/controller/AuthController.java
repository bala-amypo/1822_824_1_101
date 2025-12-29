package com.example.demo.controller;

import com.example.demo.config.JwtProvider;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtProvider jwtProvider;

    // REGISTER
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Map<String, String> req) {

        User user = new User();
        user.setName(req.get("name"));
        user.setEmail(req.get("email"));
        user.setPassword(req.get("password"));
        user.setCreatedAt(LocalDateTime.now());

        // 🔥 THIS IS THE FIX (LINE 43 PROBLEM)
        user.setRoles(List.of("ROLE_USER"));

        userRepository.save(user);
        return ResponseEntity.ok("User registered");
    }

    // LOGIN
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody Map<String, String> req) {

        User user = userRepository.findByEmail(req.get("email"))
                .orElseThrow(() -> new RuntimeException("User not found"));

        String token = jwtProvider.generateToken(
                user.getEmail(),
                user.getId(),
                Set.copyOf(user.getRoles())
        );

        return ResponseEntity.ok(Map.of("token", token));
    }
}
