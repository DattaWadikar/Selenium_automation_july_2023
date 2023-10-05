package automation.webdriver;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class launchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String title=driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.xpath("//h5[text()='Login']"));
		System.out.println(text.getText());
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item' and text()='Add Employee']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Tom");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("TomJocy");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("TomTom");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.sclrol(0,250)", "");
		ele.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input' and text()='Afghan']")).click();

		WebElement dropdown_ele=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		//Select select=new Select(dropdown_ele);
		//select.selectByValue("Name (A to Z)");
		
		/*select.selectByIndex(0);
		select.selectByValue(title);
		select.selectByVisibleText(title);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.quit();
		

	}

}
