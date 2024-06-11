package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//114) Login to  Amazon Application using Relative Xpath.


public class Sel_Assignment_134 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement srchfld = driver.findElement(By.xpath("(//input)[5]"));
		srchfld.sendKeys("Shoes for men");
		srchfld.sendKeys(Keys.ENTER);
		
		WebElement SignInbtn = driver.findElement(By.xpath("(//*[@id='nav-link-accountList-nav-line-1'])"));	
		SignInbtn.click();
		
		WebElement SignINsearch = driver.findElement(By.xpath("(//input)[7]"));
		SignINsearch.sendKeys("Someone@gmail.com");
		driver.findElement(By.xpath("(//input)[10]")).click(); //continue button.
		
		WebElement pwdfld = driver.findElement(By.xpath("(//input)[9]"));
		pwdfld.sendKeys("password");
		pwdfld.sendKeys(Keys.ENTER);
		
		
		
		
			Thread.sleep(2500);
			driver.quit();
   		
	}

}
