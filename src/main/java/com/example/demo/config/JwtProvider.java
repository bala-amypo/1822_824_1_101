// package com.example.demo.config;

// import org.springframework.stereotype.Component;

// import java.util.Set;

// @Component
// public class JwtProvider {

//     public String generateToken(String email, Long userId, Set<String> roles) {
//         // test case expects this exact behavior
//         return "fake.jwt.token";
//     }

//     public boolean validateToken(String token) {
//         return true;
//     }

//     public String getEmailFromToken(String token) {
//         return "u@u.com";
//     }

//     public Long getUserId(String token) {
//         return 1L;
//     }
// }
package com.example.demo.config;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

// @Component
// public class JwtProvider {

//     // 🔐 Secret key (minimum 256-bit)
//     private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

//     // ⏰ Token validity (1 day)
//     private final long jwtExpirationMs = 86400000;

//     // ✅ MAIN METHOD – IDHU DHAAN MISS AAYIRUKKU
//     public String generateToken(Authentication authentication) {

//         String email = authentication.getName();

//         return Jwts.builder()
//                 .setSubject(email)
//                 .setIssuedAt(new Date())
//                 .setExpiration(new Date(new Date().getTime() + jwtExpirationMs))
//                 .signWith(key)
//                 .compact();
//     }

    
//     public boolean validateToken(String token) {
//     try {
//         Jwts.parserBuilder()
//                 .setSigningKey(key)
//                 .build()
//                 .parseClaimsJws(token);
//         return true;
//     } catch (Exception e) {
//         return false;
//     }
// }

// public String getEmailFromToken(String token) {
//     return Jwts.parserBuilder()
//             .setSigningKey(key)
//             .build()
//             .parseClaimsJws(token)
//             .getBody()
//             .getSubject();
// }

// }
@Component
public class JwtProvider {

    private final Key key =
            Keys.hmacShaKeyFor("mysecretkeymysecretkeymysecretkey".getBytes());

    public String generateToken(String email, Long userId, Set<?> roles) {
        return Jwts.builder()
                .setSubject(email)
                .claim("userId", userId)
                .claim("roles", roles)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(key)
                .compact();
    }

    public boolean validateToken(String token) {
        try {
            Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getEmailFromToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }

    public Long getUserId(String token) {
        try {
            return Jwts.parserBuilder()
                    .setSigningKey(key)
                    .build()
                    .parseClaimsJws(token)
                    .getBody()
                    .get("userId", Long.class);
        } catch (Exception e) {
            return null; // ✅ test 55 expects null
        }
    }
}
