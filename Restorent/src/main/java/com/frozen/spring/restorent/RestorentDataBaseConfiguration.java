package com.frozen.spring.restorent;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
public class RestorentDataBaseConfiguration {
    public  RestorentDataBaseConfiguration() {
        System.out.println("RestorentDataBaseConfiguration connected");
    }
}
