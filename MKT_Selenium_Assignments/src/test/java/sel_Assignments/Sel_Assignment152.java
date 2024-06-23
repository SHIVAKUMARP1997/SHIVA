package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * 152) Without login to flipcart, search for shoe and select first shoe
 */
public class Sel_Assignment152 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");	
		
		WebElement Search_Bar = driver.findElement(By.cssSelector(".Pke_EE"));
		Search_Bar.sendKeys("Shoes");
		Search_Bar.sendKeys(Keys.ENTER);
		
		WebElement fstOne = driver.findElement(By.xpath("(//div[@class='wvIX4U'])/div"));
		fstOne.click();
	
	
	}

}
