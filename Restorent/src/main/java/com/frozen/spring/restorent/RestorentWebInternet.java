package com.frozen.spring.restorent;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class RestorentWebInternet extends AbstractAnnotationConfigDispatcherServletInitializer {
    public void connect() {
        System.out.println("RestorentWebInternet connected");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("root config classes");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("servlet config classes");
        return new Class[]{RestorentPrimaryConfigurations.class, RestorentDataBaseConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("servlet mappings");
        return new String[]{"/Home","/Home2","/table"};
    }

}
