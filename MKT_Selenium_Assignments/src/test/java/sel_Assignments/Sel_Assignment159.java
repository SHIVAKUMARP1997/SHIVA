package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 *159) Launch flipcart.com and search for shoe with help of css selector TN.CN[AN='AV']
 *
 * input.Pke_EE[name='q']
 */
public class Sel_Assignment159 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
	WebElement aOne =	driver.findElement(By.cssSelector("input.Pke_EE[name='q']"));
	aOne.sendKeys("earPhone");
	
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button._2iLD__[type='submit']")).click();
	}

}
