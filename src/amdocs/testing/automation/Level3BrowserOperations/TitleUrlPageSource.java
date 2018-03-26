package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TitleUrlPageSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe" ;
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
		
		String URL = "https://www.facebook.com/";
		
		driver.get(URL);
		
		String sTitleName = driver.getTitle();
		
		int iLength = driver.getTitle().length();
		
		System.out.println("Website is Launched & Title Name is " + sTitleName + " & lenth of title " + iLength );
		
		String sCurrentUrl1 = driver.getCurrentUrl();
		
		
		
		if (sCurrentUrl1.equals(URL)){
			System.out.println("Both URL Marches");
		}
		else {
			System.out.println("Validation failed");
			System.out.println("Expected URL is " + URL);
			System.out.println("Actual URL is " + sCurrentUrl1);
		}
		
					
		String sPageSrc1 = driver.getPageSource();
		 int iPageLength = sPageSrc1.length();
		
		System.out.println("Page Length is " + iPageLength );
		
		driver.close();		
	}

}
