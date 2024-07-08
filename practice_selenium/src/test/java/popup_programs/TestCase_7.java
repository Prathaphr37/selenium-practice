package popup_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_7 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/postman/selenium/alert.html");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		Alert a = driver.switchTo().alert();
		
		a.accept();
	}

}
