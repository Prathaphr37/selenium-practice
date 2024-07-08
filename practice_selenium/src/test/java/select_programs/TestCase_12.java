package select_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_12 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/listbox.html");

		WebElement dropdown = driver.findElement(By.xpath("//select[@name='listbox']"));

		Select s = new Select(dropdown);
		
		List<WebElement> allOptions = s.getOptions();
		
		for (WebElement lv : allOptions) {
			System.out.println(lv.getText());
		}
		Thread.sleep(5000);
		
		driver.close();
	}
}
