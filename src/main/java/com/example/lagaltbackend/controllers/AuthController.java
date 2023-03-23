/*package com.example.lagaltbackend.controllers;


import com.example.lagaltbackend.dto.UserDto;
import com.example.lagaltbackend.services.AuthenticationService;
import com.example.lagaltbackend.services.UserService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;


/**
 * The authentication is done using oAuth2 google Jwt
 *
 * it can be done as follows,
 * 1) Generate a token with postman using oAuth2 token generator
 * using gmail login
 * 2)copy the token and past it to Bearer, it will authorize all request
 */
/*@RestController
@RequiredArgsConstructor
public class AuthController {




    @GetMapping("/oauth2/callback/google")
    public Principal callbackGoogle(Principal principal,HttpServletRequest request) {
        return principal;

    }

    /**
     *
     * @return All the user properties after authentication
     */
   /* @GetMapping("/loginSuccess")
    public ResponseEntity<?> loginSuccess() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Jwt jwt= (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Object claims=  jwt.getClaims();
        System.out.println(claims);

        return   ResponseEntity.ok(claims);

    }

}*/
