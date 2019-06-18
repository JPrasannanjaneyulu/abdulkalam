package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsituation7two {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Disable an Enabled Element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('Email').setAttribute('disabled','');");
		Thread.sleep(5000);
		//Enable a Disabled Element
		WebElement e=driver.findElement(By.id("Email"));
		js.executeScript("arguments[0].removeAttribute('disabled', '');",e);
	}

}
