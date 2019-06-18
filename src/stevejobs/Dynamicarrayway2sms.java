package stevejobs;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicarrayway2sms 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Get multiple data from keyboard
				ArrayList<String> uid=new ArrayList<String>();
				ArrayList<String> uidc=new ArrayList<String>();
				ArrayList<String> pwd=new ArrayList<String>();
				ArrayList<String> pwdc=new ArrayList<String>();
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter count of data");
				int c=Integer.parseInt(sc.nextLine());
				for(int i=0;i<c;i++)
				{
					System.out.println("Enter a uid");
					uid.add(sc.nextLine());
					System.out.println("Enter a uid criteria");
					uidc.add(sc.nextLine());
					System.out.println("Enter a pwd");
					pwd.add(sc.nextLine());
					System.out.println("Enter a pwd criteria");
					pwdc.add(sc.nextLine());
				}
				//data driven test
				for(int i=0;i<c;i++)
				{
					//Launch google site
					System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("http://site24.way2sms.com/content/index.html");
					Thread.sleep(5000);
					driver.findElement(By.name("username")).sendKeys(uid.get(i));
					driver.findElement(By.name("password")).sendKeys(pwd.get(i));
					driver.findElement(By.name("username")).sendKeys(uidc.get(i));
					driver.findElement(By.name("password")).sendKeys(pwd.get(i));
					driver.findElement(By.name("username")).sendKeys(uid.get(i));
					driver.findElement(By.name("password")).sendKeys(pwdc.get(i));
					driver.findElement(By.name("username")).sendKeys(uidc.get(i));
					driver.findElement(By.name("password")).sendKeys(pwdc.get(i));
					driver.findElement(By.id("loginBTN")).click();
					Thread.sleep(5000);
					System.out.println("Test passed");
					//Close site
					driver.close();
				}
	}
}
	
