package testNG_programs;

import org.testng.annotations.Test;

public class Test0 {

	@Test
	public void tc1() {
		org.testng.Reporter.log("Hello Java", true);
		org.testng.Reporter.log("Hello Selenium", false);
	}
}
