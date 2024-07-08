package synchronization_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait_TestCase_1 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement un = driver.findElement(By.name("username"));
		wait.until(ExpectedConditions.visibilityOf(un)).sendKeys("admin");

		WebElement pass = driver.findElement(By.name("password"));
		wait.until(ExpectedConditions.visibilityOf(pass)).sendKeys("manager");
		
		WebElement btn = driver.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]"));
		wait.until(ExpectedConditions.elementToBeClickable(btn)).click();
	}

}
