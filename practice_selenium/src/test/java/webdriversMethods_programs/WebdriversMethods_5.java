package webdriversMethods_programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriversMethods_5 {

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

		System.out.println(mainWindow);
		System.out.println(allWindows);
		System.out.println(allWindows.getClass().getName());
		System.out.println("------------");
		
		
		for (String lv : allWindows) {
			System.out.println(lv);
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
