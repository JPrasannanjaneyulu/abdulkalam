package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exwait 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.thehindu.com/");
		//Conditional wait as explicit
		WebDriverWait w=new WebDriverWait(driver,15);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-menu']/ul/li[2]/a")));
		driver.findElement(By.xpath("//*[@id='main-menu']/ul/li[2]/a")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
