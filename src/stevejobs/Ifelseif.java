package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Ifelseif 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number");
		String uid=sc.nextLine();
		System.out.println("Enter mobile number criteria");
		String uidc=sc.nextLine();
		System.out.println("Enter password");
		String pwd=sc.nextLine();
		System.out.println("Enter password criteria");
		String pwdc=sc.nextLine();
		//Launch way2sms site
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//Do login
		driver.findElement(By.name("username")).sendKeys(uid);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		//Test
		if(uid.length()<10 && ExpectedConditions.alertIsPresent()!=null)
		{
			System.out.println("Test passed");
			driver.switchTo().alert().dismiss();
		}
		else if(uidc.equals("invalid") && pwdc.equals("valid") && driver.findElement(By.xpath("//*[contains(text(),'registered yet')]")).isDisplayed())
		{
			System.out.println("Test passed");
		}
		else if(uidc.equals("valid") && pwdc.equals("invalid") && driver.findElement(By.xpath("//*[starts-with(text(),'Forgot Password')]")).isDisplayed())
		{
			System.out.println("Test passed");
		}
		else if(uidc.equals("valid") && pwdc.equals("valid") && driver.findElement(By.xpath("//*[@value='Send Free SMS' or @value='Skip']")).isDisplayed())
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		//Close site
		driver.close();
	}

}
