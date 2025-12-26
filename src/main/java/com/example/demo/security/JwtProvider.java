package com.example.demo.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.function.Function;

@Component
public class JwtProvider {

    private static final String SECRET_KEY = "mySecretKey12345";
    private static final long EXPIRATION_TIME = 1000 * 60 * 60; // 1 hour

    // 🔹 Generate JWT token
    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(
                        new Date(System.currentTimeMillis() + EXPIRATION_TIME)
                )
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }

    // 🔹 Extract username from token
    public String getUsernameFromToken(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    // 🔹 Validate token
    public boolean validateToken(String token) {
        return !isTokenExpired(token);
    }

    // 🔹 Check expiration
    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    // 🔹 Extract expiration
    private Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    // 🔹 Generic claim extractor
    private <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    // 🔹 Parse token
    private Claims extractAllClaims(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET_KEY)
                .parseClaimsJws(token)
                .getBody();
    }
}
