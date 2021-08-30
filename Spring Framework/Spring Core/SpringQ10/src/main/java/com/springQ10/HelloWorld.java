package com.springQ10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld implements ApplicationContextAware,BeanNameAware {
	private String msg;
	private ApplicationContext context=null;

	public void getMsg() {
		System.out.println(msg);;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void setBeanName(String name) {
		System.out.println("Bean Name:"+name);
			
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context=context;		
	}

}
