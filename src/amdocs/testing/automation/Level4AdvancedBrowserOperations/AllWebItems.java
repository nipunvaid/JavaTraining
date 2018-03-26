package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class AllWebItems {

	@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
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
		
		String URL = "https://www.facebook.com" ;
		
		driver.get(URL);
		
		//Task1
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Links");
		System.out.println("The number of links are " + allLinks.size());
	
		//Task 2
		int iSize = allLinks.size();
		System.out.println(iSize);
		
		for(int i =0; i < iSize ; i++) {
			wait.ignoring(IndexOutOfBoundsException.class);
			System.out.println("The value in Link # " + (i+1) + " is " + allLinks.get(i).getText());
		}
		
		//Task 3
		System.out.println("Radio");
		List<WebElement> allRadioBoxes = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(allRadioBoxes.size());
		
		for(int k= 0; k < allRadioBoxes.size(); k++) {
			System.out.println("The value is Radio Box Number " + (k+1) + " is " + allRadioBoxes.get(k).getText());
		}
		
		//Task 4
		System.out.println("Text");
		List<WebElement> allTextBoxes = driver.findElements(By.xpath("//input[@type='text']"));
		
		System.out.println(allTextBoxes.size());
		
		for(int j= 0; j < allTextBoxes.size(); j++) {
			//wait.ignoring(NoSuchElementException.class);
			//wait.ignoring(ElementNotVisibleException.class);
			//allTextBoxes.get(j).sendKeys("Testing@" + j);
			System.out.println("The value is Text Box Number " + (j+1) + " is " + allTextBoxes.get(j).getText());
		}
		
		driver.close();
		
		
		
		
		
		
	}

}
