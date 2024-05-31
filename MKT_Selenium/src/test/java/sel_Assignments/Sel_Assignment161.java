package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * 161)Login to https://retail.onlinesbi.sbi/retail/login.htm where right click is disabled, 
 * use dummy id and password.
 * 
 */
public class Sel_Assignment161 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		driver.manage().window().maximize();
		
		WebElement el1 = driver.findElement(By.cssSelector(".login_button"));
		el1.click();
		
		WebElement el2 = driver.findElement(By.cssSelector("input[name ='userName']"));
		el2.sendKeys("Username");
		
		WebElement el3 = driver.findElement(By.cssSelector("input[name ='password']"));
		el3.sendKeys("Password");
		
		WebElement el4 = driver.findElement(By.cssSelector("input[name ='loginCaptchaValue']"));
		el4.sendKeys("Captcha");
	}

}
