package locators_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		

		WebElement fn = driver.findElement(By.xpath("//input[@id='FirstName']"));
		fn.sendKeys("Prathap");

		WebElement ln = driver.findElement(By.xpath("//input[@id='LastName']"));
		ln.sendKeys("HR");

		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("prathaphr33@gmail.com");

		WebElement comp = driver.findElement(By.xpath("//input[@id='Company']"));
		comp.sendKeys("Hebya");

		WebElement button = driver.findElement(By.linkText("Let's Go"));
		Thread.sleep(5000);
		button.click();
//		button.sendKeys(Keys.ENTER);
		
		
		
		Thread.sleep(5000);
		driver.close();
		
		
//		comp.clear();
//		comp.sendKeys("Hebya");
	}
}
