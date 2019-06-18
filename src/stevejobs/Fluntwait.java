package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluntwait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.thehindu.com/");
		//Conditional wait as fluent
		Wait<WebDriver> w=new FluentWait<WebDriver>(driver).withTimeout(15,TimeUnit.SECONDS).pollingEvery(2,TimeUnit.SECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-menu']/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
