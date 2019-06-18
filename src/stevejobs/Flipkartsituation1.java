package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartsituation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement e=driver.findElement(By.xpath("//*[text()='Baby & Kids']"));
		int x=e.getLocation().getX();
		int y=e.getLocation().getY();
		Actions a=new Actions(driver);
		a.moveByOffset(x, y).build().perform();
	}

}
