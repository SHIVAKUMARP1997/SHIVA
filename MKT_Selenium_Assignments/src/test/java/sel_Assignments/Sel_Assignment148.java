package sel_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 148) Launch google.co.in type india and select 5th autosuggestion.
 * 
 */
public class Sel_Assignment148 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement srchbx = driver.findElement(By.name("q"));
		srchbx.sendKeys("india");
		
		Thread.sleep(3000);
		List<WebElement> Auto_Select = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	//	int num = Auto_Select.size();
		Auto_Select.get(5-1).click();
		
		

	}

}
