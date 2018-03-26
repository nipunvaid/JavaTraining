package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://www.facebook.com"; 
		
		driver.get(URL);	
		
		driver.navigate().forward();
		
		String sURL1 = driver.getCurrentUrl();
		
		System.out.println("The current website opened is "+ sURL1);
		
		driver.navigate().to("https://www.gmail.com");
		
		driver.navigate().forward();
		
		String sURL2 = driver.getCurrentUrl();
		
		System.out.println("The current website opened is "+ sURL2);
		
		driver.close();
				
	}

}
