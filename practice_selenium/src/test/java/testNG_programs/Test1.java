package testNG_programs;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void chats() {
		Reporter.log("chats",true);
	}
	
	
	@Test
	public void calls() {
		Reporter.log("calls",true);
	}
	
	@Test
	public void settings() {
		Reporter.log("settings",true);
	}
	
	@Test
	public void images() {
		Reporter.log("images",true);
	}
}
