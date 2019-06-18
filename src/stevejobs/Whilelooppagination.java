package stevejobs;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whilelooppagination 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		//Launch google site
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(5000);
		//Enter word and click search
		driver.findElement(By.name("q")).sendKeys(x);
		driver.findElement(By.name("btnG")).click();
		Thread.sleep(5000);
		//Pagination
		int c=1;
		try{
			while(driver.findElement(By.xpath("//*[@id='pnnext']/child::*[2]")).isDisplayed())
			{
				c=c+1;
				driver.findElement(By.xpath("//*[@id='pnnext']/child::*[2]")).click();
				Thread.sleep(3000);
			}
		}catch(Exception e)
		{
			System.out.println("Pagination completed");
		}
		System.out.println(c);
		//Close site
		driver.close();
	}

}
