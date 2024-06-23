package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 
 * 
 * 136) Demostrate a program on dropdown, use Facebook.in and 
select dropdown for date, month and year when creating account
 */



public class Sel_Assignment_136 {

	public static void main(String[] args) {
		
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement newAcountButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		newAcountButton.click();
		
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("Someone");
		
//		WebElement ln = driver.findElement(By.name("lastname"));
//		ln.sendKeys("Someone");
//		
//		
//		WebElement Email = driver.findElement(By.name("reg_email__"));
//		Email.sendKeys("Someone@gmail.com");
//		
		
		WebElement date = driver.findElement(By.id("day"));
		Select sel = new Select(date);
		sel.selectByValue("28");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select sel2 = new Select(month);
		sel2.selectByValue("5");
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		Select sel3 = new Select(year);
		sel3.selectByValue("1997");
		
//		
//		WebElement mail_phone = driver.findElement(By.xpath("(//input)[9]"));
//		boolean displystts = mail_phone.isDisplayed();
//		System.out.println(displystts);
		
		
//driver.quit();
	
	
		
		
	
	}
	
	

}
