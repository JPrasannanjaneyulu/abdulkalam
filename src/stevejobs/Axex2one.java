package stevejobs;

import java.rmi.RemoteException;
import stevejobs.Live_Sensex_Bse_IndexStub.ArrayOfString;
import stevejobs.Live_Sensex_Bse_IndexStub.GetLiveSensex;
import stevejobs.Live_Sensex_Bse_IndexStub.GetLiveSensexResponse;

public class Axex2one 
{
	public static void main(String[] args) throws RemoteException 
	{
		//Create object to stub class
		Live_Sensex_Bse_IndexStub driver=new Live_Sensex_Bse_IndexStub("http://freewebservicesx.com/live-sensex-bse-index.asmx?WSDL");
		//Create object to request
		GetLiveSensex r=new GetLiveSensex();
		r.setUserName("mindq@gmail.com");
		r.setPassword("mindq");
		//Create object to response
		GetLiveSensexResponse res=driver.getLiveSensex(r);
		ArrayOfString a=res.getGetLiveSensexResult();
		String b[]=a.localString;
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	}

}
