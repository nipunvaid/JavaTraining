package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class mousehover {

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
		String URL = "http://www.store.demoqa.com/";
		driver.get(URL);
		
		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"menu-item-33\"]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element1).build().perform();
		driver.findElement(By.xpath("//*[@id=\"menu-item-36\"]/a")).click();
		System.out.println("Done");
		
		
		
	}

}
