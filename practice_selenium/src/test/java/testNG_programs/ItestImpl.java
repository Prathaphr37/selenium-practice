package testNG_programs;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ItestImpl implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("on test Start",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("on test Success",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("on test Failure",true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("on test Skipped",true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("on onTestFailedButWithinSuccessPercentage",true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("on onTestFailedWithTimeout",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log("on start of the test case",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("on finish of the test case",true);
	}

	

	
	

}
