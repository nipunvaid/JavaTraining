package amdocs.testing.automation.Level2BrowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Proxy.ProxyType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirstFirefoxRun {

	
	  
	  public static String driverPath = "C://geckodriver//";
	  public static WebDriver driver;
	  public static String JavaVersion = System.getProperty("sun.arch.data.model");
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//FirefoxProfile profile = new FirefoxProfile();
		//profile.setPreference("network.proxy.type", ProxyType.AUTODETECT.ordinal());
	
		System.setProperty("webdriver.gecko.driver", driverPath + JavaVersion + "geckodriver.exe");
		//driver = new FirefoxDriver();
		
		FirefoxDriver driver = new FirefoxDriver(); 
		
		driver.manage().window().maximize();
			
		driver.get("https://www.amazon.com/s/141-3165340-1911144?ie=UTF8&field-keywords=goo&index=blended&link_code=qs&sourceid=Mozilla-search&tag=mozilla-20");
		
		System.out.println("Website is Launched");		
	}

}
