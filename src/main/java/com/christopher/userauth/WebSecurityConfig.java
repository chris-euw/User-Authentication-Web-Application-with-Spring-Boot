package com.christopher.userauth;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

// Enables Spring Security for this configuration
@EnableWebSecurity
public class WebSecurityConfig {

    // This method defines the security rules for HTTP requests (like a gatekeeper for routes)
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
                .authorizeHttpRequests((requests) -> requests
                        // Allow public access to "/" and "/home"
                        .requestMatchers("/", "/home").permitAll()
                        // All other endpoints require the user to be authenticated (logged in)
                        .anyRequest().authenticated()
                )
                // Enable form-based login
                .formLogin((form) -> form
                        // Use a custom login page at "/login"
                        .loginPage("/login")
                        // Allow all users (even unauthenticated) to access the login page
                        .permitAll()
                )
                // Allow everyone to access the logout endpoint
                .logout((logout) -> logout.permitAll());

        // Return the configured security filter chain (Spring's internal security pipeline)
        return http.build();
    }

    // This method defines in-memory user credentials for testing/demo purposes
    @Bean
    public UserDetailsService userDetailsService() {
        // Creates a single user with username "user" and password "password"
        // with the role "USER"
        UserDetails user = User.withDefaultPasswordEncoder() // NOTE: only for testing! Not for production
                .username("user")
                .password("password")
                .roles("USER")
                .build();

        // Store the user in an in-memory user details manager
        return new InMemoryUserDetailsManager(user);
    }
}