package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 141). Write a program on drag drop page https://grotechminds.com/drag-and-drop/
1 Write a code to drag and drop JSON              
2 Write a code to return GitHub to original position after drag and drop              
3 Write a code to drag and drop Selenium                
4 Write a code to drag and drop Cucumber                
5 Write a code to drag and drop Eclipse            
6 Write a code to drag and drop Jenkins            
7 Write a code to drag and drop Spring Boot            
8 Write a code to drag and drop SQ
 */

public class Sel_Assignment141 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement pstmn = driver.findElement(By.id("drag7"));
		
		
		
		WebElement dest = driver.findElement(By.id("div2"));
		Actions a1 = new Actions(driver);
		a1.dragAndDrop(pstmn, dest).perform();
		
		//reversing the action.
		a1.dragAndDrop(dest, pstmn).perform();

	}

}
