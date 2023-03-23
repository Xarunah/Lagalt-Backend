package com.example.lagaltbackend.config;


import lombok.RequiredArgsConstructor;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {


  @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http

              .cors(cors -> cors.disable());
             /* .and()
              .csrf()
              .disable()
              .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
              .and()


              .authorizeHttpRequests((requests) -> requests
                      .antMatchers("/**","/login","/oauth2/**")
                      .permitAll()
                      .anyRequest()
                      .authenticated()

              );
           /**   .oauth2ResourceServer(oauth2 -> {
                oauth2.jwt();
              });*/
        return http.build();
    }



}
