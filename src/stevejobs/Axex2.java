package stevejobs;

import java.rmi.RemoteException;
import java.util.Scanner;
import stevejobs.Live_Sensex_Bse_IndexStub.ArrayOfString;
import stevejobs.Live_Sensex_Bse_IndexStub.GetLiveSensex;
import stevejobs.Live_Sensex_Bse_IndexStub.GetLiveSensexResponse;

public class Axex2 
{
	public static void main(String[] args) throws RemoteException 
	{
		//Get input data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		String x=sc.nextLine();
		System.out.println("Enter password");
		String y=sc.nextLine();
		//Create object to stub class
		Live_Sensex_Bse_IndexStub driver=new Live_Sensex_Bse_IndexStub("http://freewebservicesx.com/live-sensex-bse-index.asmx?WSDL");
		//Create object to request
		GetLiveSensex r=new GetLiveSensex();
		r.setUserName(x);
		r.setPassword(y);
		//Create object to response
		GetLiveSensexResponse res=driver.getLiveSensex(r);
		ArrayOfString a=res.getGetLiveSensexResult();
		String b[]=a.localString;
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
