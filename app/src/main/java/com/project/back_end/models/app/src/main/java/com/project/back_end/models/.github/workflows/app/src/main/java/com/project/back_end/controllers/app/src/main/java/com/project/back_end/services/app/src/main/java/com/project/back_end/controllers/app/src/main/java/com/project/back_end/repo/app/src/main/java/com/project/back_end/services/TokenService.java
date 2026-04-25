package com.project.back_end.services;

import org.springframework.stereotype.Service;

@Service
public class TokenService {

    public String generateToken(String email) {
        return "dummy-jwt-token-for-" + email;
    }

    public String getSigningKey() {
        return "secret-key";
    }
}
