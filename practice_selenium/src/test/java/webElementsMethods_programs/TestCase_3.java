package webElementsMethods_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.amazon.com/");

		WebElement sb = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		sb.sendKeys("iphones");

		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.submit();

		Thread.sleep(15000);
		driver.close();

	}
}
