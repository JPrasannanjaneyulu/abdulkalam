package stevejobs;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Websiteautomationinmobiledevice 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter computer or mobile");
		String x=sc.nextLine();
		WebDriver driver;
		if(x.equals("computer"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else
		{
			DesiredCapabilities c=new DesiredCapabilities();
			c.setCapability(CapabilityType.BROWSER_NAME,"Chrome");
			c.setCapability("deviceName","T00940UAIJ");
			c.setCapability("platformName","Android");
			c.setCapability("platformVersion","5.1");
			//Provide Appium Server IP
			URL u=new URL("http://127.0.0.1:4723/wd/hub");
			//Create object to launch APP in ARD
			driver=new AndroidDriver(u,c);
		}
		driver.get("https://www.gmail.com");
		//Do login
		driver.findElement(By.name("Email")).sendKeys("j.prasannanjaneyulu131");
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("Passwd")).sendKeys("9951688146");
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		//Close site
		driver.close();
		//Do logout
		//driver.findElement(By.xpath("//*[starts-with(@title,'Google Acc')]/child::*")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.linkText("Sign out")).click();
		//Thread.sleep(5000);
		//Close site
		//driver.close();
	}

}
