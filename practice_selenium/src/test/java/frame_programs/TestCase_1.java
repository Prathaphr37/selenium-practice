package frame_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/frame1.html");
		Thread.sleep(3000);
		
		 WebElement ele = driver.findElement(By.xpath("//input[@id='title']"));
		 ele.sendKeys("Login");
		 Thread.sleep(3000);
		 
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@id='first']")).sendKeys("Prathap");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last']")).sendKeys("HR");
		
		Thread.sleep(5000);
		driver.close();
		
		
		
	}
}
