package amdocs.testing.automation.Level9TestNG;

import org.testng.annotations.Test;

public class Dependency {
  @Test(dependsOnMethods = {"OpenBrowser"})
  public void SignIn() {
	  System.out.println("Log in Done");
  }
  
  @Test(dependsOnMethods = {"SignIn"})
  public void LogOut() {
	  System.out.println("Log out done");
  }
  
  @Test
  public void OpenBrowser() {
	  System.out.println("Browser Opened");
  }
  
}
