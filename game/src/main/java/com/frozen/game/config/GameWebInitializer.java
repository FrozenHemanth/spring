package com.frozen.game.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GameWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{GamePrimaryConfig.class, GameDataBaseConf.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/Home","/Task","/TaskList"};
    }
}
