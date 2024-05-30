package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel_Assignment136 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://x.com/i/flow/signup");
		
	  driver.manage().window().maximize();
	  WebElement nwaccnt = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/button[2]/div"));
	  nwaccnt.click();

	  WebElement firstName = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/label/div/div[2]"));
	  firstName.click();
	  firstName.sendKeys("Shiva");
	  
	}

}
