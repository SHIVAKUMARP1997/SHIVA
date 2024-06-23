package sel_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * 167) Automate https://grotechminds.com/registration/ reach till file upload option
 * 
 * 
 */
public class Sel_Assignment167 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://grotechminds.com/registration/");
	
	
	Thread.sleep(1000);
	WebElement fname = driver.findElement(By.cssSelector("#fname"));
	fname.sendKeys("Shiva");
	
	WebElement Lname = driver.findElement(By.cssSelector("#lname"));
	Lname.sendKeys("Kumar");
	
	WebElement mail = driver.findElement(By.cssSelector("#email"));
	mail.sendKeys("Someone@gmail.com");
	
	WebElement pwd = driver.findElement(By.cssSelector("#password"));
	pwd.sendKeys("password");
	
	WebElement chkbx = driver.findElement(By.cssSelector("#male"));
	chkbx.click();
	
	WebElement drpdwn1 = driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
	drpdwn1.click();
	drpdwn1.sendKeys(Keys.DOWN);
	drpdwn1.sendKeys(Keys.ENTER);
	
	WebElement drpdwn2 = driver.findElement(By.xpath("//div[@class='form-group col-md-6']"));
	drpdwn2.click();
	
	Thread.sleep(1000);
	
	drpdwn1.sendKeys(Keys.DOWN);
	drpdwn1.sendKeys(Keys.DOWN);
	drpdwn1.sendKeys(Keys.DOWN);drpdwn1.sendKeys(Keys.DOWN);drpdwn1.sendKeys(Keys.DOWN);drpdwn1.sendKeys(Keys.DOWN);

	drpdwn1.sendKeys(Keys.ENTER);
	
	
//	WebElement el1 = driver.findElement(By.xpath("//*[@id=\"Country\"]/option"));
//	Select S1 = new Select(el1);
//	S1.selectByVisibleText("India");
	
	
	WebElement wb = driver.findElement(By.cssSelector(".file"));
	wb.sendKeys("\"C:\\Users\\LENOVO\\Downloads\\learningHTML1.html\"");
	
	
	
	
	
	
	
	}

}
