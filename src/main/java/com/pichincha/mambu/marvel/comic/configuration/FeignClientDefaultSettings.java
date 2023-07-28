package com.pichincha.mambu.marvel.comic.configuration;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientDefaultSettings implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
    }
}
