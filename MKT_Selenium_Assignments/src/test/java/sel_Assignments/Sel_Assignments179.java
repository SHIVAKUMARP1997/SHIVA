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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//179) Automate https://grotechminds.com/registeration-form/   using DDT
public class Sel_Assignments179 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		FileInputStream f2 = new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\MKT_Selenium_Assignments\\TestData\\Shiv.xlsx");
		Workbook ab = WorkbookFactory.create(f2);
		
		
		String email= ab.getSheet("user").getRow(0).getCell(1).getStringCellValue();
		String fname= ab.getSheet("user").getRow(6).getCell(1).getStringCellValue();
		String lname= ab.getSheet("user").getRow(7).getCell(1).getStringCellValue();
		String P_Address= ab.getSheet("user").getRow(8).getCell(1).getStringCellValue();
		String Prmnt_Address=ab.getSheet("user").getRow(9).getCell(1).getStringCellValue();
		String pincode= NumberToTextConverter.toText(ab.getSheet("user").getRow(10).getCell(1).getNumericCellValue());
				
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		
		
		driver.findElement(By.id("fname")).sendKeys(fname);
		driver.findElement(By.id("lname")).sendKeys(lname);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("male")).click();
		
		
		WebElement drpdwn1 = driver.findElement(By.id("Skills"));
		Select s1 = new Select(drpdwn1);
		s1.selectByValue("select1");
		
		WebElement drpdwn2 = driver.findElement(By.id("Country"));
		Select s2 = new Select(drpdwn2);
		s2.selectByValue("India");
		
		WebElement drpdwn3 = driver.findElement(By.id("technicalskills"));
		Select s3 = new Select(drpdwn3);
		s3.selectByValue("Core Java");
		
		WebElement drpdwn4 = driver.findElement(By.id("Relegion"));
		Select s4 = new Select(drpdwn4);
		s4.selectByValue("Hindu");
		
		driver.findElement(By.id("file")).sendKeys("C:\\Users\\LENOVO\\OneDrive\\Desktop\\ShivakumarP_SDET-I.pdf");
		
		driver.findElement(By.id("Present-Address")).sendKeys(P_Address);
		driver.findElement(By.id("Permanent-Address")).sendKeys(Prmnt_Address);
		driver.findElement(By.id("Pincode")).sendKeys(pincode);
		driver.findElement(By.id("relocate")).click();

		
		
		

	}

}
