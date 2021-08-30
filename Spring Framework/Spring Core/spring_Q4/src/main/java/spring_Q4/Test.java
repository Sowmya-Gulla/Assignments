package spring_Q4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context = 
		         new AnnotationConfigApplicationContext(Config.class);
		   
		      HelloWorld h = context.getBean(HelloWorld.class);
		      h.setMessage("Hello World!");
		      h.getMessage();



	}

}
