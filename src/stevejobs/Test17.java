package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		String x=driver.findElement(By.linkText("Sign in")).getAttribute("id");
		System.out.println("id: "+x);
		Thread.sleep(5000);
		String y=driver.findElement(By.id("gs_htif0")).getTagName();
		System.out.println("tag name: "+y);
		Thread.sleep(5000);
		driver.close();
	}

}
