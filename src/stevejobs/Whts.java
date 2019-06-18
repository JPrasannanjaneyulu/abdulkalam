package stevejobs;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Whts {

	
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
				//Click calls
				driver.findElement(By.xpath("//*[@text='CALLS'][@index='0']")).click();
				Thread.sleep(10000);
				//Click chats
				driver.findElement(By.xpath("//*[@text='CHATS'][@index='0']")).click();
				Thread.sleep(10000);
				//Click a contact in list
				driver.findElement(By.xpath("//*[@text='Prasad'][@index='0']")).click();
				Thread.sleep(10000);
				//copy a message in chat
				WebElement e1=driver.findElement(By.xpath("//*[@class='android.view.View,][@index='8']"));
				driver.pinch(e1);
				driver.findElement(By.xpath("//*[@class='android.widget.TextView'][@index='1']")).click();
	}

}
