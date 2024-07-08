package select_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_16 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/listbox.html");

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='listbox']"));

		Select s = new Select(dropdown);
		
		s.selectByIndex(0);
		Thread.sleep(3000);
		
		s.selectByValue("G");
		Thread.sleep(3000);
		
		s.selectByVisibleText("LegPiece");
		Thread.sleep(5000);
		
		if (s.isMultiple()) {
			s.deselectAll();
		}
		
		Thread.sleep(5000);
		driver.close();
	}
}
