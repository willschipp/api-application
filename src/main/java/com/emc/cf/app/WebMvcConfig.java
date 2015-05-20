package com.emc.cf.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.emc.cf.app.interceptor.ApiKeyHandler;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(handler());
	}

	@Bean
	public ApiKeyHandler handler() {
		return new ApiKeyHandler();
	}
	
	
}
