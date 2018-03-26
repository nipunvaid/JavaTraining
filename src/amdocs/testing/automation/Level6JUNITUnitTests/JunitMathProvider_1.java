package amdocs.testing.automation.Level6JUNITUnitTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import amdocs.testing.automation.Level5JUNITApplication.MathProvider;

public class JunitMathProvider_1 {
	MathProvider provider ;
	
	public JunitMathProvider_1() {
		provider = new MathProvider();
	};
		
	@Test
		public void AddTest() {
		
		System.out.println("Starting Test " + new Object() {}.getClass().getEnclosingMethod().getName());
		int firstNumber = 10;
		int secondNumber= 20;
		System.out.println(firstNumber + secondNumber);
		assertEquals(firstNumber + secondNumber, provider.Add(firstNumber, secondNumber) );
		System.out.println("End Test " + new Object() {}.getClass().getEnclosingMethod().getName());
	}

	@Test
	public void SubtractTest() {
		
		System.out.println("Start Test " + new Object () {}.getClass().getEnclosingMethod().getName());
		int firstNumber = 20 ; 
		int secondNumber = 10 ;
		System.out.println(firstNumber - secondNumber);
		assertEquals(firstNumber - secondNumber, provider.Substract(firstNumber, secondNumber));
		System.out.println("End Test " + new Object() {}.getClass().getEnclosingMethod().getName());
		
		
	}
	
}
