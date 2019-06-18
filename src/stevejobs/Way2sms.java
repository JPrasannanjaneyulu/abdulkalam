package stevejobs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Way2sms {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.findElement(By.name("username")).sendKeys("9912358366");
		driver.findElement(By.name("password")).sendKeys("prasanna123");
		driver.findElement(By.id("loginBTN")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
		driver.switchTo().frame("frame");
		driver.findElement(By.name("mobile")).sendKeys("9703356865");
		driver.findElement(By.id("greet2")).click();
		driver.findElement(By.name("Send")).click();
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='mainBody']/div[5]/div/ul/li[7]/i")).click();
		driver.close();
	}

}
