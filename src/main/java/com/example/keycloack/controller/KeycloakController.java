package com.example.keycloack.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class KeycloakController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Jwt token = (Jwt) principal;
        return ResponseEntity.ok(String.format("Hello %s",token.getClaim("preferred_username").toString()));
    }
}
