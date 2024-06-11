package sel_Assignments;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
 * 162)Find out the number of links in page and Print each URL. 
 * also print its linktext value. 
 */
public class Sel_Assignment162 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> links =   driver.findElements(By.tagName("a"));
		
		
		int L1 = links.size();
		System.out.println("The number of the links are : " +L1);
		
		for(int i=0; i<L1; i++) {
			WebElement a = links.get(i);
			System.out.println("And the Links are : " +a.getAttribute("href"));
			System.out.println("and the link text availabl are : " + a.getText());
			
		}
		
		
		

	}

}
