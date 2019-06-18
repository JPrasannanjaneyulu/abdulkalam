package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		String x=driver.findElement(By.id("hplogo")).getCssValue("font-size");
		System.out.println("Font size: "+x);
		String y=driver.findElement(By.id("hplogo")).getCssValue("color");
		System.out.println("Color: "+y);
		String z=driver.findElement(By.id("hplogo")).getCssValue("background-color");
		System.out.println("Back ground color: "+z);
		Thread.sleep(5000);
		driver.close();
	}

}
