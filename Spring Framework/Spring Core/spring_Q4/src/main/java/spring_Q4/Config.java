package spring_Q4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean 
	   public HelloWorld helloWorld(){
	      return new HelloWorld();
	   }

}
