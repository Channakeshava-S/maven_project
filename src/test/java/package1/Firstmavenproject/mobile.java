package package1.Firstmavenproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;


public class mobile {
	
	@Test
	public void appiumTest() throws MalformedURLException, InterruptedException {
			// TODO Auto-generated method stub
			Activity activity=new Activity("com.whatsapp","com.whatsapp.HomeActivity");
			UiAutomator2Options ui=new UiAutomator2Options();
			//ui.setDeviceName("myMobile");
			//ui.setApp("C:\\Users\\User-07\\eclipse-workspace\\Firstmavenproject\\src\\test\\java\\package1\\Firstmavenproject\\ApiDemos-debug.apk");
			//@SuppressWarnings("unused")
			AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723"), ui);
			driver.startActivity(activity);
			//driver.startActivity(activity);
			//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[6]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView")).click();
			//driver.findElement(By.id(null))
			//driver.findElement(By.xpath(null))
			//driver.findElement(By.id(null))
			//driver.findElement(By.id(null))
			driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Search\"]")).click();
			//driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.TextView")).sendKeys("ok");
			driver.findElement(By.id("com.whatsapp:id/search_input")).sendKeys("Tharun");
			Thread.sleep(2000);
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Video call\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("android:id/button1")).click();
	}
	

}
