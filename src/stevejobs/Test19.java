package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/A._P._J._Abdul_Kalam");
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("//*[@id='mw-content-text']/p[2]")).getText();
		System.out.println(x);
		Thread.sleep(5000);
		driver.close();
	}

}
