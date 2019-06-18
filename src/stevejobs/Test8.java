package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	
	public static void main(String[] args) throws InterruptedException {
		//Launch google site
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		//navigate to gmail
		driver.navigate().to("http://www.gmail.com");
		Thread.sleep(5000);
		//back to google
		driver.navigate().back();
		Thread.sleep(5000);
		//forward to gmail
		driver.navigate().forward();
		Thread.sleep(5000);
		//reload gmail
		driver.navigate().refresh();
		Thread.sleep(5000);
		//close site
		driver.close();
			}

}
