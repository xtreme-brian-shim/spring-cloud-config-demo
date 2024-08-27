package com.example.acme_shopping;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GreetingController {

    @Value("${app.welcome}") String welcomeMessage;

    @GetMapping("/greeting")
    public String greeting() {
        return welcomeMessage;
    }

}
