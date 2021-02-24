package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class LearningISuiteListeners implements ISuiteListener{

	public void onStart(ISuite suite) {
		System.out.println("onStart Listener");
	}

	public void onFinish(ISuite suite) {
		System.out.println("onFinish Listener");
	}

	
}
