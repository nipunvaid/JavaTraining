package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimulatorPage {

	public static WebElement element = null;
	
	public static WebElement lnk_APRMTicket(WebDriver driver) {
		element = driver.findElement(By.name("APRMTicket"));
		return element;
	}
		
	public static WebElement lnk_APRMRole(WebDriver driver) {
		element = driver.findElement(By.id("APRMRoles"));
		return element;
	}
	
	public static WebElement link_APRMTYpeCode(WebDriver driver) {
		element = driver.findElement(By.id("APRMAccTypeCode"));
		return element;
	}
		
	public static WebElement linkAPRMUserId(WebDriver driver) {
		element = driver.findElement(By.name("APRMUserID"));
		return element;
	}	
	public static WebElement lnk_LoginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/center/div/div[3]/div[2]/form/table/tbody/tr[13]/td/input[2]"));
		return element;
	}
	
	
}
