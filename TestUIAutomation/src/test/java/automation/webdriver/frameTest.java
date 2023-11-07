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

public class frameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("#draggable")).click();
		WebElement source=driver.findElement(By.cssSelector("#draggable"));		
		WebElement target =driver.findElement(By.cssSelector("#droppable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
		

		
		
		
		

	}

}
