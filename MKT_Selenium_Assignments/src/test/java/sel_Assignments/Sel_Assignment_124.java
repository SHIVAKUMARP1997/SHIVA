package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 4) * Automate below scenario
1.launch browser
2.goto other website like amazon/flipcart
3.type "sample eg text" on search textfield
4.click on search button
 * 
 * 
 * 
 */
public class Sel_Assignment_124 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
          driver.manage().window().maximize();
        
        //Typing the etxt in the searchbar.
        
       WebElement srchBar = driver.findElement(By.id("twotabsearchtextbox"));
       srchBar.sendKeys("iphone");
       WebElement Button_Search = driver.findElement(By.id("nav-search-submit-button"));
       Button_Search.click();
       
		
       try {
			Thread.sleep(2500);
			driver.close();
  			}
		catch (InterruptedException e) {
  			e.printStackTrace();
  			
  			}
		
	}

}
