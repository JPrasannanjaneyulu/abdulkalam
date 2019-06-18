package stevejobs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.findElement(By.name("username")).sendKeys("9912358366");
		driver.findElement(By.name("password")).sendKeys("prasanna123");
		driver.findElement(By.id("loginBTN")).click();
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(wins.get(1));
		driver.close();
		driver.switchTo().window(wins.get(0));
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
		driver.switchTo().frame("frame");
		driver.findElement(By.name("mobile")).sendKeys("9912358366");
		driver.findElement(By.id("greet2")).click();
		driver.findElement(By.name("Send")).click();
		Thread.sleep(5000);
		String x=driver.findElement(By.xpath("html/body/form/div[3]/div/p/span")).getText();
		System.out.print(x);
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='mainBody']/div[5]/div/ul/li[7]/i")).click();
		driver.quit();
	}

}
