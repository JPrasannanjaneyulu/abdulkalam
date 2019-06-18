package stevejobs;

import java.rmi.RemoteException;
import java.util.Scanner;

import stevejobs.CalculatorStub.Add;
import stevejobs.CalculatorStub.AddResponse;

public class Axex1two 
{
	public static void main(String[] args) throws RemoteException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1");
		int x=sc.nextInt();
		System.out.println("Enter input2");
		int y=sc.nextInt();
		//Create object to stub class
		CalculatorStub driver=new CalculatorStub("http://www.dneonline.com/calculator.asmx?WSDL");
		//Create object to request with inputs
		Add r=new Add();
		r.setIntA(x);
		r.setIntB(y);
		//Create object to response via request and stub
		AddResponse res1=driver.add(r);
		System.out.println(res1.localAddResult);
	}

}
