package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).sendKeys("facebooklogin");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).clear();
		Thread.sleep(5000);
		driver.close();
	}

}
