package stevejobs;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Sikex1 
{
	public static void main(String[] args) throws InterruptedException, FindFailed, IOException 
	{
		//Launch site(SWD)
				System.setProperty("webdriver.chrome.driver","D:\\batch229\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://www.youtube.com");
				Thread.sleep(5000);
				//Search required video(SWD)
				driver.findElement(By.name("search_query")).sendKeys("bajrangi bhaijaan video songs");
				driver.findElement(By.id("search-btn")).click();
				Thread.sleep(5000);
				//Click on video link(SWD)
				driver.findElement(By.partialLinkText("Tu Jo Mila' VIDEO Song - K.K.")).click();
				Thread.sleep(15000);
				//Move mouse pointer to video(SWD)
				Screen s=new Screen();
				Location l=new Location(100,200);
				s.wheel(l,Button.LEFT,0);
				//Pause video(SIKULI)
				s.click("pause.png");
				Thread.sleep(15000);
				//Move mouse pointer to video & play video(SIKULI)
				s.wheel(l,Button.LEFT,0);
				s.click("play.png");
				Thread.sleep(5000);
				//Move mouse to video & Decrease volume(SIKULI)
				s.wheel(l,Button.LEFT,0);
				s.mouseMove("volume.png");
				Match e=s.find("bar.png");
				Location el1=new Location(e.getX()-10,e.getY());
				s.dragDrop(e,el1);
				Thread.sleep(15000);
				//Move mouse to video & Increase volume(SIKULI)
				s.wheel(l,Button.LEFT,0);
				s.mouseMove("volume.png");
				Location el2=new Location(e.getX()+10,e.getY());
				s.dragDrop(e,el2);
				Thread.sleep(15000);
				//Move mouse to video & Maximize screen(SIKULI)
				s.wheel(l,Button.LEFT,0);
				s.click("maximize.png");
				Thread.sleep(15000);
				//Move mouse to video & Minimize screen(SIKULI)
				s.wheel(l,Button.LEFT,0);
				s.click("minimize.png");
				Thread.sleep(15000);
				//Get full screen capture
				ScreenImage si=s.capture();
				BufferedImage bi=si.getImage();
				File f1=new File("D:\\batch229\\fullscreen.png");
				ImageIO.write(bi,"png",f1);
				//Get region of screen capture
				Region r=new Region(12,336,854,480);
				ScreenImage sri=s.capture(r);
				BufferedImage bri=sri.getImage();
				File f2=new File("D:\\batch229\\region.png");
				ImageIO.write(bri,"png",f2);
				//Close site(SIKULI)
				s.keyDown(Key.ALT);
				s.keyDown(Key.F4);
				s.keyUp(Key.F4);
				s.keyUp(Key.ALT);
	}

}
