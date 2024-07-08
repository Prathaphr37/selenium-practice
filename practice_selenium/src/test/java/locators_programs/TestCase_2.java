package locators_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);

		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("prathap");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("12345");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		Thread.sleep(10000);
		driver.close();
		
	}

}
