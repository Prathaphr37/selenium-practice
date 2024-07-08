package pom_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRary_Page {

	@FindBy(xpath="//a[text()='LOGIN']")
	private WebElement loginBTN;

	@FindBy(xpath="//input[@id='email']")
	private WebElement usernameTB;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordTB;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement submitBTN;
	
	
	public SkillRary_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getLoginBTN() {
		return loginBTN;
	}


	public void setLoginBTN(WebElement loginBTN) {
		this.loginBTN = loginBTN;
	}


	public WebElement getUsernameTB() {
		return usernameTB;
	}


	public void setUsernameTB(WebElement usernameTB) {
		this.usernameTB = usernameTB;
	}


	public WebElement getPasswordTB() {
		return passwordTB;
	}


	public void setPasswordTB(WebElement passwordTB) {
		this.passwordTB = passwordTB;
	}


	public WebElement getSubmitBTN() {
		return submitBTN;
	}


	public void setSubmitBTN(WebElement submitBTN) {
		this.submitBTN = submitBTN;
	}

	public void loginbutton() {
		loginBTN.click();
	}
	public void Login(String un, String pwd) {
		usernameTB.sendKeys(un);
		passwordTB.sendKeys(pwd);
		submitBTN.click();
	}
	
}
