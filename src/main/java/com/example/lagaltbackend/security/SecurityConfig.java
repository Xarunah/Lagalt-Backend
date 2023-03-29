package com.example.lagaltbackend.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@EnableWebSecurity
@Configuration

public class SecurityConfig {


    private static final String[] AUTH_WHITELIST = {
            // -- Swagger UI v2
            "/v2/api-docs",
            "/swagger-resources",
            "/swagger-resources/**",
            "/configuration/ui",
            "/configuration/security",
            "/swagger-ui.html",
            "/webjars/**",
            // -- Swagger UI v3 (OpenAPI)
            "/v3/api-docs/**",
            "/swagger-ui/**"

    };


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .cors().and()
                // Sessions will not be used
                .sessionManagement().disable()
                // Disable CSRF -- not necessary when there are no sessions
                .csrf().disable()
                // Enable security for http requests
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers ("/api/v1/project/list","/api/v1/project/list**").permitAll ()
                        .requestMatchers(AUTH_WHITELIST).permitAll()
                        .requestMatchers ("/api/v1/user/","/api/v1/user/**").permitAll ()//TODO clean up
                        //.requestMatchers("/api/v1/resources/authorized").hasAnyAuthority()
                        // All endpoints are protected
                        .anyRequest().authenticated()
                )
                .oauth2ResourceServer()
               .jwt();
        return http.build();
    }
}