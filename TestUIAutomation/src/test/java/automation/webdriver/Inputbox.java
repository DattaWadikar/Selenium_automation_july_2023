package automation.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Inputbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expText = "https://the-internet.herokuapp.com/inputs";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Inputs']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("123456");
		String actText = driver.getCurrentUrl();

		if (actText.equals(expText))
			System.out.println("Pass : " + actText + " is equal to " + expText);

		else
			System.out.println("Fail : "+ actText + " is not equal to " + expText);

		driver.quit();

	}

}
