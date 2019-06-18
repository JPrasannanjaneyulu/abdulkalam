package stevejobs;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Jrex2 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException, HeadlessException, UnsupportedFlavorException 
	{
	//Launch calculator
	Runtime.getRuntime().exec("calc.exe");
	Thread.sleep(5000);
	//Put data in to clip-board and paste in calculator
	StringSelection s1=new StringSelection("2789");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	//Perform + Operation
	r.keyPress(KeyEvent.VK_ADD);
	r.keyRelease(KeyEvent.VK_ADD);
	Thread.sleep(5000);
	//Send data to clip-board and paste in calculator
	StringSelection s2=new StringSelection("4565");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2,null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	//Click =
	r.keyPress(KeyEvent.VK_EQUALS);
	r.keyRelease(KeyEvent.VK_EQUALS);
	Thread.sleep(5000);
	//Get output and display
	r.keyPress(KeyEvent.VK_CONTEXT_MENU);
	r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	//Get data from clip-board
	String o=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
	System.out.println(o);
	String x=System.getProperty("os.name");
	System.out.println(x);
	//Close window
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
	}

}

