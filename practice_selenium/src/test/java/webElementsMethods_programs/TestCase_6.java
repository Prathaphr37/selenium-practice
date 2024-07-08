package webElementsMethods_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_6 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("Prathap");
		
		WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.sendKeys("HR");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("prathaphr@gmail.com");
		
		WebElement np = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		np.sendKeys("Prathap@1998");
		
		WebElement r_btn = driver.findElement(By.xpath("//input[@value='2']"));
		r_btn.click();
		
		System.out.println("radio Button is selected = "+ r_btn.isSelected());
		
		Thread.sleep(10000);
		driver.close();
	}

}
