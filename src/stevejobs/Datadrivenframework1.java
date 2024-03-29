package stevejobs;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivenframework1 
{
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, InterruptedException, BiffException 
	{
		//Open excel file for read
		File f=new File("Testdata1.xls");
		Workbook rwb=Workbook.getWorkbook(f);
		Sheet rsh=rwb.getSheet(0);//0 means sheet1
		int nor=rsh.getRows();//used rows count
		//Open same excel for write
		WritableWorkbook wwb=Workbook.createWorkbook(f,rwb);
		WritableSheet wsh=wwb.getSheet(0);
		//Data driven from 1st(2nd row) to last row
		for(int i=1; i<nor; i++)
		{
			String x=rsh.getCell(0,i).getContents();
			//Launch google site
			System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in");
			Thread.sleep(5000);
			//Enter word for search
			driver.findElement(By.name("q")).sendKeys(x);
			driver.findElement(By.name("btnG")).click();
			Thread.sleep(5000);
			String y=driver.getTitle();
			if(y.contains(x))
			{
				Label l=new Label(1,i,"Test passed");
				wsh.addCell(l);
			}
			else
			{
				Label l=new Label(1,i,"Test failed");
				wsh.addCell(l);
			}
			//Close site
			driver.close();
		}
		wwb.write();//save changes in excel
		wwb.close();
		rwb.close();
	}

}
