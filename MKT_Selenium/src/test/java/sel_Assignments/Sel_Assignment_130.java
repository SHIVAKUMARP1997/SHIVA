package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Assignment_130 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver(); //step 1
		driver.get("https://www.amazon.in/");  //step 2
		driver.manage().window().maximize();
		
		WebElement B_link = driver.findElement(By.partialLinkText("Best"));
		B_link.click();

	}

}
