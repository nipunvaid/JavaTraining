package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class WaitWithConditions2 {

	@SuppressWarnings({ "unchecked", "deprecation" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoke Browser
		String exPath = "C:\\chromedriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exPath);
		WebDriver driver = new ChromeDriver();
		String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		//Code Starts Here
		@SuppressWarnings({ "rawtypes", "unused" })
		FluentWait wait = new FluentWait(driver);
		driver.get(URL);
		wait.withTimeout(1, TimeUnit.SECONDS);
		wait.pollingEvery(1, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		String hand1 = driver.getWindowHandle();
		System.out.println("The value of handle is " + hand1);
		Set<String> handle = driver.getWindowHandles();
		System.out.println("The value of handles is " + handle);
		driver.switchTo().window(hand1);
		System.out.println("Done");
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"text-18\"]/div[1]")));
		//System.out.println("Done2");
		
		Function<WebDriver , WebElement> func = new Function<WebDriver , WebElement>(){
			public WebElement apply(WebDriver agr0){
			System.out.println("Searching for Element");
			WebElement element = driver.findElement(By.id("colorVar"));
			String eleColor = element.getAttribute("color");
			if(element != null)
			{
				System.out.println("Element Found");		
				System.out.println("Color is " + eleColor );
			}
			return element;
		}
		};
		wait.until(func);
		System.out.println("Success");
		driver.close();
	}
}
