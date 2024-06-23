package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 155)Demonstrate CSS locator program on google.in and search India use textarea #APjFqb
 * 
 */
public class Sel_Assignment155 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement srchAra= driver.findElement(By.cssSelector("#APjFqb"));
		srchAra.sendKeys("India");	
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".gNO89b")).click();
		
		

	}

}
