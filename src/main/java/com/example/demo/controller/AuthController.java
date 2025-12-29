package com.example.demo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.JwtProvider;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import java.util.List;


// @RestController
// @RequestMapping("/auth")
// public class AuthController {

//     @Autowired
//     private UserService userService;

//     @Autowired
//     private PasswordEncoder passwordEncoder;

//     @Autowired
//     private JwtProvider jwtProvider;

//     // -------- REGISTER --------
//     @PostMapping("/register")
//     public ResponseEntity<User> register(@RequestBody User user) {
//         return ResponseEntity.ok(userService.register(user));
//     }

//     // -------- LOGIN --------
//     @PostMapping("/login")
//     public ResponseEntity<String> login(@RequestBody User user) {

//         if (user.getEmail() == null || user.getPassword() == null) {
//             return ResponseEntity.badRequest().build();
//         }

//         User dbUser = userService.findByEmail(user.getEmail());

//         if (dbUser == null) {
//             return ResponseEntity.status(401).body("Invalid credentials");
//         }

//         if (!passwordEncoder.matches(user.getPassword(), dbUser.getPassword())) {
//             return ResponseEntity.status(401).body("Invalid credentials");
//         }

//         // ---- FIX IS HERE ----
//         String token = jwtProvider.generateToken(
//                 dbUser.getEmail(),
//                 dbUser.getId(),
//                 Set.of("USER")
//         );

//         return ResponseEntity.ok(token);
//     }
// }
@RestController
@RequestMapping("/auth")
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtils jwtUtils;

    public AuthController(UserRepository userRepository,
                          PasswordEncoder passwordEncoder,
                          AuthenticationManager authenticationManager,
                          JwtUtils jwtUtils) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtUtils = jwtUtils;
    }

    // ✅ REGISTER
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setCreatedAt(LocalDateTime.now());

        return ResponseEntity.ok(userRepository.save(user));
    }

    // ✅ LOGIN
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        Authentication authentication =
                authenticationManager.authenticate(
                        new UsernamePasswordAuthenticationToken(
                                request.getEmail(),
                                request.getPassword()
                        )
                );

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = jwtUtils.generateToken(request.getEmail());

        return ResponseEntity.ok(token);
    }
}
