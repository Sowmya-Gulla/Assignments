package com.SpringQ6_a;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
@Configuration
@PropertySource("classpath:dbconfig.properties")
public class SpringQ6 {
	
	@Value("${url}")
	private String url;
	@Value("${user}")
	private String username;
	@Value("${password}")
	private String password;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertysources(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	
	@Bean
	public Data data() {
		return new Data(url,username,password);
	}
	
}
