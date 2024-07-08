package webElementsMethods_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println("Details of User Name Text Box");
		System.out.println("username text is displayed = "+un.isDisplayed());
		System.out.println("username text is Enabled = "+un.isEnabled());
		
		

		System.out.println("--------------------------");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println("Password text is displayed = "+pass.isDisplayed());
		System.out.println("Password text is Enabled = "+pass.isEnabled());
		
		
		System.out.println("--------------------------");
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println("Login Button is displayed = "+btn.isDisplayed());
		System.out.println("Login Button is Enabled = "+btn.isEnabled());
		
		
		Thread.sleep(10000);
		driver.close();
	}

}
