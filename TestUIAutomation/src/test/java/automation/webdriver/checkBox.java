package automation.webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]")).click();
		WebElement element=driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		
		if(element.isSelected())
			System.out.println("Pass :" + " " + "checkBox is selected ");
		
		else
			System.out.println("Fail :" + " " + "checkBox is not selected ");



	}

}
