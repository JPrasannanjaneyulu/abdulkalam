package stevejobs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gsituation6one {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		//Disable an Enabled Element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('Email').setAttribute('disabled','');");
	}

}
