package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 147)Demonstrate a program methods of WebElement Interface Use JSAM HTML/growtechminds website isSelected()
 * 
 */
public class Sel_Assignment147 {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("file:///C:/Users/LENOVO/Downloads/learningHTML1.html");
		
		WebElement yesno = driver.findElement(By.id("123"));
		
		if(yesno.isSelected())
		{
			System.out.println("Selected");
		}
		else {
			yesno.click();
			System.out.println("Now Selected");
		}
		
		
	}

}
