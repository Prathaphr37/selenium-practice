package popup_programs.childBrowser_popup;

import java.awt.AWTException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_1 {
	public static void main(String[] args) throws  InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);
		driver.get("https://demoqa.com/browser-windows");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement w1 = driver.findElement(By.xpath("//button[text()='New Window']"));
		wait.until(ExpectedConditions.elementToBeClickable(w1)).click();
		
		WebElement w2 = driver.findElement(By.xpath("//button[text()='New Window']"));
		wait.until(ExpectedConditions.elementToBeClickable(w2)).click();
		
		WebElement w3 = driver.findElement(By.xpath("//button[text()='New Window']"));
		wait.until(ExpectedConditions.elementToBeClickable(w3)).click();
		
		WebElement w4 = driver.findElement(By.xpath("//button[text()='New Window']"));
		wait.until(ExpectedConditions.elementToBeClickable(w4)).click();
		
		String mainWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		System.out.println(mainWindow);
		System.out.println(allWindows);
		
		driver.quit();

	}

}
