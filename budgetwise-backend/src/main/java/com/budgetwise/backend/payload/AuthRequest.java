package com.budgetwise.backend.payload;

import lombok.Data;

@Data
public class AuthRequest {
    private String name;
    private String email;
    private String password;
    private String role;
}