package sel_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
/*
 * 
 * 2) Selenium program to get title of browser
 */
public class Sel_Assignment_122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launching the empty browser.
		ChromeDriver driver = new ChromeDriver();
		
		//getting the title of the page 
		driver.get("https://www.google.com/");
		String title_of_the_page=driver.getTitle();
		System.out.println("Title of the page is: " + title_of_the_page);
	}

}
