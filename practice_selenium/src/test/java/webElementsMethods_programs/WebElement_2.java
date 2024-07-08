package webElementsMethods_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement fn = driver.findElement(By.xpath("//input[@id='FirstName']"));
		System.out.println(fn.isDisplayed());
		System.out.println(fn.isEnabled());

		WebElement ln = driver.findElement(By.xpath("//input[@id='LastName']"));
		System.out.println(ln.isDisplayed());
		System.out.println(ln.isEnabled());
		
		
		
		driver.close();


	}
}
