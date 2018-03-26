package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataEntry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.facebook.com"; 
		
		driver.get(URL);
	
		
		driver.findElement(By.id("u_0_l")).sendKeys("Automation");
		driver.findElement(By.id("u_0_n")).sendKeys("Testing");
		driver.findElement(By.id("u_0_q")).sendKeys("automation.testing@qa.com");
		driver.findElement(By.id("u_0_t")).sendKeys("automation.testing@qa.com");
		driver.findElement(By.id("u_0_x")).sendKeys("Astro$123");
		driver.findElement(By.id("u_0_c")).click();
		driver.findElement(By.id("u_0_13")).click();
		
		//Thread.sleep(5);
		
		//driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[3]/div[2]/div/div/div/div[3]/button")).click();
		
		//driver.close();
		
	}

}
