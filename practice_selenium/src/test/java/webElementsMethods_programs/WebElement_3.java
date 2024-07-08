package webElementsMethods_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement fn = driver.findElement(By.xpath("//input[@id='FirstName']"));
		System.out.println(fn.getTagName());
		System.out.println(fn.getText());
		System.out.println(fn.getSize().height);
		System.out.println(fn.getSize().width);
		System.out.println(fn.getLocation().x);
		System.out.println(fn.getLocation().y);

		System.out.println("---------------------------");
		WebElement ln = driver.findElement(By.xpath("//input[@id='LastName']"));
		System.out.println(ln.getTagName());
		System.out.println(ln.getText());
		System.out.println(ln.getSize().height);
		System.out.println(ln.getSize().width);
		System.out.println(ln.getLocation().x);
		System.out.println(ln.getLocation().y);
		
		
		
		driver.close();


	}
}
