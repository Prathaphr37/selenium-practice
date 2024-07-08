package pom_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SkillRary_Script {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SkillRary_Page s = new SkillRary_Page(driver);
		driver.get("https://demoapp.skillrary.com/");
		s.loginbutton();
		s.Login("admin", "admin");

	}
}
