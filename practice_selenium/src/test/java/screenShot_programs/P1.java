package screenShot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class P1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		
		 TakesScreenshot ts= (TakesScreenshot) driver;
		 File src = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		 File dst = new File("./screenshot/p1.png");
		 FileUtils.copyFile(src, dst);
		 
	}
}
