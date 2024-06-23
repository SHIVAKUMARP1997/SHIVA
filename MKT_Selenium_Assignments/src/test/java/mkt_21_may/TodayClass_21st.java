package mkt_21_may;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;


public class TodayClass_21st {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ChromeDriver driver = new ChromeDriver();		
	
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("India");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	
	//driver.quit();
	
	}

}
