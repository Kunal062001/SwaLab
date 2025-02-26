package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class Listeners extends BaseTest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
	}
	
    public void onTestFailure(ITestResult result) {
    	try{
    	Screenshot.screenshot(driver, result.getName());
    	System.out.println("Screenshot Saved...To...C:\\traning\\images....");
    	}
    	catch(Exception e) {
    		
    	}
	}
	
    public void onTestSkipped(ITestResult result) {
		
	}

}


//if we have to add Listener(test.Listeners.class) in many test then by adding manually in every test
//is not a good practice.We caan also giver listeners from xml only once and it implement for all test

//We add this before test tag
//  <Listeners>
//  	<listener class-name="test.Listeners">
//  </Listeners>
