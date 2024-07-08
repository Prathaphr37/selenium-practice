package popup_programs.javascript_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a = driver.switchTo().alert();
		
		String text = a.getText();
		System.out.println(text);
		Thread.sleep(4000);
		
		a.accept();

	}
}
