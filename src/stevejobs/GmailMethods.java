package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailMethods 
{
	WebDriver driver;
	public String launch(String l,String d,String c)
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(d);
		return("done");
	}
	public String fill(String l,String d,String c)
	{
		driver.findElement(By.xpath(l)).sendKeys(d);
		return("done");
	}
	public String click(String l,String d,String c) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(l)).click();
		return("done");
	}
	public String checkUserid(String l,String d,String c) throws InterruptedException
	{
		if(c.equalsIgnoreCase("valid") && driver.findElement(By.name("Passwd")).isDisplayed())
		{
			return("Test passed");
		}
		else if(c.equalsIgnoreCase("invalid") && driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
		{
			return("Test passed");
		}
		else
		{
			return("Test failed");
		}
		
	}
	public String close(String l,String d,String c) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		return("done");
	}
}
