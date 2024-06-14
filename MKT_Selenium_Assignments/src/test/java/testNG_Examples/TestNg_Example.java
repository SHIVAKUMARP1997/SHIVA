package testNG_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_Example {
	
	
	@Test
	void shiva()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement srchfld = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		srchfld.sendKeys("shoe");
		srchfld.sendKeys(Keys.ENTER);
		
		WebElement select_1st = driver.findElement(By.xpath(" //span[@class='rush-component']/a/div[1]"));
		select_1st.click();
		
	}

}
