package select_programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.ebay.com/");

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));

		Select s = new Select(dropdown);

		s.selectByIndex(5);
		s.selectByValue("11116");
		s.selectByVisibleText("Crafts");
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for (WebElement lv : allOptions) {
			System.out.println(lv.getText());
		}

	}
}
