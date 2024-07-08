package webElementsMethods_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElement_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement fn = driver.findElement(By.xpath("//input[@id='FirstName']"));
		fn.sendKeys("Prathap");

		WebElement ln = driver.findElement(By.xpath("//input[@id='LastName']"));
		ln.sendKeys("HR");

		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("prathaphr33@gmail.com");

		WebElement comp = driver.findElement(By.xpath("//input[@id='Company']"));
		comp.sendKeys("Hebya");

		WebElement button = driver.findElement(By.xpath("//a[@id='confirm-button']"));
		Thread.sleep(5000);
		
//		button.sendKeys(Keys.ENTER);
		button.click();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
//		comp.clear();
//		comp.sendKeys("Hebya");
	}
}
