package sel_Assignments;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

/*
 * 169) Launch google, search india and take a screenshot with your name and current time
 * 
 */

public class Sel_Assignment169 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		Thread.sleep(1000);
		WebElement emnt = driver.findElement(By.id("APjFqb"));
		emnt.sendKeys("Shiva");
		emnt.sendKeys(Keys.ENTER);
		
		
		Thread.sleep(1000);
		WebElement w1 = driver.findElement(By.linkText("Images"));
		w1.click();
		
		
		
		TakesScreenshot s1 = driver;
		
		File source = s1.getScreenshotAs(OutputType.FILE);
		
		Object a = driver.getClass();
		Date D = new Date(0);
		Date tday = new Date(D.getTime()+(60*60*1000*24));
		
		System.out.println(tday);
		
		File dest = new File("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Sel_ScrnShot\\scnsht" + a +".png");
		FileHandler.copy(source, dest);
	}

}
