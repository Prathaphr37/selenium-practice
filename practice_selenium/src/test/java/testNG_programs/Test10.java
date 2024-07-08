package testNG_programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

import com.mysql.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test10 {

	public WebDriver driver;
	public Driver driverff;
	public ResultSet result;
	public Connection con;

	@BeforeSuite
	public void connecttoDB() throws SQLException {
		driverff = new Driver();
		DriverManager.registerDriver(driverff);
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pdb", "root", "Admin@123");
		Statement stat = con.createStatement();
		String query = "select * from details";
		result = stat.executeQuery(query);
	}

	@AfterSuite
	public void closeDB() throws SQLException {
		con.close();
	}

	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void facebookLogin() throws SQLException {

		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(result.getString(1));
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(result.getString(2));
		driver.findElement(By.xpath("//button[@name='login']")).click();
		String title = driver.getTitle();
		Reporter.log(title, true);
		String url = driver.getCurrentUrl();
		Reporter.log(url, true);
	}

	@AfterMethod
	public void closeApp() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}
