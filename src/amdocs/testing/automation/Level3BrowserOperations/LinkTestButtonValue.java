package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTestButtonValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe" ;
		
		System.setProperty("webdriver.chrome.driver" , exPath) ;
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form/");
		
		//WebElement LinkElement = driver.findElement(By.partialLinkText("Partial"));
		//LinkElement.click();
		
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Test1 Passed");
		
		//WebElement buttonElement = driver.findElement(By.tagName("button"));
		//String sValue = buttonElement.getText();
		String sValue = driver.findElement(By.tagName("button")).toString();
		System.out.println("The value of submitt button is " + sValue);
		
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Test2 Passed");
		
		driver.close();
				
		
	}

}
