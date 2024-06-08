package com.example.cardapio.Config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Permitir solicitações de todos os domínios
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Permitir os métodos HTTP
                .allowedHeaders("*"); // Permitir todos os cabeçalhos
    }

}
