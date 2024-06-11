package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * 
 * 8) Demostrate a code for linktext,
 * locator use google application and click gmail linktext
 */
public class Sel_Assignment_129 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver(); //step 1
		driver.get("https://www.google.com/");  //step 2
		driver.manage().window().maximize();
		
		WebElement G_link = driver.findElement(By.linkText("Gmail"));
		G_link.click();

	}

}
