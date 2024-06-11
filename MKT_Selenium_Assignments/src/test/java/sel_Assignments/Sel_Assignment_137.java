package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jdk.internal.net.http.common.Log;

/*
 *137)  Demostrate a program on dropdown for whole page
 *
 *          https://grotechminds.com/dropdown/
 * 
 */
public class Sel_Assignment_137 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		
				
		driver.manage().window().maximize();
		
		//1. Write A Code To Select Demo2 Using Select By Visible Text.
		WebElement Btn1 = driver.findElement(By.xpath("//*[@id='Choice1']"));
		Select s1 = new Select(Btn1);
        s1.selectByVisibleText("Demo2");
        
        //2. Write A Code To Select SQL 15 Using Select By Value.
        WebElement Btn2=driver.findElement(By.xpath("//*[@id=\"Choice9\"]"));
		Select s2 = new Select(Btn2);
		s2.selectByValue("SQL15");
		
		//3. Explain The Procedure Of Selecting Night 10 Dropdown?
		WebElement Btn3=driver.findElement(By.xpath("(//select)[7]"));
		Select s3 = new Select(Btn3);
		s3.selectByIndex(10);
		
		//4. Write Codes Separately To Select QTP 10 And Energy 15 Using Select By Visible Text.
		WebElement Btn4=driver.findElement(By.xpath("(//select)[9]"));
		Select s4 = new Select(Btn4);
		s4.selectByVisibleText("QTP10");
				
				
		//5. Write Codes Separately To Select QTP 9 And Energy 14 Using Select By Visible Text.
		WebElement Btn5=driver.findElement(By.xpath("(//select)[4]"));
		Select s5 = new Select(Btn5);
		s5.selectByVisibleText("Energy14");
		s4.selectByVisibleText("QTP10"); //	To Select QTP 10		
					
		//6. Write Codes Separately To Select QTP 8 And Energy 13 Using Select By Visible Text.
		
		s5.selectByVisibleText("Energy13");
		s4.selectByVisibleText("QTP10"); //To Select QTP 8
					 
						
						
		//7. Write Codes Separately To Select QTP 7 And Energy 12 Using Select By Visible Text.
						
							
		//8. Write Codes Separately To Select QTP 6 And Energy 11 Using Select By Visible Text.
		
        
	}

}


