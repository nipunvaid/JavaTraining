package amdocs.testing.automation.Level2BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSafariRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new SafariDriver();
		
		driver.get("http://www.facebook.com");
		
		System.out.println("Website is Launched");
		
		Thread.sleep(5);
		
	}

}
