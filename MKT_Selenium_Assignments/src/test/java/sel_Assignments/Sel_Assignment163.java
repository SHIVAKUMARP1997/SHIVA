package sel_Assignments;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 163) Launch naukari.com registration, click on login with google, 
 * move control to child window and enter email address.
 * 
 * 
 */
public class Sel_Assignment163 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =  new ChromeDriver();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMInJ_x1szBhgMVOqRmAh0jHjFZEAAYASAAEgKYb_D_BwE&gclsrc=aw.ds");
	
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("span.google-text")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> it = windows.iterator();
		String A = it.next();
		String B = it.next();
		
		driver.switchTo().window(B);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[jsname='YPqjbf']")).sendKeys("Someone@gmail.com");
		

	}

}
