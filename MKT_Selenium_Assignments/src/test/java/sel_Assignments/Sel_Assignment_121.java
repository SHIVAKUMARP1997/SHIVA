package sel_Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 1) Install selenium and demonstrate a basic program to launch empty browser
 * 
 * 
 * 
 */
public class Sel_Assignment_121 {

	public static void main(String[] args) {
		
		
		//Launching the empty browser.
		ChromeDriver driver = new ChromeDriver();
		
		//getting the title of the page 
		driver.get("https://www.google.com/");
		String title_of_the_page=driver.getTitle();
		System.out.println("Title of the page is: " + title_of_the_page);
	}

}
