package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 138) Demonstrate program on How to hover over https://grotechminds.com/hoverover/
 * 
 * 
 */
public class Sel_Assignment138 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
	
		driver.manage().window().maximize();
		Actions a1 = new Actions(driver);
		
		//Q1. Write A Code To Hoverover Demo 1 And Click On Practice 3
	WebElement	el1 = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div[2]/div[1]/div[1]"));
		a1.moveToElement(el1).perform();
	WebElement demo1=driver.findElement(By.className("toolriptext4"));
	demo1.click();
		
		Thread.sleep(3000);
		//Q2. Write A Program To Hoverover Demo 4 And Click On Practice 10
	WebElement	el2 = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div[2]/div[1]/div[4]/div/div/div/div"));
		a1.moveToElement(el2).perform();
		WebElement demo2=driver.findElement(By.className("toolriptext6"));
		demo1.click();
		
		
		Thread.sleep(3000);
				//Q3. Write A Program To Hoverover Demo 5 And Click On Practice 1
				WebElement	el3 = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div[2]/div[1]/div[5]/div/div/div"));
					a1.moveToElement(el3).perform();
//					
//					
//					//Q4
//					WebElement	el1 = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div[2]/div[1]/div[1]"));
//						Actions a1 = new Actions(driver);
//						a1.moveToElement(el1).perform();
//						
//						//Q5
//						WebElement	el1 = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div[2]/div[1]/div[1]"));
//							Actions a1 = new Actions(driver);
//							a1.moveToElement(el1).perform();
//							
//							//Q6
//							WebElement	el1 = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div[2]/div[1]/div[1]"));
//								Actions a1 = new Actions(driver);
//								a1.moveToElement(el1).perform();
//		
//								//Q7
//								WebElement	el1 = driver.findElement(By.xpath("//*[@id='main']/div/div[2]/div/div[2]/div[1]/div[1]"));
//									Actions a1 = new Actions(driver);
//									a1.moveToElement(el1).perform();
//		
		

	}

}
