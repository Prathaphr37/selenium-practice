package pom_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_Script {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		Google_page g = new Google_page(driver);
		driver.get("https://www.google.co.in/");
		driver.navigate().refresh();
		g.searchBar("iphones");
		
	}
}
