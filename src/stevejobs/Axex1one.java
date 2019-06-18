package stevejobs;

import java.rmi.RemoteException;

import stevejobs.CalculatorStub.Add;
import stevejobs.CalculatorStub.AddResponse;

public class Axex1one 
{
	public static void main(String[] args) throws RemoteException 
	{
		//Create object to stub class
		CalculatorStub driver=new CalculatorStub("http://www.dneonline.com/calculator.asmx?WSDL");
		//Create object to request with inputs
		Add r=new Add();
		r.setIntA(10);
		r.setIntB(20);
		//Create object to response via request and stub
		AddResponse res1=driver.add(r);
		System.out.println(res1.getAddResult());
	}

}
