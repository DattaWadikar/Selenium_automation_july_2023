package automation.webdriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class WindowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> allwindows=driver.getWindowHandles(); //parentid childid
		
		Iterator<String> it=allwindows.iterator();
		String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		String emailId=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);		
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId);
		
		
		
		
		
		
		//Please email us at mentor@rahulshettyacademy.com with below template to receive response

		
		//driver.close();
		
		

		
		
		
		

	}

}
