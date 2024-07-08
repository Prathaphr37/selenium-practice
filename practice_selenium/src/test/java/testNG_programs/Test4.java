package testNG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {

	@Test(enabled = true)
	public void chats() {
		Reporter.log("chats",true);
	}
	
	
	@Test(invocationCount = 0)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(invocationCount = 3)
	public void settings() {
		Reporter.log("settings",true);
	}
	
	@Test(enabled = false)
	public void images() {
		Reporter.log("images",true);
	}
}
