package javascriptExecutor_programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Prathap/OneDrive/Desktop/selenium7.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(3000);

		js.executeScript("document.getElementById('i1').value='prathap'");
		Thread.sleep(5000);

		
		js.executeScript("document.getElementById('i1').value=''");




	}
}
