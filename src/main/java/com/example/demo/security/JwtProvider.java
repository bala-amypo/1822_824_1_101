package com.example.demo.security;

import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class JwtProvider {

    public String generateToken(String email, Long userId, Set<String> roles) {
        return "dummy.jwt.token";
    }

    public boolean validateToken(String token) {
        return true;
    }

    public String getEmailFromToken(String token) {
        return "test@test.com";
    }

    public Long getUserId(String token) {
        return 1L;
    }
}
