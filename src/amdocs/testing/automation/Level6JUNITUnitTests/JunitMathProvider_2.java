package amdocs.testing.automation.Level6JUNITUnitTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import amdocs.testing.automation.Level5JUNITApplication.MathProvider;

public class JunitMathProvider_2 {

	MathProvider provider;
	
	public JunitMathProvider_2(){
		provider = new MathProvider();
	};
	
	
	
	@Test
	public void MultiplyTest() {
		System.out.println("Starting Test " + new Object() {}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber = 20;
		System.out.println(provider.Multiply(firstNumber, secondNumber));
		assertEquals(firstNumber * secondNumber , provider.Multiply(firstNumber, secondNumber));
		System.out.println("Ending Test "+ new Object() {}.getClass().getEnclosingMethod().getName());
		}

}
