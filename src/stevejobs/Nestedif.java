package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedif 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter userid");
		String uid=sc.nextLine();
		System.out.println("Enter userid criteria");
		String uc=sc.nextLine();
		String pwd=null;
		String pc=null;
		if(uc.equals("valid"))
		{
			System.out.println("Enter Password");
			pwd=sc.nextLine();
			System.out.println("Enter password criteria");
			pc=sc.nextLine();
		}
		//Launch gmail site
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com");
		Thread.sleep(5000);
		//Userid testing
		driver.findElement(By.name("Email")).sendKeys(uid);
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		try{
			if(uc.equals("valid") && driver.findElement(By.name("Passwd")).isDisplayed())
			{
				System.out.println("Userid test passed");
				//Password testing
				driver.findElement(By.name("Passwd")).sendKeys(pwd);
				driver.findElement(By.id("signIn")).click();
				Thread.sleep(5000);
				if(pc.equals("valid") && driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
				{
					System.out.println("Password test passed");
				}
				else if(pc.equals("invalid") && driver.findElement(By.id("errormsg_0_Passwd")).isDisplayed())
				{
					System.out.println("Password test passed");
				}
				else
				{
					System.out.println("Password test failed");
				}
			}
			else if(uc.equals("invalid") && driver.findElement(By.id("errormsg_0_Email")).isDisplayed())
			{
				System.out.println("Userid test passed");
			}
			else
			{
				System.out.println("Userid test failed");
			}
		}
		catch(Exception e)
		{
			System.out.println("Test failed");
		}
		//Close site
		driver.close();
	}

}
