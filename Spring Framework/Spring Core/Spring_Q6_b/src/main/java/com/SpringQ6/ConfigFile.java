package com.SpringQ6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigFile {

	@Bean
	public Consumer consume1() {
		return new Consumer(product1());	
	}
	
	@Bean
	public Product product1() {
		return new Product("Apple",112.0,1222);
	}
	
}
