package package1.Firstmavenproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ecommerce {
	@Test
	public void appiumTest() throws MalformedURLException {
			// TODO Auto-generated method stub
			//Activity activity=new Activity("com.android.calculator2","com.android.calculator2.Calculator");
			UiAutomator2Options ui=new UiAutomator2Options();
			ui.setDeviceName("myMobile");
			ui.setApp("C:\\Users\\User-07\\eclipse-workspace\\Firstmavenproject\\src\\test\\java\\package1\\Firstmavenproject\\ApiDemos-debug.apk");
			@SuppressWarnings("unused")
			AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723"),ui);
			//driver.startActivity(activity);
			//driver.findElement(By.xpath(null))
			//driver.findElement(By.id(null))
			//driver.findElement(By.xpath(null))
			//driver.findElement(By.id(null))
			//driver.findElement(By.id(null))
			
	}
}
