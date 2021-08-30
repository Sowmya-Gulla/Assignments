package com.SpringQ6_a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringQ6.class);
        Data s=(Data) context.getBean("data");
        s.display();
        
    }
}
