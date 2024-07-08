package webdriversMethods_programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriversMethods_6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		driver.get("https://demoqa.com/browser-windows");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();

		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		
		for (String lv : allWindows) {
			driver.switchTo().window(lv);
			driver.close();
		}
		driver.switchTo().window(mainWindow);
	}
}
