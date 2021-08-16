import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifeCycleHooksTest {
	
	LifeCycleHooks hooks;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("Running before all....");
	}
	
	@BeforeEach
	void init() {
		hooks=new LifeCycleHooks();
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("Running After each method..");
	}
	
	@Test
	void addTest() {
		int expected=6;
		int actual=hooks.add(3,3);
		assertEquals(expected,actual,"Adds two numbers");
	}
	
	@Test
	void subTest() {
		int expected=6;
		int actual=hooks.sub(10,4);
		assertEquals(expected,actual,"Subtracts two numbers");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("Running after all....");
	}




}
