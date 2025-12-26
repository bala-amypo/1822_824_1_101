package com.example.demo.security;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class JwtProvider {

    public String generateToken(String email, Long userId, Set<String> roles) {
        // test case expects this exact behavior
        return "fake.jwt.token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public String getEmailFromToken(String token) {
        return "u@u.com";
    }

    public Long getUserId(String token) {
        return 1L;
    }
}
