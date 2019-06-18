package stevejobs;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	
	public static void main(String[] args) throws InterruptedException {
		//launch way2sms site
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://site24.way2sms.com/content/index.html");
		Thread.sleep(5000);
		//maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//Get size of browser window
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+" "+h);
		Thread.sleep(5000);
		//change size
		Dimension d=new Dimension(500,100);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//Get position
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+" "+y);
		Thread.sleep(5000);
		//change position
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
	}

}
