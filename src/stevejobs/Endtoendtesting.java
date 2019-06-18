package stevejobs;

import java.rmi.RemoteException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import stevejobs.Live_Sensex_Bse_IndexStub.ArrayOfString;
import stevejobs.Live_Sensex_Bse_IndexStub.GetLiveSensex;
import stevejobs.Live_Sensex_Bse_IndexStub.GetLiveSensexResponse;

public class Endtoendtesting 
{
	public static void main(String[] args) throws InterruptedException, RemoteException 
	{
		//Launch site and get visible data
		System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.bseindia.com");
		Thread.sleep(5000);
		String val=driver.findElement(By.id("tdsp")).getText();
		String aval=val.replace(",","");
		System.out.println(aval);
		driver.close();
		//Connect to service and get response data
		Live_Sensex_Bse_IndexStub stub=new Live_Sensex_Bse_IndexStub("http://freewebservicesx.com/live-sensex-bse-index.asmx?WSDL");
		GetLiveSensex r=new GetLiveSensex();
		r.setUserName("mindq@gmail.com");
		r.setPassword("mindq");
		GetLiveSensexResponse res=stub.getLiveSensex(r);
		ArrayOfString a=res.getGetLiveSensexResult();
		String b[]=a.localString;
		String eval=b[0];
		System.out.println(eval);
		//End-to-End testing
		if(aval.equals(eval))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
	}

}
