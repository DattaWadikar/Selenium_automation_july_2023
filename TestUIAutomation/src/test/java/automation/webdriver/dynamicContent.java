package automation.webdriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.address.DynamicAddressConnectHandler;

public class dynamicContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Dynamic Content']")).click();
		driver.findElement(By.xpath("//a[text()='click here']")).click();
		List<WebElement> DynamaicList=driver.findElements(By.xpath("//div[@id='content']/div[@class='row']"));
		
		for(int i=0;i<DynamaicList.size();i++) {
			
			String text=DynamaicList.get(i).getText();
			System.out.println(text);
		}
		
		

	}

}
