package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 113) Goto Amazon.in locate shoe with relative xpath
 * 
 * 
 * 
 */

public class Sel_Assignment_133 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement srchfld = driver.findElement(By.xpath("(//input)[5]"));
		srchfld.sendKeys("Shoes for men");
		srchfld.sendKeys(Keys.ENTER);
		
		
		try {
			Thread.sleep(2500);
			driver.quit();
   			}
		catch (InterruptedException e) {
   			e.printStackTrace();
		}
	}

}
