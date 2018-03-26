package amdocs.testing.automation.Level4AdvancedBrowserOperations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InvokeBrowser {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sBrowser = "Chrome";
		public new broweseinvoker(){
		if(sBrowser.equalsIgnoreCase("Chrome")){
					String exPath = "C:\\chromedriver\\chromedriver.exe";
					System.setProperty("webdriver.chrome.driver", exPath);
					@SuppressWarnings("unused")
					WebDriver driver = new ChromeDriver();
												}
		else if(sBrowser.equalsIgnoreCase("IE")) {
					String exPathIE="C:\\IEdriver\\IEDriverServer.exe";
					System.setProperty("webdriver.ie.driver", exPathIE);
					@SuppressWarnings("unused")
					InternetExplorerDriver driver = new InternetExplorerDriver();
												  }
		//else{System.out.println("No Valid Browser Selected");}
		String URL = "https://www.facebook.com";
				driver.get(URL);
	}
	}	
}
