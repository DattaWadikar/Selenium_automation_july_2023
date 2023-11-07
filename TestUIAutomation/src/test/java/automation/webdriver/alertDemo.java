package automation.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//a[text()='JavaScript Alerts']")).click();

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		driver.switchTo().alert().sendKeys("Test123");
		
		driver.switchTo().alert().accept();

	}

}
