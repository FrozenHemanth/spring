package com.frozen.springintro.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrozenWenInternet extends AbstractAnnotationConfigDispatcherServletInitializer {

    public FrozenWenInternet() {
        System.out.println("frozen web internet");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("root config classes");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
