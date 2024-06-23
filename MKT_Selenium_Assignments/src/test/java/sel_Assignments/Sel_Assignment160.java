package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 160)Demonstrate CSS locator program on google.in and search India use Substring method.
 * 
 * input[id^='two']
 * 
 */
public class Sel_Assignment160 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector(".gLFyf[id = 'APjFqb']")).sendKeys("LordShiva");
		
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value^='Goo']")).click();
		

	}

}
