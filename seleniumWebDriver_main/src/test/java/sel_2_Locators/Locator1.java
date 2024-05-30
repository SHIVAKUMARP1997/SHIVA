package sel_2_Locators;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
/*
 * Purpose of the Locator is to locate the elements.
 * In a webpage we will be having n numbers of elements and we need to identify them uniquely,
 * and that is possible with the help of locators.
 * 
 * 
 * We have 8 type of locators, and all the locators methods are available inside the 'By' class.
 * 
 * id
 * name
 * linkTest
 * partialLinktext
 * 
 * ------------WE use class and tag for multible web elements or the list items.
 * className
 * tagName
 * 
 * cssSelector --CustomizedLocator.
 * xpath   ------CustomizedLocator.
 * 
 */
public class Locator1 {

	public static void main(String[] args) {
		
				
		WebDriver driver = new ChromeDriver(); // to open chrome driver.
		driver.get("https:\\demo.opencart.com"); // to open URL
		
		driver.manage().window().minimize(); // to minimize the window.
		driver.manage().window().maximize(); // to maximize the window.
		
/*
 * Locators that locates specific single webelements becuase id, name, linktext will be 
 *different from one another.
*/
		
		//id
		boolean isLogoThere = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println("is Logo displayed : " +isLogoThere);
//		
		//name
//		driver.findElement(By.name("search")).sendKeys("Mac");
//
		
		//linkText
//		driver.findElement(By.linkText("Tablets")).click();
		
		
//		//partialLinkText
//		driver.findElement(By.partialLinkText("Table")).click();
//		
//		
//		
		
		
//		//tagName and  class name are used for to get the group of web elements.
//		driver.findElement(By.className("information"));
		
		//className ----findElements for list items.
		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));

		System.out.println("The size of the headerLink is : "+headerLinks.size());

		
		//tagName -------findElements for list items.
		List<WebElement> tags = driver.findElements(By.tagName("a"));
				System.out.println("Total number of links on the page are :" +tags.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
				System.out.println("The number of images in the page are : "+images.size());
		 
				
				
				
//		driver.findElement(By.tagName("a"));
//		
//		
//		//Customized Locators
//		driver.findElement(By.cssSelector("#fname"));
//
//		driver.findElement(By.xpath("//input[@value='f']"));

		
			
		driver.close();// Closing the web browser.
		
	}

	
}
