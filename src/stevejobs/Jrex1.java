package stevejobs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Jrex1 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException 
	{
	//Launch note-pad
	Runtime.getRuntime().exec("notepad.exe");
	Thread.sleep(5000);
	//Send data to clip-board and then paste in note-pad
	StringSelection s1=new StringSelection("mother and father");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	//Choose save option
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_S);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	//Save file
	StringSelection s2=new StringSelection("D:\\batch229\\notepad\\myself.txt");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2,null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	//Close window
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
	}

}
