package sel_1_LaunchingBrowsrs;


/*
So, the java jAR file is consisting of the classes and the interfaces in it, 
for each browsers we have different browser_classes.

mainly we focus on 4 browsers:
	
	ChromeDriver driver = new ChromeDriver();

	EdgeDriver driver = new EdgeDriver();
	
	FirefoxDriver driver = new FirefoxDriver();
	
	SafariDriver driver = new SafariDriver();
	
	
Driver_Methods:
	
	As we know that classes will be containing its methods in it, likewise some methods we need to know in browser_Classes. 
	
1) driver.get(); - To launch any URL,

2) driver.close(); - closes the parent tab or, that tab which has the control.

3) driver.quit(); - Closes the parent and the child tabs.

4) driver.getWindowHandle(); - Gives the parent browser ID, and the Returntype is String.

5) driver.getWindowHandles(); -Gives the parent and the child browsers ID, that are open.

6) driver.manage().window().maximize(); - To maximise the window.

7) driver.manage().window().minimize(); - To minimize the window.

*/

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;




public class BrowsrLnchng {

	public static void main(String[] args) {
		
		// Launching the empty browsers.
		
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		//SafariDriver driver = new SafariDriver();
		
		//Launch any URL
		driver.get("https://www.google.co.in");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getWindowHandle());
		
		System.out.println(driver.getWindowHandles());

	}

}
