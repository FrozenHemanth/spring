package com.frozen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.frozen.comp")
public class ApplicationConfiguration {
    public ApplicationConfiguration(){
        System.out.println("ApplicationConfiguration started.");
    }

    @Bean
    public String name(){
        return "Hemanth";
    }
    @Bean
    public String name2(){
        return "Akash";
    }
}


