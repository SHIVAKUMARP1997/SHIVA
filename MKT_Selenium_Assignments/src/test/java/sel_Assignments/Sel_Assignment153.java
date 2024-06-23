package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 153)Demonstrate CSS locator program on google.in and search India use #APjFqb
 * 
 */
public class Sel_Assignment153 {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	WebElement Search_bar = driver.findElement(By.cssSelector("#APjFqb"));
	Search_bar.sendKeys("india");
	Search_bar.sendKeys(Keys.ENTER);
	
	}

}
