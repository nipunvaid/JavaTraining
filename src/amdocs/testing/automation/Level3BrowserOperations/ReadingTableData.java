package amdocs.testing.automation.Level3BrowserOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingTableData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String exPath = "C:\\chromedriver\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", exPath);
		
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://toolsqa.wpengine.com/automation-practice-table/";
		
		driver.get(URL);
		
		//Task 1
		
		String sCellValue = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")).getText();
		
		System.out.println("The value in the cell is " + sCellValue);
		
		//Task 2
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[4]/td[6]/a")).click();
		
		System.out.println("The link is clicked");
		
		//Task 3
		
		int iRow = 1;
		int iCol = 2;
		
		String sCellValue2 = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+iRow+"]/td["+iCol+"]")).getText();
		System.out.println("The Value in the cell is " + sCellValue2);
		
		//Task 4
		
		String sTableHeader = "Clock Tower Hotel";
		for (int i=1;i<=4;i++){
			String sValue = null;
			sValue = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/th")).getText();
			if(sValue.equalsIgnoreCase(sTableHeader)){
				for (int j=1;j<=6;j++){
					String colValue = null;
							colValue = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
						System.out.println("The Value in Cell "+ j +" is "+ colValue +"");
				}
			}
			
	}

		driver.close();
		
}
}
