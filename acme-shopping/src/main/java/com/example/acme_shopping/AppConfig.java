package com.example.acme_shopping;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class AppConfig {

    @Bean(name = "externalConfig")
    @ConfigurationProperties(prefix = "app")
    public Map<String, String> externalConfig() {
        return new HashMap<>();
    }

}
