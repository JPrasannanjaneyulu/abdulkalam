package stevejobs;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html");
		driver.findElement(By.name("username")).sendKeys("9912358366",Keys.TAB,"prasanna123");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		ArrayList<String> wins=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<wins.size();i++);
		{
			System.out.println(wins.get(1));
		}
	}

}
