package com.frozen.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class WebConfgarator implements WebMvcConfigurer {

    public WebConfgarator() {
        System.out.println("WebConfgarator started.");

    }
    @Override
public void addResourceHandlers(ResourceHandlerRegistry registry) {
        System.out.println("Running addResourceHandlers().");
        registry.addResourceHandler("/images/**")
                .addResourceLocations("file:/C:/Users/kumar/Desktop/spring/Traction/src/static/images/");
    }
}


