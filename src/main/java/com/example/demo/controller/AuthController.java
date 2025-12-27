package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.config.JwtProvider;
import org.springframework.security.crypto.password.PasswordEncoder;


@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    @Autowired
    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtProvider jwtProvider;
   

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        return ResponseEntity.ok(userService.register(user));
    }

   
    @PostMapping("/login")
public ResponseEntity<?> login(@RequestBody Map<String, String> request) {

    String email = request.get("email");
    String password = request.get("password");

    User user = userService.findByEmail(email);

    if (user == null) {
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    if (!passwordEncoder.matches(password, user.getPassword())) {
        return ResponseEntity.status(401).body("Invalid credentials");
    }

    // SUCCESS case
    String token = jwtProvider.generateToken(user.getEmail(), user.getRoles());
    return ResponseEntity.ok(token);
}


}
