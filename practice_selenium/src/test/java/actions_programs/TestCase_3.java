package actions_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");

		WebElement ele = driver.findElement(By.xpath("//a[text()='COURSE']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text()='Selenium'])[1]")).click();
		
		Thread.sleep(3000);
		WebElement plus_btn = driver.findElement(By.xpath("//button[@id='add']"));

		Thread.sleep(3000);
		a.doubleClick(plus_btn).perform();
	}

}
