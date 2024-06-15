package sel_Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//177) Login to Amazon application using DDT concept.



public class Sel_Assignments177 {

		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream f1 = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MKT_Selenium_Assignments\\TestData\\Shiv.xlsx");
			Workbook bk = WorkbookFactory.create(f1);	
			String UN = bk.getSheet("user").getRow(0).getCell(1).getStringCellValue();
			String PWD = bk.getSheet("user").getRow(1).getCell(1).getStringCellValue();
			
						
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
			
			driver.get("https://www.amazon.in/");
			
			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			
			driver.findElement(By.id("ap_email")).sendKeys(UN);
			
			driver.findElement(By.id("continue")).click();
			
			driver.findElement(By.id("ap_password")).sendKeys(PWD);			
			
			
			

	}

}
