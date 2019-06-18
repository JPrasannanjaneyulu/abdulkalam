package stevejobs;

import java.util.ArrayList;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicarray 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Get multiple data from keyboard
		ArrayList<String> x=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count of data");
		int c=Integer.parseInt(sc.nextLine());
		for(int i=0;i<c;i++)
		{
			System.out.println("Enter a word");
			x.add(sc.nextLine());
		}
		//data driven test
		for(int i=0;i<c;i++)
		{
			//Launch google site
			System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in");
			Thread.sleep(5000);
			//Enter that word for search
			driver.findElement(By.name("q")).sendKeys(x.get(i));
			driver.findElement(By.name("btnG")).click();
			Thread.sleep(5000);
			System.out.println("Test passed");
			//Close site
			driver.close();
		}
	}

}
