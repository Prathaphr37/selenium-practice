package javascriptExecutor_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbar3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("woodland shoes");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//a[text()='FAQ']"));

		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		Thread.sleep(5000);
		ele.click();
		
	}
}
