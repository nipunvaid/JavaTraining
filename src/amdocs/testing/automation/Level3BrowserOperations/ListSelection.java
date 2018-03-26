package amdocs.testing.automation.Level3BrowserOperations;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ListSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe" ;
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		driver.get(URL);
		
		//Task 1

		Select oSelect1 = new Select(driver.findElement(By.id("continents")));
		oSelect1.selectByVisibleText("Asia");
		//String sSelect1 = driver.findElement(By.id("continents")).getSize();
		String sSelect1 = driver.findElement(By.id("continents")).getText();
		System.out.println("Task 1 Cleared & option select is " + sSelect1);
		
		//Task 2
		Select oSelect2 = new Select(driver.findElement(By.id("continents")));
		oSelect2.selectByIndex(1);
		String sSelect2 = driver.findElement(By.id("continents")).getText();
		System.out.println("Task 2 Cleared & option select is " + sSelect2);
		
		//Task 3
		Select oSelect3 = new Select(driver.findElement(By.id("continents")));
		oSelect3.selectByVisibleText("Europe");
		String sSelect3 = driver.findElement(By.id("continents")).getText();
		System.out.println("Task 2 Cleared & option select is " + sSelect3);
		
		//Task 4
		List<WebElement> oSize = oSelect1.getOptions(); 
		int iListSize = oSize.size();
 
		for(int i =0; i < iListSize ; i++){
	
			String sValue = oSelect1.getOptions().get(i).getText();

			System.out.println("The value available for select at value" + (i+1) +" is " + sValue);
											}	    
		
		driver.close();
	}
	

}
