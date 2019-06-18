package stevejobs;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmaillogin {

	
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.name("Email")).sendKeys("j.prasannanjaneyulu131");
		driver.findElement(By.name("signIn")).click();
		Thread.sleep(5000);
		File ss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File ds=new File("D:\\batch229\\.png");
		FileUtils.copyFile(ss, ds);
	}

}
