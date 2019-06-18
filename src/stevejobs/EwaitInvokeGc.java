package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EwaitInvokeGc 
{
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.yahoomail.com");
		driver.findElement(By.name("username")).sendKeys("sankarmq");
		driver.findElement(By.id("login-signin")).click();
		WebDriverWait w = new WebDriverWait(driver, 10000);
		// ExpectedConditions:button is enabled:like Element To Be
		// Clickable;textbox is visible;visibilityOf
		// alert is present.............
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("passwd")));
		driver.findElement(By.name("passwd")).sendKeys("mqsankar");
		driver.findElement(By.name("signin")).click();
	}
}
