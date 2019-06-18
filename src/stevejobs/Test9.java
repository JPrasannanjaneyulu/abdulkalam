package stevejobs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test9 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.findElement(By.name("firstName")).sendKeys("Janjanam");
		driver.findElement(By.name("lastName")).sendKeys("Prasannanjaneyulu");
		driver.findElement(By.name("phone")).sendKeys("9912358366");
		driver.findElement(By.name("userName")).sendKeys("j.prasannanjaneyulu131@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("2-99-A,Beside Sita Rama Picture Palace");
		driver.findElement(By.name("address2")).sendKeys("Valaparla(PO),Martur(MD)");
		driver.findElement(By.name("city")).sendKeys("Chilakaluripet");
		driver.findElement(By.name("state")).sendKeys("Andhra Pradesh");
		driver.findElement(By.name("postalCode")).sendKeys("523260");
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("INDIA");
		List<WebElement> l=s.getOptions();
		System.out.println(l.size());
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.close();
	}

}
