package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class DropDwonSelection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String exPath = "C:\\\\chromedriver\\\\chromedriver.exe" ; 
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://www.facebook.com" ;
		
		driver.get(URL);

		Select oSelect1 = new Select(driver.findElement(By.id("day")));
        List<WebElement> oSize = oSelect1.getOptions();
        int iListSize = oSize.size();
        for (int i = 0; i < iListSize; i++) {
            String sValue = oSelect1.getOptions().get(i).getText();
            System.out.println("The value available for select at value" + (i + 1) + " is " + sValue);
        									}
              
        
	}

}
