package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 
 * 140).Demonstrate a program on drag n drop https://grotechminds.com/drag-and-drop/
 */
public class Sel_Assignment140 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement pstmn = driver.findElement(By.id("drag7"));
		
		
		
		WebElement dest = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(pstmn, dest).perform();

	}

}
