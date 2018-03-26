package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataEntrySubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		driver.get(URL);
		
		WebElement childelement1 = driver.findElement(By.name("firstname"));
		childelement1.sendKeys("Testing");
		System.out.println("The first name entered is " + childelement1);
		
		WebElement childelement2 = driver.findElement(By.name("lastname"));
		childelement2.sendKeys("Automation");
		System.out.println("The last name enetered is " + childelement2);
		
		WebElement buttonelement = driver.findElement(By.id("submit"));
		buttonelement.click();
		System.out.println("The button was clicked");
		
		
		driver.close();
		
	}

}
