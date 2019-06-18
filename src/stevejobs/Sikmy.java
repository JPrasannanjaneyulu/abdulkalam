package stevejobs;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Sikmy 
{
	public static void main(String[] args) throws FindFailed, InterruptedException 
	{
		Thread.sleep(5000);
		Screen s=new Screen();
		s.click("min.png");
		s.click("fm.png");
		s.doubleClick("local.png");
		s.doubleClick("movies.png");
		s.rightClick("song.png");
		s.click("open.png");
		s.click("vlc.png");
		s.doubleClick("mark.png");
		s.mouseMove("cursor.png");
		Match m=s.find("vlcbar.png");
		Location l2=new Location(m.getX()+200,m.getY());
		s.dragDrop(m,l2);
		Thread.sleep(15000);
		s.mouseMove("cursor.png");
		Location l3=new Location(m.getX()-100,m.getY());
		s.dragDrop(m,l3);
		Thread.sleep(5000);
		s.rightClick("markk.png");
		s.doubleClick("stop.png");
		s.click("white.png");
		s.click("lose.png");
		s.click("eclipse.png");
	}
}
