package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Link tag:  "+l.size());
		System.out.println("Link tag:  "+l);
		List<WebElement> m=driver.findElements(By.tagName("img"));
		System.out.println("Image tag: "+m.size());
		System.out.println("Image tag: "+m);
		List<WebElement> n=driver.findElements(By.tagName("table"));
		System.out.println("Table tag: "+n.size());
		System.out.println("Table tag: "+n);
		Thread.sleep(5000);
		driver.close();
	}

}
