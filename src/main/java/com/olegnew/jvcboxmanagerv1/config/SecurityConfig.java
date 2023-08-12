package com.olegnew.jvcboxmanagerv1.config;

import com.olegnew.jvcboxmanagerv1.service.CustomUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private CustomUserDetailService customUserDetailService;

    @Autowired
    public void setCustomUserDetailService(CustomUserDetailService customUserDetailService) {
        this.customUserDetailService = customUserDetailService;
    }

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("login").permitAll()
                        .requestMatchers(HttpMethod.GET, "/v1/user/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.POST, "/v1/user/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/v1/user/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PATCH, "/v1/user/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/v1/user/**").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/v1/cbox/**")
                        .hasAnyRole("OPERATOR", "USER")
                        .requestMatchers(HttpMethod.PUT, "/v1/cbox/**").hasRole("OPERATOR")
                        .requestMatchers(HttpMethod.POST, "/v1/cbox/**").hasRole("OPERATOR")
                        .requestMatchers(HttpMethod.PATCH, "/v1/cbox/**").hasRole("OPERATOR")
                        .requestMatchers(HttpMethod.DELETE, "/v1/cbox/**").hasRole("OPERATOR")
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll());

        return http.build();
    }

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider daoAuthenticationProvider() {
        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
        authenticationProvider.setPasswordEncoder(getEncoder());
        authenticationProvider.setUserDetailsService(customUserDetailService);
        return authenticationProvider;
    }
}
