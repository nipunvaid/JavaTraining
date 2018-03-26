package amdocs.testing.automation.Level3BrowserOperations;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

		public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe" ;
		
		System.setProperty("webdriver.chrome.driver" , exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-form/";
		
		driver.get(URL);
		
		//Challenge 1
				driver.findElement(By.id("sex-1")).click();
				System.out.println("Challenge 1 is cleared");

		//Challenge 2
				
				driver.findElement(By.id("exp-2")).click();
				System.out.println("Challenge 2 is cleared");
				
		//Challenge 3
				
				driver.findElement(By.id("profession-1")).click();
				System.out.println("Challenge 3 is cleared");
				
		//Challenge 4
				driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
				System.out.println("Challenge 4 is cleared");
				
		//Challenge 5
				List<WebElement> rdBtn_Sex = driver.findElements(By.name("sex"));
				
				boolean bValue = false;
				
				bValue = rdBtn_Sex.get(0).isSelected();
				
				if(bValue == true){
						rdBtn_Sex.get(1).click();
									}
				else{
					rdBtn_Sex.get(0).click();
					}
		//Challenge 6
				List<WebElement> chkBx_Profession = driver.findElements(By.name("profession"));
				
				int iSize = chkBx_Profession.size();
				
				for(int i=0; i < iSize ; i++ ){
			
					String sValue = chkBx_Profession.get(i).getAttribute("value");
					
					if (sValue.equalsIgnoreCase("Automation Tester")){
								chkBx_Profession.get(i).click();
					break;
					}
				}
				
				driver.close();
				}
		}	
	
