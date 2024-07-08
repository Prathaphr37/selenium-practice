package testNG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void chats() {
		Reporter.log("chats",true);
	}
	
	
	@Test(priority = 3)
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test(priority = -1)
	public void settings() {
		Reporter.log("settings",true);
	}
	
	@Test
	public void images() {
		Reporter.log("images",true);
	}
}
