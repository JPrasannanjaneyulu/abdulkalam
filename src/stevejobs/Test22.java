package stevejobs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/A._P._J._Abdul_Kalam");
		Thread.sleep(5000);
		List<WebElement> l=driver.findElements(By.tagName("a"));
		System.out.println("Link tag:  "+l.size());
		System.out.println("Link tag:  "+l);
		List<WebElement> m=driver.findElements(By.tagName("img"));
		System.out.println("Image tag: "+m.size());
		System.out.println("Image tag: "+m);
		List<WebElement> n=driver.findElements(By.tagName("table"));
		System.out.println("Table tag: "+n.size());
		System.out.println("Table tag: "+n);
		List<WebElement> o=driver.findElements(By.tagName("b"));
		System.out.println("Bold tag: "+o.size());
		System.out.println("Bold tag: "+o);
		List<WebElement> p=driver.findElements(By.tagName("tr"));
		System.out.println("Row tag: "+p.size());
		System.out.println("Row tag: "+p);
		List<WebElement> q=driver.findElements(By.tagName("td"));
		System.out.println("Column tag: "+q.size());
		System.out.println("Column tag: "+q);
		List<WebElement> r=driver.findElements(By.tagName("select"));
		System.out.println("Dropdown tag: "+r.size());
		System.out.println("Dropdown tag: "+r);
		List<WebElement> s=driver.findElements(By.tagName("button"));
		System.out.println("Button tag: "+s.size());
		System.out.println("Button tag: "+s);
		List<WebElement> t=driver.findElements(By.tagName("span"));
		System.out.println("Plain text tag: "+t.size());
		System.out.println("Plain text tag: "+t);
		List<WebElement> u=driver.findElements(By.tagName("input"));
		System.out.println("Input tag: "+u.size());
		System.out.println("Input tag: "+u);
		List<WebElement> v=driver.findElements(By.tagName("i"));
		System.out.println("Italic tag: "+v.size());
		System.out.println("Italic tag: "+v);
		List<WebElement> w=driver.findElements(By.tagName("iframe"));
		System.out.println("Frame tag: "+w.size());
		System.out.println("Frame tag: "+w);
		List<WebElement> x=driver.findElements(By.tagName("div"));
		System.out.println("Ajax controls tag: "+x.size());
		System.out.println("Ajax controls tag: "+x);
		Thread.sleep(5000);
		driver.close();
	}

}
