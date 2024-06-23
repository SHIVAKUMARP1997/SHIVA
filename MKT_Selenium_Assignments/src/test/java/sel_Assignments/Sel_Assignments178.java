package sel_Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//178) Create an account in amazon.in using DDT (No need to click on Register button)
public class Sel_Assignments178 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MKT_Selenium_Assignments\\TestData\\Shiv.xlsx");
		Workbook bk = WorkbookFactory.create(f1);	
		String UN = bk.getSheet("user").getRow(0).getCell(1).getStringCellValue();
		String PWD = bk.getSheet("user").getRow(1).getCell(1).getStringCellValue();
		
	String numb = NumberToTextConverter.toText(bk.getSheet("user").getRow(2).getCell(2).getNumericCellValue());
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		
		driver.get("https://www.Amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();

		driver.findElement(By.id("createAccountSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys(UN);
		
		driver.findElement(By.id("ap_phone_number")).sendKeys(numb);
		
		driver.findElement(By.id("ap_password")).sendKeys(PWD);

		
		
		
		}
		
		
		
		
	}


