package com.frozen.inventrymanagement.config;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfiguration {
    @Autowired
    Environment environment;
    public DatabaseConfiguration(){
        System.out.println("The DatabaseConfiguration is created");
    }
}
