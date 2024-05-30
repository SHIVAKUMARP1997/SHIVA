package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 143) Launch amazon.in select option as amazon fresh using keys functionality.
 * 
 */
public class Sel_Assignment143 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement allBtn = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		allBtn.click();
		allBtn.sendKeys(Keys.ARROW_DOWN);
		allBtn.sendKeys(Keys.ARROW_DOWN);
		allBtn.sendKeys(Keys.ARROW_DOWN);
		allBtn.sendKeys(Keys.ARROW_DOWN);
		
		
	}

}
