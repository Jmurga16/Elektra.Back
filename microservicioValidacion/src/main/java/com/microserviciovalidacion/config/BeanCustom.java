package com.microserviciovalidacion.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanCustom {

    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
