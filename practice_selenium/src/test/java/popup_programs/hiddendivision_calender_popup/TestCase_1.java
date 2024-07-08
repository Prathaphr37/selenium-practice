package popup_programs.hiddendivision_calender_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		WebElement ele = driver.findElement(By.xpath("(//p[text()='19'])[1]"));
		
		System.out.println(ele.getText());
		
		ele.click();
	}
}
