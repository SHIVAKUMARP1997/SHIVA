package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 
 *139). Demonstrate a program on how to double click
 */
public class Sel_Assignment139 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement btn = driver.findElement(By.xpath("//*[@id='gb']/div/div[1]/div/div[1]/a"));
		
		Actions a1 = new Actions(driver);
		
		a1.doubleClick(btn).perform();

	}

}
