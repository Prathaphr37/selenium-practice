package testNG_programs;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test6 {
	@Test
	public void test() {
		Reporter.log("From Test Annotation",true);
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("From beforeSuite Annotation",true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("From afterTest Annotation",true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("From afterSuite Annotation",true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("From beforeClass Annotation",true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("From beforeTest Annotation",true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("From afterClass Annotation",true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("From beforeMethod Annotation",true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("From afterMethod Annotation",true);
	}

}
