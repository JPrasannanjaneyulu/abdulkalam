package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.tagName("input"));
		int c=0;
		for(int i=0;i<l.size();i++)
		{
			String x=l.get(i).getAttribute("type");
			if(x.equals("radio"))
			{
				c=c+1;
				System.out.println(c);
				System.out.println("input:  "+l.size());
			}
		}
		Thread.sleep(5000);
		driver.close();
	}

}
