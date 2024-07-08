package screenShot_programs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class P2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com");
		String title = driver.getTitle();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		File dst = new File("./screenshot/"+title+".png");
		
		//copy the photo from RAM to specified(dst) location
		FileUtils.copyFile(src, dst);

	}
}
