package amdocs.testing.automation.Level9TestNG;

import org.testng.annotations.Test;

public class PrioritySkip {
	@Test(priority = 0)
	  public void One() {
	  }
	  
	  @Test(priority = 1)
	  public void Two() {
	  }
	  //Skip the test
	  @Test(priority = 2,enabled = false)
	  public void Three() {
	  }
	  
	  @Test(priority = 3)
	  public void Four() {
	  }
}
