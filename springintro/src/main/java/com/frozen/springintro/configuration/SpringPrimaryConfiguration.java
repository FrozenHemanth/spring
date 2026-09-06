package com.frozen.springintro.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class SpringPrimaryConfiguration {
    public SpringPrimaryConfiguration() {
        System.out.println("spring primary configuration is created...");
        System.out.println("----------------------- ...");
    }
}
