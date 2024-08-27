package com.example.acme_shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AcmeShoppingController {

    @Value("${app.welcome}") String welcomeMessage;

    @Autowired
    @Qualifier(value = "externalConfig")
    private Map<String, String> externalConfig;

    @GetMapping("/greeting")
    public String greeting() {
        return welcomeMessage;
    }

    @GetMapping("/config")
    public Map<String, String> getAppConfig() {
        return externalConfig;
    }
}
