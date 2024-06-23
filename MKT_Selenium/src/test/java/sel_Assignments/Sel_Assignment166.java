package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 166)  Open Grotechminds website and handle java script popup
https://grotechminds.com/javascript-popup/
 * 
 */
public class Sel_Assignment166 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/javascript-popup/");
		
		driver.findElement(By.cssSelector("button[class='btnjs']")).click();
		
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

	}

}
