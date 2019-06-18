package stevejobs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
public class Sikex2 
{
	public static void main(String[] args) throws InterruptedException, FindFailed 
	{
		System.setProperty("webdriver.gecko.driver","D:\\batch229\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.millionclouds.com/");
		Thread.sleep(5000);
		Screen s=new Screen();
		s.highlight(10,"blue");
		Region r=s.create(100, 100, 300, 200);
		r.highlight(10,"green");
		s.wheel(Button.WHEEL_DOWN,4);
	}

}