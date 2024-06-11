package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 145) Lanch the Amazon.india and Using Hover Over.
 * click the Account List & Click the Sign in Button & Login 
 * 
 * 
 */
public class Sel_Assignment145 {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in");
	
	WebElement hvrovr = driver.findElement(By.id("nav-link-accountList"));
	
	Actions a1 = new Actions(driver);
	a1.moveToElement(hvrovr).perform();
	
	WebElement sgnbtn = driver.findElement(By.linkText("Sign in"));
	sgnbtn.click();
	
	}

}
