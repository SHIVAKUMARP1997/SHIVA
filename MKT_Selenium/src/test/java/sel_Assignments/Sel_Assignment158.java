package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 158)Demonstrate CSS locator program on google.in and search India use TN[AN='AV'] 
 * 
 * input[id='ap_phone_number']
 * 
 */
public class Sel_Assignment158 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	WebElement	el1 =driver.findElement(By.cssSelector("textarea[id = 'APjFqb']"));
	el1.sendKeys("Shiva");
	
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".gNO89b")).click();
	}

}
