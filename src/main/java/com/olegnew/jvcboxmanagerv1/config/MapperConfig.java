package com.olegnew.jvcboxmanagerv1.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper getMapper() {
        return new ModelMapper();
    }
}
