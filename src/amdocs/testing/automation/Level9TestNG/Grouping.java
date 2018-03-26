package amdocs.testing.automation.Level9TestNG;

import org.testng.annotations.Test;

public class Grouping {
  @Test (groups = {"car"})
  public void car1() {
	  System.out.println("This is test1 for car");
  }
  
  @Test (groups = {"car"})
  public void car2() {
	  System.out.println("This is test2 for car");
  }
  
  @Test (groups = {"scooter"})
  public void Scooter1() {
	  System.out.println("This is test1 for scooter");
  }
  
  @Test (groups = {"scooter"})
  public void Scooter2() {
	  System.out.println("This is test2 for scooter");
  }
  
  @Test (groups = {"car" , "sedan car"})
  public void Sedan1() {
	  System.out.println("This is test1 for seedan car");
  }
  
}
