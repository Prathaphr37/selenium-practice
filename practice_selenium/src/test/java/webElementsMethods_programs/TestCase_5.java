package webElementsMethods_programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase_5 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println("Details of User Name Text Box");
		System.out.println("Text = " + un.getText());
		System.out.println("Tag Name = " + un.getTagName());

		int u_h = un.getSize().getHeight();
		int u_w = un.getSize().getWidth();
		System.out.println("Height = " + u_h);
		System.out.println("Width = " + u_w);

		int u_x = un.getLocation().getX();
		int u_y = un.getLocation().getY();
		
		System.out.println("X = "+u_x);
		System.out.println("Y = "+u_y);
		
		System.out.println("Attribute = " + un.getAttribute("id"));

		System.out.println("--------------------------");
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println("Details of Password Text Box");
		System.out.println("Text = " + pass.getText());
		System.out.println("Tag Name = " + pass.getTagName());
		int p_h = pass.getSize().getHeight();
		int p_w = pass.getSize().getWidth();
		System.out.println("Height = " + p_h);
		System.out.println("Width = " + p_w);
		
		int p_x = pass.getLocation().getX();
		int p_y = pass.getLocation().getY();
		
		System.out.println("X = "+p_x);
		System.out.println("Y = "+p_y);
		
		System.out.println("Attribute = " + pass.getAttribute("id"));

		System.out.println("--------------------------");
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println("Details of Login Button");
		System.out.println("Text = " + btn.getText());
		System.out.println("Tag Name = " + btn.getTagName());
		int b_h = btn.getSize().getHeight();
		int b_w = btn.getSize().getWidth();
		System.out.println("Height = " + b_h);
		System.out.println("Width = " + b_w);
		
		int b_x = btn.getLocation().getX();
		int b_y = btn.getLocation().getY();
		
		System.out.println("X = "+b_x);
		System.out.println("Y = "+b_y);
		
		System.out.println("Attribute = " + btn.getAttribute("id"));

		Thread.sleep(10000);
		driver.close();
	}

}
