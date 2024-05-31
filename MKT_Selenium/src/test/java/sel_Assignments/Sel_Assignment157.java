package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 157)Demonstrate CSS locator program on [AN='AV']
 * 
 */
public class Sel_Assignment157 {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com");
	
	WebElement elmnt=driver.findElement(By.cssSelector("[name='q']"));
	elmnt.sendKeys("pen");
	elmnt.sendKeys(Keys.ENTER);
	
	
	}

}
