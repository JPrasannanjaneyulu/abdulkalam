package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsituation6twofailed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Disable an Enabled Element
		WebElement e=driver.findElement(By.name("Email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("aruments[1].setAttribute('disabled', '');",e);
	}

}
