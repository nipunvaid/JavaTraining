package amdocs.testing.automation.Level2BrowserLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FirstIeRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String exPath = "C:\\IEdriver\\IEDriverServer.exe" ;
		
		System.setProperty("webdriver.ie.driver" , exPath);
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		
		capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		@SuppressWarnings("deprecation")
		InternetExplorerDriver driver = new InternetExplorerDriver(capabilities); 
		
		driver.get("https://www.facebook.com");
		
		System.out.println("Website is Launched");
		
		Thread.sleep(5);
		
		driver.findElement(By.id("u_0_13"));
		
		System.out.println("Element Found");
		
	}

}
