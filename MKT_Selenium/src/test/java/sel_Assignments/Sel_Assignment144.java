package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 144) Program to hover over on 
 * 
 * flipcart ->fashion->Mens T shirt
 * 
 */
public class Sel_Assignment144 {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com/");
	
	WebElement fashion = driver.findElement(By.xpath("(//div[@class='_1ch8e_'])[1]"));
	
	Actions a2 = new Actions(driver);
	
	a2.moveToElement(fashion).perform();
	
	
	
	WebElement mnstshrt = driver.findElement(By.linkText("Men's T-Shirts"));
	mnstshrt.click();
	
	System.out.println("Executed Successfully");
	

	}

}
