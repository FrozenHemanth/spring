package com.frozen.wine.initializer;

import com.frozen.wine.config.ApplicationConfiguration;
import com.frozen.wine.config.DatabaseConfiguration;
import com.frozen.wine.config.WebConfigarator;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationWebInitiazer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("Running getRootConfigClasses().");
        return new Class[]{DatabaseConfiguration.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ApplicationConfiguration.class, WebConfigarator.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
