package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Demostrate a program on dropdown, 
 * use Amazon.in, use all three methods of 'Select class'
 * 
 * 
 */
public class Sel_Assignment_135 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		
		WebElement drpdn = driver.findElement(By.id("searchDropdownBox"));
		
		Select s1 = new Select(drpdn);
		s1.selectByValue("search-alias=baby"); //searchByValue
		
				
		s1.selectByVisibleText("Beauty"); //selectByVisibleText
		
		
		s1.selectByIndex(10); //selectByIndex
		
		
		System.out.println("LogSuccess");

	}

}
