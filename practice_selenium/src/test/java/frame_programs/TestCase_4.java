package frame_programs;

import java.util.concurrent.TimeUnit;

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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/frame1.html");
		Thread.sleep(3000);
		
		 WebElement ele = driver.findElement(By.xpath("//input[@id='title']"));
		 ele.sendKeys("Login");
		 Thread.sleep(3000);
		 
		WebElement fr = driver.findElement(By.xpath("//iframe[@id='f2']"));
		driver.switchTo().frame(fr);
		
		driver.findElement(By.xpath("//input[@id='first']")).sendKeys("Prathap");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='last']")).sendKeys("HR");
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		ele.clear();
		
		Thread.sleep(2000);
		ele.sendKeys("again");
		
		Thread.sleep(5000);
		driver.close();
	}
}
