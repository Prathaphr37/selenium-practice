package locators_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgotten")).click();
		driver.findElement(By.id("identify_email")).sendKeys("prathaphr@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("did_submit")).click();
		Thread.sleep(10000);
		driver.close();
	}

}
