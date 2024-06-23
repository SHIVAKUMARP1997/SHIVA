package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

//180) Demonstrate a code for Navigate method of driver back(), forward(), refresh() and to()
public class Sel_Assignments180 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		
		//To navigate to the URL
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Tom and Jerry");
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys(Keys.ENTER);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys("shiva");
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		driver.navigate().forward();
		
		System.out.println("Completed");
	}

}
