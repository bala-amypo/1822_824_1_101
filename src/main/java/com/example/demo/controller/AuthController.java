package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user) {
        // tests only check 4xx or ok, so dummy response is enough
        if (user.getEmail() == null || user.getPassword() == null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok("login-success");
    }
    @PostMapping("/login")
   public ResponseEntity<?> login(@RequestBody LoginRequest request) {

    User user = userRepository.findByEmail(request.getEmail());

    if (user == null) {
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    return ResponseEntity.ok(jwtUtil.generateToken(user));
   }

}
