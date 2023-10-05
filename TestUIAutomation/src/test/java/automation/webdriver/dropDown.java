package automation.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//a[text()='Dropdown']")).click();

		WebElement ele = driver.findElement(By.xpath("//select[@id='dropdown']"));

		Select sel = new Select(ele);

		sel.selectByIndex(1);

		sel.selectByVisibleText("Option 2");
		sel.selectByValue("1");

	}

}
