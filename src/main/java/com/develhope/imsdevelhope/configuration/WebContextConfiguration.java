package com.develhope.imsdevelhope.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * configuration for the web context.
 * @author kamar baraka.*/

public class WebContextConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {AppContextConfiguration.class, };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
