package pom_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google_page {

	//declaration
	@FindBy(name="q")
	private WebElement searchBarTB;
	
	//initialization
	public Google_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBarTB() {
		return searchBarTB;
	}

	public void setSearchBarTB(WebElement searchBarTB) {
		this.searchBarTB = searchBarTB;
	}
	
	//utilization using business libraries
	
	public void searchBar(String name) {
		searchBarTB.sendKeys(name);
	}
	
}
