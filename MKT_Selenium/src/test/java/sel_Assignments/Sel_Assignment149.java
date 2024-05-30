package sel_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 149)Launch amazon.in type shoe select the 5th shoe.
 * 
 */
public class Sel_Assignment149 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		WebElement srchBx = driver.findElement(By.name("field-keywords"));
		srchBx.sendKeys("shoe");
		
		
		Thread.sleep(3000);
		List<WebElement> Autoslct = driver.findElements(By.xpath("(//div[@class = 'autocomplete-results-container'])/div/div/div"));
		int count = Autoslct.size();
		
		System.out.println(count);
		Autoslct.get(3).click();
		

	}

}
