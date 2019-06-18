package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		List<WebElement> l=driver.findElements(By.tagName("select"));
		System.out.println("Dropdowns:  "+l.size());
		System.out.println("Dropdowns:  "+l);
		List<WebElement> m=driver.findElements(By.tagName("//input[@type='radio']"));
		System.out.println("Radio buttons: "+m.size());
		System.out.println("Radio buttons: "+m);
		Thread.sleep(5000);
		driver.close();
	}

}
