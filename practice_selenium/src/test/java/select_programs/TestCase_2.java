package select_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s = new Select(dropdown);
		Thread.sleep(3000);
		
		s.selectByIndex(3);
		Thread.sleep(3000);
		
		s.selectByValue("search-alias=digital-music");
		Thread.sleep(3000);
		
		s.selectByVisibleText("Kindle Store");
		Thread.sleep(5000);
		
		driver.close();
	}

}
