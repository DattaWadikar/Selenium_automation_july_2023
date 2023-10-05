package automation.webdriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class link {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	
		List<WebElement> links=driver.findElements(By.tagName("a"));	//46
		System.out.println(links.size());
		
		for(WebElement link:links) {
			
			String url=link.getAttribute("href");
			System.out.println(url);
			
			try {
				URL urllink=new URL(url);
				HttpURLConnection httpurlconnection=(HttpURLConnection)urllink.openConnection();
				httpurlconnection.setConnectTimeout(3000);
				httpurlconnection.connect();
				if (httpurlconnection.getResponseCode()==200) {
					
					System.out.println(url +"-"+httpurlconnection.getResponseMessage());
					
				}
				else
					System.out.println(url +"-"+httpurlconnection.getResponseMessage()+"-"+"is Browken link");

				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		


	}

}
