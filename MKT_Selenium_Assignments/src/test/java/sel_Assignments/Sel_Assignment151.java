package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 151)Login to Amazon search shoe and select a first shoe
 * 
 * 
 */
public class Sel_Assignment151 {

	public static void main(String[] args) {
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
