package stevejobs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jrex3 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
	//Launch site
	System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	//Do login
	driver.findElement(By.name("Email")).sendKeys("j.prasannanjaneyulu131");
	driver.findElement(By.id("next")).click();
	Thread.sleep(5000);
	driver.findElement(By.name("Passwd")).sendKeys("9951688146");
	driver.findElement(By.id("signIn")).click();
	Thread.sleep(5000);
	//Click compose
	driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
	Thread.sleep(5000);
	//Fill fields
	driver.findElement(By.name("to")).sendKeys("apj@abdulkalam.com");
	driver.findElement(By.name("subjectbox")).sendKeys("wishes");
	driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("Hi sir,",Keys.ENTER,"How are you in heven?",Keys.ENTER,"Regards:",Keys.ENTER,"JP.Prasannanjaneyulu");
	driver.findElement(By.xpath("//*[@data-tooltip='Attach files']/descendant::*[3]")).click();
	Thread.sleep(5000);
	//Handle file upload pop-up window
	StringSelection s=new StringSelection("C:\\Users\\Public\\Pictures\\flower.jpg");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(130000);
	//Click send
	driver.findElement(By.xpath("//*[text()='Send']")).click();
	Thread.sleep(5000);
	String x=driver.findElement(By.xpath("//*[@role='alert']/descendant::*[3]")).getText();
	System.out.println(x);
	//Do logout
	driver.findElement(By.xpath("//*[starts-with(@title,'Google Acc')]/child::*")).click();
	Thread.sleep(5000);
	driver.findElement(By.linkText("Sign out")).click();
	Thread.sleep(5000);
	//Close site
	driver.close();
	}

}
