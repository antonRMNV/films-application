package com.example.springbootfilms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
public class SpringbootfilmsApplication extends WebMvcConfigurationSupport {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootfilmsApplication.class, args);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		if (!registry.hasMappingForPattern("/assets/**")) {
			registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
		}
	}
}
