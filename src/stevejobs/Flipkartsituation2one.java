package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartsituation2one {

	
    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement e=driver.findElement(By.xpath("//*[text()='Baby & Kids']"));
		Actions a=new Actions(driver);
		a.doubleClick(e).build().perform();
	}

}
