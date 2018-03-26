package amdocs.testing.automation.Level2BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstChromeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe" ;
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		
		System.out.println("Website is Launched");
		
		driver.findElement(By.id("u_0_13"));
		
		System.out.println("Element Found");
		
	}

}
