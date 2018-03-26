package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

public class draganddrop {

	@SuppressWarnings({ "unchecked", "deprecation" })
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
		String URL = "http://www.dhtmlx.com/docs/products/dhtmlxTree/index.shtml";
		driver.get(URL);
				 
		// It is always advisable to Maximize the window before performing DragNDrop action
		 
		WebElement From = driver.findElement(By.xpath(".//*[@id='treebox1']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		WebElement To = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]/span"));
		 
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.clickAndHold(From)
		 
		.moveToElement(To)
		.release(To)
		.build();
		dragAndDrop.perform();
		System.out.println("Done");
		
		
	}

}
