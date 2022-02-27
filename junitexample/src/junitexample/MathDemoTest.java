package junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import mainjava.MathDemo;

class MathDemoTest {

	private MathDemo demo = new MathDemo();
	
//	The annotated method will be run before all test methods in the test class and it miust be static
	
	@BeforeAll
	static void setup() {
		System.out.println("@BeforeAll executed");
	}
	
//	The annotated method will be run before each test method in the test class
	
	@BeforeEach
	void setupThis()
	{
		System.out.println("@BeforeEach executed.");
	}
	
	
	@Test
	@Disabled
	//It is used to mark a method as junit test
	public void testAdd() {
		MathDemo demo = new MathDemo();
		int result = demo.add(10, 10);
		
		assertEquals(result, 20);
		
	}
	
	@Test
//	@Disabled
	public void testAddFailure() {
		
		int result = demo.add(10, 10);
		
		assertNotEquals(result, 22);
		
	}
	
	
	@AfterEach
	void tearThis() {
		System.out.println("@AfterEach executed");
	}
	
	@AfterAll
	static void tear() {
		System.out.println("@AfterAll executed.");
	}
	

}
