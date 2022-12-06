package package1.Firstmavenproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class calculator {
	@Test
	public void appiumTest() throws MalformedURLException {
			// TODO Auto-generated method stub
			Activity activity=new Activity("com.android.calculator2","com.android.calculator2.Calculator");
			UiAutomator2Options ui=new UiAutomator2Options();
			ui.setDeviceName("myMobile");
			AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723"),ui);
			driver.startActivity(activity);
			
	}
}
