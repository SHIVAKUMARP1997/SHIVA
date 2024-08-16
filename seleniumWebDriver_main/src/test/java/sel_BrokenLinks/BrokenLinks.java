package sel_BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	
	static void BrokenLink_Finding(String eachLink) throws MalformedURLException,IOException {
	try {
		
	
		URL u1 = new URL (eachLink);
		
		HttpURLConnection c1 = (HttpURLConnection) u1.openConnection();
		c1.connect();
		if(c1.getResponseCode()==200) {
			System.out.println("Link is Valid");
		}else {
			System.out.println("Broken");
		}
		}
	catch(MalformedURLException w1) {
			
			System.out.println("URL was nul SO u are able to see me ");
		}
	catch(NullPointerException w2) {
		
		System.out.println("URL was nul SO u are able to see me ");
		}
	
	
	}
	public static void main(String[] args) throws MalformedURLException,IOException {
	   ChromeDriver driver = new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	  List<WebElement> links = driver.findElements(By.tagName("a"));
	  
	  int numOf_links = links.size();
	  System.out.println("count of links: "+numOf_links);
	  
	  for(int i=0; i<numOf_links; i++) {
		  
		  WebElement ref = links.get(i);
		 
		  String ActualLink = ref.getAttribute("href");
		
		  System.out.println(ActualLink );
		  BrokenLink_Finding(ActualLink);
	  }

	}

}
