package stevejobs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	
	public static void main(String[] args) throws InterruptedException {
		//Launch browser
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Delete all existing cookies
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		//Open site
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Cookies testing
		if(driver.manage().getCookies().size()!=0)
		{
				System.out.println("Cookies were loaded");
		}
		else
		{
				System.out.println("No Cookies");
		}
		//Close site
		driver.close();
	}

}
