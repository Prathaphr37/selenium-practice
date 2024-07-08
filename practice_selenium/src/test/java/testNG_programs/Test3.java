package testNG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {

	@Test(priority = 2)
	public void chats() {
		Reporter.log("chats",true);
	}
	
	
	@Test(invocationCount = 2)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(priority = -1, invocationCount = 3)
	public void settings() {
		Reporter.log("settings",true);
	}
	
	@Test
	public void images() {
		Reporter.log("images",true);
	}
}
