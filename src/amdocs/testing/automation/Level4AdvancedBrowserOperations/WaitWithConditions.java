package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitWithConditions {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.get(URL);
		FluentWait wait = new FluentWait(driver);
		//wait.withTimeout(10, TimeUnit.MILLISECONDS);
		//wait.pollingEvery(10, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
	
		Function<WebDriver , Boolean> function = new Function<WebDriver , Boolean>()
				{
					public Boolean apply(WebDriver arg0) {
						WebElement element = driver.findElement(By.id("colorVar"));
						String color = element.getAttribute("color");
						System.out.println("The current color is " + color);
						wait.ignoring(NullPointerException.class);
						if(color.equals("red")) {
							return true;
						}
							return false;
						}
					};
			wait.until(function);
					System.out.println("The test is passed");
			driver.close();
				}
	}
