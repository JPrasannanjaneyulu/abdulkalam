package stevejobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fsituation9sliders {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(5000);
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		WebElement e=driver.findElement(By.id("slider"));
		Actions a=new Actions(driver);
		a.dragAndDropBy(e,60,0).build().perform();
		Thread.sleep(5000);
		a.dragAndDropBy(e,0,30).build().perform();
	}

}
