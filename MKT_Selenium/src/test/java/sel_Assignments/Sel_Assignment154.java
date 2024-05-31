package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 154)Launch flipcart.com and search for shoe with help of css selector .Pke_EE
 * 
 */
public class Sel_Assignment154 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		
		WebElement Search_bar =driver.findElement(By.cssSelector(".Pke_EE"));
		Search_bar.sendKeys("shoes");
		Search_bar.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//div[@class='gqcSqV YGE0gZ'])[1]")).click();

	}

}
