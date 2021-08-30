package com.SpEL;

import java.util.List;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();
		Expression exp=parser.parseExpression("'Hello'");//'hello'.concat('!')
		
		//String message =(String) exp.getValue();
		String message=(String) exp.getValue();
		System.out.println(message);
		
		@SuppressWarnings("unchecked")
		List<Integer> numbers = (List<Integer>) parser.parseExpression("{1,2,3,4}").getValue(exp);
		System.out.println(numbers);
		
		

	}

}
