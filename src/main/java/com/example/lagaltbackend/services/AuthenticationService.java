/*package com.example.lagaltbackend.services;

import com.example.lagaltbackend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
// this class is not used yet
@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepository;

  public String getBearerToken(HttpServletRequest request) {
        String bearerToken = null;
        String authorization = request.getHeader("Authorization");
        if (StringUtils.hasText(authorization) && authorization.startsWith("Bearer ")) {
            bearerToken = authorization.substring(7);
        }
        return bearerToken;
    }


    public String getUserId(){

        Jwt jwt= (Jwt) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String user_name=jwt.getClaimAsString("sub");
        return user_name;
    }



}*/
