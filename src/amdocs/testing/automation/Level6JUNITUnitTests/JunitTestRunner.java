package amdocs.testing.automation.Level6JUNITUnitTests;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class JunitTestRunner {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(JunitMathProvider_1.class , JunitMathProvider_2.class);
		
		System.out.println("The number of test runs are " + result.getRunCount());
		
		System.out.println("The number of failures are " + result.getFailureCount());
		
		for(Failure failure : result.getFailures()) {
			System.out.println("The test failed with " + failure.getMessage());
		}
		
		System.out.println("the test passed with "+ result.wasSuccessful());
			

	}

}
