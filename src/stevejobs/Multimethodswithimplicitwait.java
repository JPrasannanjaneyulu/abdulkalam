package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multimethodswithimplicitwait 
{
	public static WebDriver driver;
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
	}

	public static void clickLinks() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("हिन्दी")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("తెలుగు")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("मराठी")).click();
		driver.findElement(By.linkText("English")).click();
	}

	public static void tearDown() 
	{
		driver.quit();
	}

	public static void main(String[] args) 
	{
		Multimethodswithimplicitwait gs = new Multimethodswithimplicitwait();
		gs.setUp();
		clickLinks();
		tearDown();
	}

}
