package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		driver.findElement(By.id("lst-ib")).sendKeys("facebooklogin");
		Thread.sleep(5000);
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Facebook - Log In or Sign Up")).click();
		driver.findElement(By.id("email")).sendKeys("j.prasannanjaneyulu131@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9912358366");
		driver.findElement(By.id("u_0_l")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("userNavigationLabel")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
		driver.close();
	}

}
