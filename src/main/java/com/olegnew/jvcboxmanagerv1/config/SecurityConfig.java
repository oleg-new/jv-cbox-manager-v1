package com.olegnew.jvcboxmanagerv1.config;

import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.PATCH;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;
import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;

import com.olegnew.jvcboxmanagerv1.service.CustomUserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@RequiredArgsConstructor
public class SecurityConfig {
    private CustomUserDetailService customUserDetailService;

    @Autowired
    public void setCustomUserDetailService(CustomUserDetailService customUserDetailService) {
        this.customUserDetailService = customUserDetailService;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> {
                    //auth.requestMatchers(antMatcher("/login")).permitAll();
                    auth.requestMatchers(antMatcher(GET,"/v1/user/**")).hasRole("ADMIN");
                    auth.requestMatchers(antMatcher(POST, "/v1/user/**")).hasRole("ADMIN");
                    auth.requestMatchers(antMatcher(PUT, "/v1/user/**")).hasRole("ADMIN");
                    auth.requestMatchers(antMatcher(PATCH, "/v1/user/**")).hasRole("ADMIN");
                    auth.requestMatchers(antMatcher(DELETE, "/v1/user/**")).hasRole("ADMIN");
                    auth.requestMatchers(antMatcher(GET, "/v1/cbox/**"))
                            .hasAnyRole("OPERATOR", "USER");
                    auth.requestMatchers(antMatcher(POST, "/v1/cbox/**")).hasRole("OPERATOR");
                    auth.requestMatchers(antMatcher(PUT, "/v1/cbox/**")).hasRole("OPERATOR");
                    auth.requestMatchers(antMatcher(PATCH, "/v1/cbox/**")).hasRole("OPERATOR");
                    auth.requestMatchers(antMatcher(DELETE, "/v1/cbox/**")).hasRole("OPERATOR");
                    auth.anyRequest().authenticated();
                })
                .httpBasic(Customizer.withDefaults())
                .build();
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
