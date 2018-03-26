package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class RefreshWebPage {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String exPath = "C:\\chromedriver\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exPath);
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
				FluentWait wait = new FluentWait(driver);
				wait.ignoring(NoSuchElementException.class);
				wait.pollingEvery(10, TimeUnit.MILLISECONDS);
				String URL = "https://www.facebook.com";
				driver.get(URL);
		
		//Refresh 1
				driver.navigate().refresh();
				System.out.println("Refresh 1 done");
				
		//Refresh 2
				driver.findElement(By.id("u_0_e")).sendKeys(Keys.F5);
				System.out.println("Refresh 2 done");
		//Refresh 3
				driver.get(driver.getCurrentUrl());
				System.out.println("Refresh 3 done");
				
		//Refresh 4
				driver.navigate().to(driver.getCurrentUrl());
				System.out.println("Refresh 4 done");
				
		//Refresh 5
				driver.findElement(By.id("u_0_e")).sendKeys("\uE035");
				System.out.println("Refresh 5 done");
				
		// Close
				System.out.println("Done in One Try");
				driver.close();
	}

}
