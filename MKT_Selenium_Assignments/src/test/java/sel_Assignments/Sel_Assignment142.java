package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*
 * 142) Launch google.com and do the right click on Gmail.
 * 
 * 
 */
public class Sel_Assignment142 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement mailbtn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/a"));
		
		Actions a1 = new Actions(driver);
		a1.contextClick(mailbtn).perform();
	}

}
