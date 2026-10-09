package com.frozen.wine.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigarator implements WebMvcConfigurer {
    public WebConfigarator() {
        System.out.println("Running WebConfigarator constructor.");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("Running addResourceHandlers().");
        registry.addResourceHandler("/**")
                .addResourceLocations("/static/")
                .addResourceLocations("classpath:/static/");
    }
}
