package com.olegnew.jvcboxmanagerv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class JvCboxManagerV1Application {

    public static void main(String[] args) {
        SpringApplication.run(JvCboxManagerV1Application.class, args);
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .httpBasic().and()
                .authorizeHttpRequests()
                
                .anyRequest().authenticated().and()
                .build();
    }
}
