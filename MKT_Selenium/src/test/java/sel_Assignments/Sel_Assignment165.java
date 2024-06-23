package sel_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 165)Demostrate a code for Java script popup, use JSAM application
 * 
 * 
 */
public class Sel_Assignment165 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/learningHTML1.html");
		
		driver.manage().window().maximize();
		
		driver.switchTo().alert().accept();

	}

}
