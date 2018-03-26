package amdocs.testing.automation.Level3BrowserOperations;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\\\chromedriver\\\\chromedriver.exe" ;
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		driver.get(URL);
		
		//Task 1
		
		Select oSelect1 = new Select(driver.findElement(By.id("selenium_commands")));
		oSelect1.selectByIndex(0);
		String sSelectValue1 = oSelect1.toString();
		System.out.println("The selected value is " + sSelectValue1);
		
		oSelect1.deselectByIndex(0);
		System.out.println("Value is deselected");
		
		
		//Task2
		Select oSelect2 = new Select(driver.findElement(By.id("selenium_commands")));
		oSelect2.selectByVisibleText("Navigation Commands");
		System.out.println("The value is selected");
		
		oSelect2.deselectByVisibleText("Navigation Commands");
		System.out.println("The value is deselected");
		
		//Task 3
		Select oSelect3 = new Select(driver.findElement(By.id("selenium_commands")));
		String sValue3 = oSelect3.getAllSelectedOptions().toString();
		System.out.println("The values available are " + sValue3);
		
		oSelect3.deselectAll();
		System.out.println("All Values are deselected");
		
		//Task 4
		List<WebElement> oSize = oSelect3.getOptions();
		int iListSize = oSize.size();
		for(int i =0; i < iListSize ; i++){
			// Storing the value of the option	
			String sValue = oSelect3.getOptions().get(i).getText();
 
			// Printing the stored value
			System.out.println(sValue);
 
			// Selecting all the elements one by one
			oSelect3.selectByIndex(i);
				}
		
		driver.close();
	}

}
