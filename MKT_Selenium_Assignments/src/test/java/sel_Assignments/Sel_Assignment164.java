package sel_Assignments;



/*
 * 164) Launch Amazon search for shoe, click on first shoe, click on add to wishlist, 
 * login to the application, click add to cart and buy now.
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Assignment164 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
		
		WebElement E1 = driver.findElement(By.cssSelector("[id = 'twotabsearchtextbox']"));
		E1.sendKeys("Shoes");
		E1.sendKeys(Keys.ENTER);
		
		WebElement E2 = driver.findElement(By.xpath("(//span[@class ='rush-component'])/a"));
		E2.click();
		
		Thread.sleep(2000);
		Set<String> win = driver.getWindowHandles();
		
		System.out.println(win);
		
		List<String> lista = new ArrayList(win);
		String parentW = lista.get(0);
		String ChildW = lista.get(1);
		
		driver.switchTo().window(ChildW);
		
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[id='buy-now-button']")).click();
		
		//login page:
		
		
		
		

	}

}
