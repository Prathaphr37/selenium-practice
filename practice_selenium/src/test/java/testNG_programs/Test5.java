package testNG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {

	@Test(groups = "sanity")
	public void chats() {
		Reporter.log("chats",true);
	}
	
	
	@Test(groups = "system",dependsOnGroups = "smoke")
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(groups = "smoke")
	public void settings() {
		Reporter.log("settings",true);
	}
	
	@Test(groups = "integration")
	public void images() {
		Reporter.log("images",true);
	}
}
