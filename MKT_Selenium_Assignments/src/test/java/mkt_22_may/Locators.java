package mkt_22_may;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("www.amazon.com");
	driver.findElement(By.name(null)).click();
	
	
	
	
	//driver.quit();
	
	}

}

