package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class IFrameTesting2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\\\chromedriver\\\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		@SuppressWarnings("rawtypes")
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(10, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String URL = "http://toolsqa.wpengine.com/iframe-practice-page/";
		driver.get(URL);
		
		//Task 1
		driver.switchTo().frame(0);
		driver.findElement(By.name("firstname")).sendKeys("Testing");
		driver.findElement(By.name("lastname")).sendKeys("Automation");
		System.out.println("Done");
		
		//Task 2\
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//*[@id=\"site_navigation\"]/div/div[1]/a/img")).click();
		System.out.println("Done");
		
		driver.close();
		
	}

}
