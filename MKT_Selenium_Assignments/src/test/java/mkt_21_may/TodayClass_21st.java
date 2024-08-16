package mkt_21_may;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TodayClass_21st {
	
//	finding Broken Link
	
	static void FindingBrokenLink(String urls) throws IOException {
		
		URL u1 = new URL(urls);
		HttpURLConnection c1 = (HttpURLConnection) u1.openConnection();
		c1.connect();
		
		if(c1.getResponseCode()==200) {
			System.out.println("OK - Valid");
		}else{
			System.err.println("Broken");
			
		}
			
	}
	

	public static void main(String[] args) throws IOException, MalformedURLException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int countOfLinks = links.size();  
		System.out.println(countOfLinks);
		System.out.println(links.get(20));
		
		//Printing the Links
		for(int i=0; i<countOfLinks; i++) {
			
			WebElement s1 = links.get(i);
			
			String finalLink = s1.getAttribute("href\n");
			
			System.out.println(finalLink);
			
			FindingBrokenLink(finalLink);
		}
	}

}

