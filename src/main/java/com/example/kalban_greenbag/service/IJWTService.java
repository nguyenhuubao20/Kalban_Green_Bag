package com.example.kalban_greenbag.service;

import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;

public interface IJWTService {
    String extractUserName(String token);

    String generateToken(UserDetails userDetails);

    boolean isTokenValid(String token, UserDetails userDetails);

    String generateRefreshToken(Map<String, Object> extraClaims, UserDetails userDetails);

    String extractBearerToken(String authorizationHeader);
}
