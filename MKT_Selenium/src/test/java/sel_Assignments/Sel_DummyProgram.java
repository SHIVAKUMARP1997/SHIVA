package sel_Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.pharmeasy.in");
		driver.manage().window().maximize();
		
		WebElement SearchBox = driver.findElement(By.xpath("(//div[@class='c-PJLV c-bXbWpx c-bXbWpx-icOztnM-css'])"));
		SearchBox.click();
		
		driver.findElement(By.id("topBarInput")).sendKeys("Shiva");
		
		
		Thread.sleep(2000);
		List<WebElement> autsgn = driver.findElements(By.xpath("//div[@class='c-PJLV c-bXbWpx c-bXbWpx-lfylVv-direction-row c-bXbWpx-ieEdGyD-css']/div/span"));
		
		int count = autsgn.size();
	    System.out.println(count);
		autsgn.get(5).click();
		
		
				//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();


	}

}
