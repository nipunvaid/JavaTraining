package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingDataInTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\\\chromedriver\\\\chromedriver.exe" ; 
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-table" ;
		
		driver.get(URL);
		
		//driver.findElement(By.xpath(“/html/body/div[1]/div[2]/div/div[2]/article/div/table/tbody/tr[2]/td[1]”)).getText(); 
		
		//*[@id="content"]/table/thead/tr/th[1]
		
		String sColValue = "Country";
		 
		//First loop will find the 'ClOCK TWER HOTEL' in the first column
		for (int i=1;i<=3;i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath(".//*[@id=\"content\"]/table/thead/tr/th["+i+"]")).getText();
			if(sValue.equalsIgnoreCase(sColValue)){
				System.out.println("Passed");
				// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
				for (int j=1;j<=2;j++){
					String sRowValue= driver.findElement(By.xpath(".//*[@id=\"content\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
					System.out.println(sRowValue);
				}
			break;
		}
	}
		
	}

}
