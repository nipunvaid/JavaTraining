package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class IFrameTesting {

	@SuppressWarnings({ "deprecation", "unchecked" })
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
		
		//Task1 - Find Number of Frames on Page
		
				//By executing a java script
				JavascriptExecutor exe = (JavascriptExecutor) driver;
				Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
				System.out.println("Number of iframes on the page are " + numberOfFrames);
		 
				//By finding all the web elements using iframe tag
				List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
				System.out.println("The total number of iframes are " + iframeElements.size());
				
		//Task2 - Switch between frames
				driver.switchTo().frame(0);
				//driver.findElement(By.id("firstname")).sendKeys("Testing");
				String element1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong")).getText();
				System.out.println("The value is " +element1);
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame("iframe2");
				WebElement element4 = driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/div[3]/h5"));
				String element2 = driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/div[3]/h5")).getText();
				System.out.println("The value 2 is " +element2);
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame("IF1");
				//driver.findElement(By.id("firstname")).sendKeys("Testing2");
				String element3 = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong")).getText();
				System.out.println("The value is " +element3);
				
				//driver.switchTo().defaultContent();
				//driver.switchTo().frame(element4);
				//String element5 = driver.findElement(By.xpath("//*[@id=\"post-9\"]/div/div[1]/h5")).getText();
				//System.out.println("The value 2 is " +element5);
				
				driver.switchTo().defaultContent();
				
		driver.close();
	}

}
