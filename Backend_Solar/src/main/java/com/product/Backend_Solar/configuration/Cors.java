package com.product.Backend_Solar.configuration;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class Cors {


    private static final String GET = "GET";
    private static final String POST = "POST";
    private static final String DELETE = "DELETE";
    private static final String PUT = "PUT";


    public WebMvcConfigurer corsConfigurer(){
        return new WebMvcConfigurer() {


            @Override
            public void addCorsMappings(CorsRegistry registry) {
               registry.addMapping("/**")
                       .allowedMethods(GET,PUT,POST,DELETE)
                       .allowedHeaders("*")
                       .allowedOriginPatterns("*")
                       .allowCredentials(true)
                       ;

            }


        };
    }
}
