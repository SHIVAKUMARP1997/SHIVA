
package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * 128). Register yourself on amazon application with use id and name locators
 * 
 * 
 * 
 * 
 * 
 */




public class Sel_Assignment_128 {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver(); //step 1
		driver.get("https://www.facebook.com/");  //step 2
		
		//Maximize the window
		
		driver.manage().window().maximize();
		
		
		
		WebElement mail = driver.findElement(By.linkText("email"));
		mail.sendKeys("someone@gmail.com");//Step 3
				
		
		WebElement newSignin=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
		newSignin.sendKeys(Keys.ENTER);
		//enroling to facebook 
		WebElement Fname= driver.findElement(By.name("firstname"));
		Fname.sendKeys("Shiva");
		Fname.sendKeys(Keys.TAB);
		Fname.sendKeys("Kumar");
		Fname.sendKeys(Keys.TAB);
		Fname.sendKeys("SOmeone@gmail.com");
		Fname.sendKeys(Keys.TAB);
		Fname.sendKeys("Password");

		
//		WebElement pwd = driver.findElement(By.name("pass")) ; //Step 4	
//		pwd.sendKeys(Keys.TAB);
//		pwd.sendKeys("password");
//		driver.findElement(By.name("login")).click();
//		
		
		
//		try {
//			Thread.sleep(2500);
//			driver.quit();
//   			}
//		catch (InterruptedException e) {
//   			e.printStackTrace();
//   			
//   			}

	}

}
