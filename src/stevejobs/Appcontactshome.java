package stevejobs;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Appcontactshome 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		//Define capabilities for APP testing in ARD
		DesiredCapabilities c=new DesiredCapabilities();
		c.setCapability(CapabilityType.BROWSER_NAME,"");
		c.setCapability("deviceName","T00940UAIJ");
		c.setCapability("platformName","Android");
		c.setCapability("platformVersion","5.1");
		c.setCapability("appPackage","com.android.contacts");
		c.setCapability("appActivity",".activities.PeopleActivity");
		//Provide Appium Server IP
		URL u=new URL("http://127.0.0.1:4723/wd/hub");
		//Create object to launch APP in ARD
		AndroidDriver driver=new AndroidDriver(u,c);
		Thread.sleep(1000);
		//Swipe top to bottom
		driver.context("NATIVE_APP");
		Dimension s=driver.manage().window().getSize();
		int startx=(s.width)/2;
		int starty=(int)(s.height*0.11);
		int endy=(int)(s.height*0.99);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(0000);
		driver.swipe(startx, endy, startx, starty, 1000);
		Thread.sleep(10000);
		//Click Home
		driver.findElement(By.xpath("//*[@text='Home'][@index='1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='995-168-8146'][@index='1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@text='!dea'][@index='0']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@content-desc='End'][@index='0']")).click();
		Thread.sleep(5000);
		//Close app
		driver.closeApp();
	}

}
