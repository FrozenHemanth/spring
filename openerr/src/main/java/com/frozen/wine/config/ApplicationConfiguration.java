package com.frozen.wine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"com.frozen.wine.component","com.frozen.wine.service"})
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println("Running ApplicationConfiguration constructor.");
    }

}


