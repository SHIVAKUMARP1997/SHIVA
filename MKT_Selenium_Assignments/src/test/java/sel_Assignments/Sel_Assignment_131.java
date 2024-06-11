package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 131) locate each component of JSAM application using absolute xpath(excluding dropdown and disable)
 * 
 * 
 */
public class Sel_Assignment_131 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/learningHTML1.html");
		
		WebElement el1 = driver.findElement(By.xpath("/html/body/input[1]"));
		el1.sendKeys("Shivakumar");
		
		WebElement el2 = driver.findElement(By.xpath("/html/body/input[2]"));
		el2.sendKeys("Hint");
		
		WebElement el3 = driver.findElement(By.xpath("/html/body/input[3]"));
		el3.sendKeys("password");
				
		WebElement el4 = driver.findElement(By.xpath("/html/body/form[1]/input[1]"));
		el4.sendKeys("firstName");
		
		WebElement el5 = driver.findElement(By.xpath("/html/body/form[2]/input[1]"));
		el5.click();
		
		WebElement el6 = driver.findElement(By.xpath("/html/body/form[2]/input[2]"));
		el6.click();

		WebElement el7 = driver.findElement(By.xpath("/html/body/form[2]/input[3]"));
		el7.click();
		
		WebElement el8 = driver.findElement(By.xpath("/html/body/input[4]"));
		el8.click();
		
		WebElement el9 = driver.findElement(By.xpath("/html/body/input[5]"));
		el9.click();
		
		WebElement el10 = driver.findElement(By.xpath("/html/body/input[6]"));
		el10.click();
		
		WebElement drpdwn=driver.findElement(By.xpath("/html/body/select"));
		Select s=new Select(drpdwn);
		s.selectByValue("1");
		
		System.out.println("All Operation executed");
	}

}
