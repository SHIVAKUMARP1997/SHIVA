package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Assignment_125 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver(); //step 1
		driver.get("https://www.google.com/");  //step 2
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("APjFqb")).sendKeys("india"); //Step 3
		driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);  //Step 4	
		
		
		try {
			Thread.sleep(2500);
			driver.quit();
   			}
		catch (InterruptedException e) {
   			e.printStackTrace();
   			
   			}

	}

}
