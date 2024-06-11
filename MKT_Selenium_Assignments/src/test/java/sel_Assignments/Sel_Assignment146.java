package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Demonstrate a program three methods of WebElement Interface Use google.co.in page 
 * and type india in search using isDisplayed() and isEnabled().
 * 
 */
public class Sel_Assignment146 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://www.google.com");
		
		WebElement yesno = driver.findElement(By.linkText("Gmail"));
		
		
		if( yesno.isDisplayed() && yesno.isEnabled())
		{
			System.out.println("Displyed and enbled");
		}
		else {
			System.err.println("Unable to loacate");
		}

	}

}
