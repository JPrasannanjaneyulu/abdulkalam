
package stevejobs;

import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appwhatsapp 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		//Define capabilities for APP testing in ARD
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability(CapabilityType.BROWSER_NAME,"");
		c.setCapability("deviceName","T00940UAIJ");
		c.setCapability("platformName","Android");
		c.setCapability("platformVersion","5.1");
		c.setCapability("appPackage","com.whatsapp");
		c.setCapability("appActivity","com.whatsapp.Main");
		//Provide Appium Server IP
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		//Create object to launch APP in ARD
		AndroidDriver driver=new AndroidDriver(u,c);
		Thread.sleep(10000);
		//Do landscape
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(10000);
		//Do portrait
		driver.rotate(ScreenOrientation.PORTRAIT);
		Thread.sleep(10000);
		//Click calls
		driver.findElement(By.xpath("//*[@text='CALLS'][@index='0']")).click();
		Thread.sleep(10000);
		//Click charts
		driver.findElement(By.xpath("//*[@text='CHATS'][@index='0']")).click();
		Thread.sleep(10000);
		//Click a contact in list
		driver.findElement(By.xpath("//*[@text='Prasad'][@index='0']")).click();
		Thread.sleep(10000);
		/*//Click call
		driver.findElement(By.xpath("//*[@content-desc='Call'][@index='0']")).click();
		Thread.sleep(10000);
		//Choose video call
		driver.findElement(By.xpath("//*[@text='Video call'][@index='1']")).click();
		Thread.sleep(10000);
		//Click End voice call
		driver.findElement(By.xpath("//*[@content-desc='End Voice Call'][@index='0']")).click();
		Thread.sleep(10000);*/
		//Back to chats
		driver.findElement(By.xpath("//*[@bounds='[6,62][42,98]'][@index='0']")).click();
		Thread.sleep(10000);
		//Swipe left to right
		driver.context("NATIVE_APP");
		Dimension s=driver.manage().window().getSize();
		int startx=(int)(s.width*0.1);
		int endx=(int)(s.width*0.9);
		int starty=(s.height)/2;
		driver.swipe(startx, starty, endx, starty, 1000);
		Thread.sleep(5000);
		//Swipe right to left
		driver.swipe(endx, starty, startx, starty, 1000);
		Thread.sleep(10000);
		//Back to Home
		//driver.sendKeyEvent(AndroidKeyCode.HOME);
		Thread.sleep(10000);
		
		//Close APP
		driver.closeApp();
	}

}
