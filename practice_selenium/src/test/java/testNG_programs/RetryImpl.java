package testNG_programs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpl implements IRetryAnalyzer {

	int count = 0;
	int retrylimit = 5;

	@Override
	public boolean retry(ITestResult result) {
		if (count < retrylimit) {
			count++;
			return true;
		} else {

			return false;
		}

	}

}
