package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 156)Demonstrate CSS locator program on google.in and search India use textarea .gLFyf
 */
public class Sel_Assignment156 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	WebElement el1 =driver.findElement(By.cssSelector(".gLFyf"));
	el1.sendKeys("India");
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".gNO89b")).click();

	}

}
