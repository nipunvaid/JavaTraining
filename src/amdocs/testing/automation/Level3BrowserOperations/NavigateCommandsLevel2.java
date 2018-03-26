package amdocs.testing.automation.Level3BrowserOperations;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommandsLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://demoqa.com/";
		
		driver.get(URL);
		
		String tagname = driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]")).getTagName();
		
		System.out.println("The name of tag is " + tagname);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]"));
		String sName = element.getCssValue(URL);
		
		System.out.println("The css value is " + sName);
		
		driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"menu-item-374\"]"));
		String sElement1 = element2.getText();
		
		System.out.println("The value of button is " + sElement1);
		
		WebElement element3 = driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input"));
		org.openqa.selenium.Dimension dimensions = element3.getSize(); 
		
		System.out.println("The Height is " + dimensions.height +" & the width is " + dimensions.width);
		
		WebElement element4 = driver.findElement(By.xpath("//*[@id=\"pie_register\"]/li[14]/div/input"));
		Point point = element4.getLocation();
		
		System.out.println("The Value of x Cordinate is " + point.x + " & Y cordinate is " + point.y);
		
				
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to(URL);
		
		driver.navigate().refresh();
		
		driver.close();
		
		
	}

}
