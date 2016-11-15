package app;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import configuration.MvcConfigure;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
 
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { configuration.MvcConfigure.class };
    }
  
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
 
}

