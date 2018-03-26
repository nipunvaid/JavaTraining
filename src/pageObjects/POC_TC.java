package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class POC_TC {
public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", Constant1.sExPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Constant1.sURL);
		
		SimulatorPage.lnk_APRMTicket(driver).sendKeys(Constant1.iAPRMTicket);
		String APRMTicket = SimulatorPage.lnk_APRMTicket(driver).getAttribute(null);
		System.out.println(APRMTicket);
		SimulatorPage.lnk_APRMRole(driver).sendKeys(Constant1.sAPRMRole);
		SimulatorPage.link_APRMTYpeCode(driver).sendKeys(Constant1.sAPRMACType);
		SimulatorPage.linkAPRMUserId(driver).sendKeys(Constant1.sAPRMUser);
		SimulatorPage.lnk_LoginButton(driver).click();
		
		System.out.println("Its Done");
		driver.close();
		
	}

}
