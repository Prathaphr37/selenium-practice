package select_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
		
		Select s = new Select(dropdown);
		Thread.sleep(3000);
		
		s.selectByIndex(5);
		Thread.sleep(3000);
		
		s.selectByValue("11116");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Crafts");
		Thread.sleep(3000);
		
		s.selectByIndex(0);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
