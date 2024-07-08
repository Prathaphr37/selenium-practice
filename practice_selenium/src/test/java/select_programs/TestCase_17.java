package select_programs;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_17 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement fn = driver.findElement(By.xpath("//input[@name='firstname']"));
		fn.sendKeys("Prathap");
		Thread.sleep(2000);

		WebElement ln = driver.findElement(By.xpath("//input[@name='lastname']"));
		ln.sendKeys("HR");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("prathaphr@gmail.com");
		Thread.sleep(2000);

		WebElement re_email = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		re_email.sendKeys("prathaphr@gmail.com");
		Thread.sleep(2000);

		// input[@name='reg_email_confirmation__']

		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("Prathap@1998");
		Thread.sleep(2000);

		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select s1 = new Select(day);
		s1.selectByValue("3");
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select s2 = new Select(month);
		s2.selectByValue("7");
		Thread.sleep(2000);

		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select s3 = new Select(year);
		s3.selectByValue("1998");
		Thread.sleep(2000);

		WebElement r_btn = driver.findElement(By.xpath("//input[@value='2']"));
		r_btn.click();

		
		if (s1.isMultiple()) {
			System.out.println("date dropdown is multi select");
		} else {
			System.out.println("date dropdown is single select");
		}
		
		if (s1.isMultiple()) {
			System.out.println("date dropdown is multi select");
		} else {
			System.out.println("date dropdown is single select");
		}

		
		if (s1.isMultiple()) {
			System.out.println("date dropdown is multi select");
		} else {
			System.out.println("date dropdown is single select");
		}

		List<WebElement> dayOptions = s1.getOptions();
		List<WebElement> monthOptions = s2.getOptions();
		List<WebElement> yearOptions = s3.getOptions();

		
		
		System.out.println("Number of days = " + dayOptions.size());
		for (WebElement d : dayOptions) {
			System.out.println(d.getText());
		}

		
		System.out.println("------------------------");
		System.out.println("Number of months = " + monthOptions.size());
		for (WebElement m : monthOptions) {
			System.out.println(m.getText());
		}
		
		System.out.println("------------------------");
		System.out.println("Number of years = " + yearOptions.size());
		for (WebElement y : yearOptions) {
			
				System.out.println(y.getText());
		}
		
		//if i want to convert string year to integer
	/*	for (WebElement y : yearOptions) {
			String x = y.getText();
			int n_y = Integer.parseInt(x);
			if (n_y > 1997) {
				System.out.println(y.getText());
			} else {
				break;
			}
		}*/
		
		System.out.println("--------------------------------");
		TreeSet day_set = new TreeSet<>();
		for (WebElement d : dayOptions) {
			day_set.add(d.getText());
		}
		System.out.println(day_set);
		
		
		System.out.println("--------------------------------");
		TreeSet month_set = new TreeSet<>();
		for (WebElement m : monthOptions) {
			month_set.add(m.getText());
		}
		System.out.println(month_set);
		
		System.out.println("--------------------------------");
		TreeSet year_set = new TreeSet<>();
		for (WebElement y : yearOptions) {
			year_set.add(y.getText());
		}
		System.out.println(year_set);
		
//		Thread.sleep(10000);
//		driver.close();
	}
}
