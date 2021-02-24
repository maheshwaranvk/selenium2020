package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LearningITestListeners implements ITestListener{



	public void onTestSuccess(ITestResult result) {
		System.out.println("Code is Passed without Errors");
	}

	public void onTestFailure(ITestResult result) {
	System.out.println("Code is Failed with Errors");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution is completed");
	}


	
}
