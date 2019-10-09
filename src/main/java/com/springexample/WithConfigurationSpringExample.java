package com.springexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WithConfigurationSpringExample {
	
	@Bean(name = "springservice")
	public SpringExampleService service() {
		return new SpringExampleService();
	}
}
